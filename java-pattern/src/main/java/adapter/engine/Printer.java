/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.engine;

/**
 *
 * @author eko
 */
public class Printer {

    public void doPrint(Printable printable) {
        if (null != printable) {
            System.out.println("Printing => " + printable.printing());
        }
    }
}
