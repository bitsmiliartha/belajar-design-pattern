<?php

namespace app\builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of HtmlPage
 *
 * @author eko
 */
class HtmlPage {

    private $title;
    private $heading;
    private $bodyText;

    function __construct($title, $heading, $bodyText) {
        $this->title = $title;
        $this->heading = $heading;
        $this->bodyText = $bodyText;
    }

    public function setTitle(string $title) {
        $this->title = $title;
    }

    public function setHeading(string $heading) {
        $this->heading = $heading;
    }

    public function setBodyText(string $bodyText) {
        $this->bodyText .= $bodyText;
    }

    function getTitle() {
        return $this->title;
    }

    function getHeading() {
        return $this->heading;
    }

    function getBodyText() {
        return $this->bodyText;
    }

}
