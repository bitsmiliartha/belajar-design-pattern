<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace app\adapter\adaptee;

/**
 * Description of CarInfo
 *
 * @author eko
 */
class CarInfo {

    private $brand;
    private $model;
    private $year;

    function __construct(string $brand, string $model, int $year) {
        $this->brand = $brand;
        $this->model = $model;
        $this->year = $year;
    }

    public function toString() {
        return "(brand: $this->brand, model: $this->model, year: $this->year)";
    }

}
