<?php

namespace app\adapter;

use app\adapter\adaptee\CarInfo;
use app\adapter\engine\Printable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of CarInfoAdapter
 *
 * @author eko
 */
class CarInfoAdapter implements Printable {

    private $carInfo;

    function __construct(CarInfo $carInfo) {
        $this->carInfo = $carInfo;
    }

    public function printing() {
        echo $this->carInfo->toString();
    }

}
