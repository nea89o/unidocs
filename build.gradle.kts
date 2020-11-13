import com.romangraef.uni.PandocTask


val runPandocHtml by tasks.creating(PandocTask::class) {
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
val runPandocPdf by tasks.creating(PandocTask::class) {
  description = "Generates all pdfs from markdown"
  group = "build"
  toExtension = "pdf"
  inputDir.set(file("src"))
  outputDir.set(file("$buildDir/dist"))
  extraArgs.set(listOf(
      "--mathjax",
      "--standalone",
      "-t",
      "pdf",
      "-f",
      "markdown+tex_math_dollars"
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
        if(it.name != "index.html")
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
    include("**/*.png")
}
val build by tasks.creating {
    description = "Fully builds build/dist"
    group = "build"
}

build.dependsOn(copyPdfs)
build.dependsOn(runPandocHtml)
build.dependsOn(runPandocPdf)
generateIndex.dependsOn(copyPdfs)
generateIndex.dependsOn(runPandocHtml)
generateIndex.dependsOn(runPandocPdf)
build.dependsOn(generateIndex)

val clean by tasks.creating {
    description = "Cleans up all build files"
    group = "build"
    doLast {
        file(buildDir).delete()
    }
}
