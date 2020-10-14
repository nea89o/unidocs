package com.romangraef.uni

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileType
import org.gradle.api.provider.ListProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.ChangeType
import org.gradle.work.Incremental
import org.gradle.work.InputChanges
import java.io.File

abstract class PandocTask : DefaultTask() {

	@get:Incremental
	@get:PathSensitive(PathSensitivity.RELATIVE)
	@get:InputDirectory
	abstract val inputDir: DirectoryProperty

	@get:OutputDirectory
	abstract val outputDir: DirectoryProperty

	@get:Input
	var pandocExecutable = "pandoc"

	@get:Input
	abstract val extraArgs: ListProperty<String>

	@TaskAction
	fun execute(inputChanges: InputChanges) {
		inputChanges.getFileChanges(inputDir).forEach { change ->
			if (change.fileType == FileType.DIRECTORY) return@forEach
			val target = outputDir.file(change.normalizedPath).get().asFile.run {
				if(extension == "md")
				File(parent, "$nameWithoutExtension.html")
				else 
				null
			} ?: return@forEach
			if (change.changeType == ChangeType.REMOVED) {
				target.delete()
			} else {
				runPandoc(change.file, target)
			}
		}
	}

	private fun getArgs(from: File, to: File) = arrayOf<String>(
		pandocExecutable,
		from.absolutePath,
		"-o",
		to.absolutePath,
		*extraArgs.get().toTypedArray()
	)


	private fun runPandoc(from: File, to: File) {
		val args = getArgs(from, to)
		println("Executing ${args.toList()}")
		to.parentFile.mkdirs()
		Runtime.getRuntime().exec(args).waitFor()
	}
}