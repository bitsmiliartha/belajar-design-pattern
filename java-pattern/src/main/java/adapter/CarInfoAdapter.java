/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.adaptee.CarInfo;
import adapter.engine.Printable;

/**
 *
 * @author eko
 */
public class CarInfoAdapter implements Printable {

    private final CarInfo carInfo;

    public CarInfoAdapter(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String printing() {
        if (null != carInfo) {
            return carInfo.toString();
        }

        return "No object to be printed";
    }

}
