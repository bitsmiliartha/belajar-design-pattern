/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author eko
 */
public class HtmlPage {

    private final String title;
    private final String heading;
    private final StringBuilder bodyText;

    public HtmlPage(String title, String heading, StringBuilder bodyText) {
        this.title = title;
        this.heading = heading;
        this.bodyText = bodyText;
    }

    public void showPage() {
        System.out.println("<html>");
        System.out.println(String.format("<head><title>%s</title></head>", title));
        System.out.println("<body>");
        System.out.println(String.format("<h1>%s</h1>", heading));
        System.out.println("<br/>");
        System.out.println(null != bodyText ? bodyText.toString() : "");
        System.out.println("</body>");
        System.out.println("</html>");
    }

    public static final class Builder {

        private String title;
        private String heading;
        private StringBuilder bodyText;

        public Builder() {
        }

        public Builder title(String title) {
            this.title = title;

            return this;
        }

        public Builder heading(String heading) {
            this.heading = heading;

            return this;
        }

        public Builder body(String bodyText) {
            if (null == this.bodyText) {
                this.bodyText = new StringBuilder();
            }

            this.bodyText.append(bodyText).append("\n");

            return this;
        }

        public HtmlPage build() {
            return new HtmlPage(title, heading, bodyText);
        }
    }
}
