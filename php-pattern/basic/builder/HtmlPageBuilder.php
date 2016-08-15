<?php

namespace app\builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//namespace Builder;

/**
 * Description of HtmlPageBuilder
 *
 * @author eko
 */
class HtmlPageBuilder {

    private $title;
    private $heading;
    private $bodyText;

    public function __construct() {
        
    }

    public function title(string $title) {
        $this->title = $title;

        return $this;
    }

    public function heading(string $heading) {
        $this->heading = $heading;

        return $this;
    }

    public function body(string $bodyText) {
        $this->bodyText .= $bodyText;

        return $this;
    }

    public function build() {
        return new HtmlPage($this->title, $this->heading, $this->bodyText);
    }

}
