/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.adaptee.CarInfo;
import adapter.engine.Printer;

/**
 *
 * @author eko
 */
public class AdapterTest {

    public static void main(String[] args) {

        final Printer printer = new Printer();
        printer.doPrint(new CarInfoAdapter(new CarInfo("Toyota", "Innova", 2015)));
    }
}
