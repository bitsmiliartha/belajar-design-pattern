<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace app\controllers;

use yii\web\Controller;
use app\adapter\engine\Printer;
use app\adapter\CarInfoAdapter;
use app\adapter\adaptee\CarInfo;

/**
 * Description of AdapterController
 *
 * @author eko
 */
class AdapterController extends Controller {

    public function actionIndex() {
        $printer = new Printer();

        $adapter = new CarInfoAdapter(new CarInfo("Toyota", "Innova", 2015));

        return $this->render("index", [
                    'printer' => $printer,
                    'adapter' => $adapter,
        ]);
    }

}
