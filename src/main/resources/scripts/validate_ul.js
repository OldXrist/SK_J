function Validate_ul (){
    if (document.getElementById("form1").value.length === 0){
        document.getElementById("form1").value = 'error';
    }
    if (document.getElementById("form2").value.length === 0){
        document.getElementById("form2").value = 'error';
    }
    if (document.getElementById("form3").value.length === 0){
        document.getElementById("form3").value = 'error';
    }
    if (document.getElementById("form4").value.length === 0){
        document.getElementById("form4").value = 'error';
    }
    if (document.getElementById("form5").value.length === 0){
        document.getElementById("form5").value = 'error';
    }
    if (document.getElementById("form6").value.length === 0){
        document.getElementById("form6").value = 'error';
    }
    if (document.getElementById("form7").value.length === 0){
        document.getElementById("form7").value = 'error';
    }
    if (document.getElementById("form8").value.length === 0){
        document.getElementById("form8").value = 'error';
    }
    else if (document.getElementById("check1").checked === false || document.getElementById("check2").checked === false || document.getElementById("check3").checked === false){
        alert("check error");
    }
    else {
        let user = {
            inn: document.getElementById("form1").value,
            ogrn: document.getElementById("form2").value,
            fname: document.getElementById("form3").value,
            uaddress: document.getElementById("form4").value,
            zip: document.getElementById("form5").value,
            phone: document.getElementById("form6").value,
            email: document.getElementById("form7").value
        };

        let json = JSON.stringify(user);

        $.post("http://localhost:8080/Servlets_Web_exploded/", user, function(){
            console.log(user);
        });

/*
старый скрипт
        $.ajax({
            url: "http://localhost:8080/Servlets_Web_exploded/",
            data: "user",
            method: "post",
            success: function () {
                console.log(this.data)
            },
            error: function () {
                console.log("error")
            }
        });

 */
    }
}
