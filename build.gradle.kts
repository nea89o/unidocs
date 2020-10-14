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
val clean by tasks.creating{
    description = "Cleans up all build files"
    group = "build"
    doLast {
        file(buildDir).delete()
    }
}