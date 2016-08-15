package builder

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

  @author eko
  Created on Aug 15, 2016
*/

data class HtmlPage(val title: String, val heading: String, val bodyText: StringBuilder) {
    override fun toString(): String {
        return """
        <html>
            <head><title>$title</title></head>
            <body>
                <h1>$heading</h1>

                ${bodyText.toString()}
            </body>
        </html>
        """
    }

    fun showPage() = println(this)

    class Builder {

        private lateinit var title: String
        private lateinit var heading: String
        private val bodyText by lazy {
            StringBuilder()
        }

        fun title(title: String): Builder {
            this.title = title

            return this
        }

        fun heading(heading: String): Builder {
            this.heading = heading

            return this
        }

        fun body(bodyText: String): Builder {
            this.bodyText.append(bodyText).append("\n");

            return this
        }

        fun build() = HtmlPage(title, heading, bodyText)
    }
}