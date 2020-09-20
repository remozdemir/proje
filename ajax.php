<?php
    include=$db->query("SELECT * FROM variable");
    $count=$sql->rowCount();
    if($count>0){
        echo "<ul>";
        foreach($sql as $row){
            echo $row[ ]
        }
        echo "</ul>"
    }