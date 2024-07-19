<?php
// $a=10;//int
// $b="hello";//string
// $c=2.5;//float
// $d="true";//boolean
// $e=array(0,1,2,3,4);//array
// $f=NULL;//null
// class id{
//     public $a,$b;
//     function add($a,$b){
//         echo $a+$b;
//     }
// }
// $c=new id();
// $c->add(10,5);
$a=50;
$i=0;
$b=0;
for($i=1;$i<=$a;$i++){
    if($i%2==0){
        $b=$i+$b;
        echo("even numbers".$b);
    }
   
}
echo("even numbers".$b);


?>