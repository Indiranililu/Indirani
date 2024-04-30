<?php
$a=readline("Enter the number A:");
$b=readline("Enter the number B:");
$c=readline("Enter the number c:");
if($a>$b&&$a>$c){
    echo("A is greater");
}
elseif($b>$a&&$b>$c){
    echo("B is greater");
}else if($c>$b&&$c>$a){
    echo("C is gerater");

}else{
    echo(" some value is same");

}



?>
