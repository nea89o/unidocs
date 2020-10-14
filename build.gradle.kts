import com.romangraef.uni.PandocTask


tasks.register<PandocTask>("runPandoc") {
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
