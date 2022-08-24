function Validate_ul (){
    if (document.getElementById("inn").value.length === 0){
        document.getElementById("inn").value = 'val';
    }
    if (document.getElementById("ogrn").value.length === 0){
        document.getElementById("ogrn").value = 'val';
    }
    if (document.getElementById("poln_naim").value.length === 0){
        document.getElementById("poln_naim").value = 'val';
    }
    if (document.getElementById("ur_addr").value.length === 0){
        document.getElementById("ur_addr").value = 'val';
    }
    if (document.getElementById("pocht_adres").value.length === 0){
        document.getElementById("pocht_adres").value = 'val';
    }
    if (document.getElementById("phone").value.length === 0){
        document.getElementById("phone").value = 'val';
    }
    if (document.getElementById("email").value.length === 0){
        document.getElementById("email").value = 'val';
    }
    if (document.getElementById("ogrnip").value.length === 0){
        document.getElementById("ogrnip").value = 'val';
    }
    if (document.getElementById("famil").value.length === 0){
        document.getElementById("famil").value = 'val';
    }
    if (document.getElementById("name").value.length === 0){
        document.getElementById("name").value = 'val';
    }
    if (document.getElementById("otch").value.length === 0){
        document.getElementById("otch").value = 'val';
    }
    if (document.getElementById("snils").value.length === 0){
        document.getElementById("snils").value = 'val';
    }
    if (document.getElementById("reg_nomer_au").value.length === 0){
        document.getElementById("reg_nomer_au").value = 'val';
    }
    if (document.getElementById("ogl").value.length === 0){
        document.getElementById("ogl").value = 'val';
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
            unn: document.getElementById("inn").value,
            code_ogrn: document.getElementById("ogrn").value,
            poln_naim: document.getElementById("poln_naim").value,
            qr_adrs: document.getElementById("ur_addr").value,
            pocht_adres: document.getElementById("pocht_adres").value,
            telephon: document.getElementById("phone").value,
            email: document.getElementById("email").value,
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
