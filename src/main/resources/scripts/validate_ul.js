function Validate_ul (){
    if (document.getElementById("form1").value.length === 0){
        document.getElementById("form1").value = 'val';
    }
    if (document.getElementById("form2").value.length === 0){
        document.getElementById("form2").value = 'val';
    }
    if (document.getElementById("form3").value.length === 0){
        document.getElementById("form3").value = 'val';
    }
    if (document.getElementById("form4").value.length === 0){
        document.getElementById("form4").value = 'val';
    }
    if (document.getElementById("form5").value.length === 0){
        document.getElementById("form5").value = 'val';
    }
    if (document.getElementById("form6").value.length === 0){
        document.getElementById("form6").value = 'val';
    }
    if (document.getElementById("form7").value.length === 0){
        document.getElementById("form7").value = 'val';
    }
    if (document.getElementById("form8").value.length === 0){
        document.getElementById("form8").value = 'val';
    }
    else if (document.getElementById("check1").checked === false || document.getElementById("check2").checked === false || document.getElementById("check3").checked === false){
        alert("check error");
    }
    else {
        let user = {
            type_users: "Участник",
            role_users: "ЮЛ",
            unn: document.getElementById("form1").value,
            code_ogrn: document.getElementById("form2").value,
            poln_naim: document.getElementById("form3").value,
            qr_adrs: document.getElementById("form4").value,
            pocht_adres: document.getElementById("form5").value,
            telephon: document.getElementById("form6").value,
            email: document.getElementById("form7").value,
            reg_date: Date
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
