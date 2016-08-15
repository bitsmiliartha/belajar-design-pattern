<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace app\controllers;

use yii\web\Controller;
use app\builder\HtmlPageBuilder;

/**
 * Description of BuilderController
 *
 * @author eko
 */
class BuilderController extends Controller {

    public function actionIndex() {
        $htmlPageBuilder = new HtmlPageBuilder();
        $htmlPage = $htmlPageBuilder
                ->title("Hola PHP")
                ->heading("This is php html page")
                ->body("ini php body 1<br/>")
                ->body("ini php body 2</br>")
                ->build();

        return $this->render("index", [
                    'model' => $htmlPage
        ]);
    }

}
