<?php
class Cons{
    public $name,$age;
    public $student=[];
    public function __construct(){
        echo("hai my frd");
    }
    public function __set($name,$value){
        // $this->name=$value;
        $this->student[$name=$value];
    }
    public function __get($name){
        // if($name=="name"){
            return $this->name;
        

    }
    
}

$a=new Cons();
$a->name="indhu";
$a->name;
echo $a->name;


?>