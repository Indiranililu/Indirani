<?php
class Calculator{
    public $a,$b;

    function add($a,$b){
     echo("add =".$a+$b."\n");
    }
    function sub($a,$b){
        echo("sub =".$a-$b."\n");
    }
    function mul($a,$b){
        echo("mul =".$a*$b."\n");
    }
    function div($a,$b){
        echo("div =".$a/$b."\n");
    }

}
class Scientificcalculator extends Calculator{
    public $s,$q;
    function pow($s,$q){
        echo("power =".pow($s,$q)."\n");
    }
    function square($s){
        echo("square =".($s**2)."\n");
    }
    function sqrt($s){
        echo("sqrt =".sqrt($s)."\n");
    }
    function random($s,$q){
        echo("random =".rand($s,$q)."\n");
    }
    function round($s){
        echo("round =".round($s)."\n");
    }
    function floor($s){
        echo("floor =".floor($s)."\n");
    }

}
class Mathematicscalculator extends Scientificcalculator{
    public $s,$i;
    function sin($s){
        echo("sin =".sin($s)."\n");
    }
    function cos($i){
        echo("cos =".cos($i)."\n");
    }
    function tan($s){
        echo("tan =".tan($s)."\n");
    }
    function log($i){
        echo("log =".log($i)."\n");
    }

}

// $e = new Scientificcalculator();
// $e->pow(2,4);
// $e->square(4);
// $e->sqrt(64);
// $e->random(1,50);
// $e->round(0.60);
// $e->floor(8.6565);
// $e->add(2,4);
// $e->sub(30,40);
// $e->mul(2,50);
// $e->div(5,2);
$f=new Mathematicscalculator();
$f->pow(2,4);
$f->square(4);
$f->sqrt(64);
$f->random(1,50);
$f->round(0.60);
$f->floor(8.6565);
$f->add(2,4);
$f->sub(30,40);
$f->mul(2,50);
$f->div(5,2);
$f->sin(2);
$f->cos(3);
$f->tan(15);
$f->log(1);


// $c->mul(30,40);
// $c->div(30,40);
// c is a object
// echo("first object:\n");
// $c=new calculator();
// $c->add(30,40);
// $c->sub(30,40);
// $c->mul(30,40);
// $c->div(30,40);
// echo("second object:\n");
// $d=new calculater();
// $d->add(20,10);
// $d->sub(20,10);
// $d->mul(20,10);
// $d->div(20,10);





