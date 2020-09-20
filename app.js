$ (document).ready(function(){
    $.ajax({
        type:"POST",
        url: "ajax.php",
        success:function(sonuc){
            alert(sonuc);
        }
    });
});