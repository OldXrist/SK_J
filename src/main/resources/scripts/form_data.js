function Validate (){
    for (let i = 1; i <= 8; i++){
        if (document.getElementById("form" + i).value.length === 0){
            alert("error");
        }
    }
    if (document.getElementById("check1").checked === false || document.getElementById("check2").checked === false || document.getElementById("check3").checked === false){
        alert("check error");
    }
}