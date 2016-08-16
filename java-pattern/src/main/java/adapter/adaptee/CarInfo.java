/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.adaptee;

/**
 *
 * @author eko
 */
public class CarInfo {

    private final String brand;
    private final String model;
    private final int year;

    public CarInfo(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("(brand: %s, model: %s, year: %d)", brand, model, year);
    }

}
