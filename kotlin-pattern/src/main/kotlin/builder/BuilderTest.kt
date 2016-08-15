package builder

fun main(args: Array<String>) {
    val htmlPage = HtmlPage.Builder()
            .title("Hola Kotlin")
            .heading("This is kotlin html page")
            .body("Ini kotlin body 1")
            .body("Ini kotlin body 2")
            .build()

    htmlPage.showPage()
}
