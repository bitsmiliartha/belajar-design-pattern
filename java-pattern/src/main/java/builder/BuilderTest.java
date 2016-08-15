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
public class BuilderTest {

    public static void main(String[] args) {
        final HtmlPage htmlPage = new HtmlPage.Builder()
                .title("Hola Java")
                .heading("This is java html page")
                .body("ini java body 1")
                .body("ini java body 2")
                .build();
        
        htmlPage.showPage();
    }
}
