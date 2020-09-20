<?php

    $dsn="mysql:host=locallhost;dbname=dbtest";
    $user="root";
    $pass="";


    try{
        $db=new PDO($dsn,$user,$pass);
        
    }
    catch{
        echo "Bağlantı hatası" . $e->getMessage();
    }

?>