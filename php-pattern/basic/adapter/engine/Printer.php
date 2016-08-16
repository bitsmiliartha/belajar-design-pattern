<?php

namespace app\adapter\engine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Printer
 *
 * @author eko
 */
class Printer {

    public function doPrint(Printable $printable) {
        echo $printable->printing();
    }

}
