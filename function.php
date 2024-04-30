<?php
$a=array(1,2,3,45,6,7,8,90);

function add($a){
    rsort($a);
    for($i=0;$i<count($a);$i++){
        echo( $a[$i]."\n");
    }
}
add($a);

?>