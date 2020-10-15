import com.romangraef.uni.PandocTask


val runPandoc by tasks.creating(PandocTask::class) {
    description = "Generates all htmls from markdown"
    group = "build"
    inputDir.set(file("src"))
    outputDir.set(file("$buildDir/dist"))
    extraArgs.set(listOf(
        "--mathjax",
        "--standalone",
        "-t",
        "html5",
        "-f",
        "markdown+tex_math_dollars",
        "-H",
        file("inject_header.html").absolutePath
    ))
}

fun genIndexes(folder: File) {
    val indexFile = File(folder, "index.html")
    var listing = """
    <!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="generator" content="pandoc">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">
  <meta name="author" content="Roman Gräf">
  <title>${folder.name} - Directory Listing</title>"""+file("inject_header.html").readText()+"""
  </head>
  <body><ul>"""
    folder.listFiles().forEach {
        if (it.isDirectory) {
            genIndexes(it)
        }
        listing += "<li><a href=\"${it.name}\">${it.name}</a></li>"
    }
    indexFile.writeText(listing +"</ul></body></html>")
}

val generateIndex by tasks.creating {
    doLast {
        genIndexes(file("$buildDir/dist"))
    }
}
val copyPdfs by tasks.creating(Copy::class) {
    description = "Copies all pdfs to the dist"
    group = "build"
    from("src")
    into("$buildDir/dist")
    include("**/*.pdf")
}
val build by tasks.creating {
    description = "Fully builds build/dist"
    group = "build"
}

build.dependsOn(copyPdfs)
build.dependsOn(runPandoc)
generateIndex.dependsOn(copyPdfs)
generateIndex.dependsOn(runPandoc)

build.dependsOn(generateIndex)
val clean by tasks.creating{
    description = "Cleans up all build files"
    group = "build"
    doLast {
        file(buildDir).delete()
    }
}