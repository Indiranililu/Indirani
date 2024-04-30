<?php
$arr=array("Name"=>"indhu","Age"=>"25","gender"=>"female");
$arr["Name"]="lilu";
echo($arr["Name"]);
// var_dump($arr);
// loop array
foreach($arr  as $a=>$b){
    // echo("$a:$b"."\n");
}
$a=array(0,1,2,5,4,5,6);
for($i=0;$i<count($a);$i++){
    echo($a[$i]."\n");
}
?>