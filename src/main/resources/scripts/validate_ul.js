function Validate_ul (){
    if (document.getElementById("inn").value.length === 0){
        document.getElementById("inn").style.borderColor = 'red';
    }
    if (document.getElementById("ogrn").value.length === 0){
        document.getElementById("ogrn").style.borderColor = 'red';
    }
    if (document.getElementById("poln_naim") === null){}
    else if (document.getElementById("poln_naim").value.length === 0){
        document.getElementById("poln_naim").style.borderColor = 'red';
    }
    if (document.getElementById("ur_addr") === null){}
    else if (document.getElementById("ur_addr").value.length === 0){
        document.getElementById("ur_addr").style.borderColor = 'red';
    }
    if (document.getElementById("pocht_adres").value.length === 0){
        document.getElementById("pocht_adres").style.borderColor = 'red';
    }
    if (document.getElementById("phone").value.length === 0){
        document.getElementById("phone").style.borderColor = 'red';
    }
    if (document.getElementById("email").value.length === 0){
        document.getElementById("email").style.borderColor = 'red';
    }
    if (document.getElementById("ogrnip") === null){}
    else if (document.getElementById("ogrnip").value.length === 0){
        document.getElementById("ogrnip").style.borderColor = 'red';
    }
    if (document.getElementById("famil") === null){}
    else if (document.getElementById("famil").value.length === 0){
        document.getElementById("famil").style.borderColor = 'red';
    }
    if (document.getElementById("name") === null){}
    else if (document.getElementById("name").value.length === 0){
        document.getElementById("name").style.borderColor = 'red';
    }
    if (document.getElementById("otch") === null){}
    else if (document.getElementById("otch").value.length === 0){
        document.getElementById("otch").style.borderColor = 'red';
    }
    if (document.getElementById("snils") === null){}
    else if (document.getElementById("snils").value.length === 0){
        document.getElementById("snils").style.borderColor = 'red';
    }
    if (document.getElementById("reg_nomer_au") === null){}
    else if (document.getElementById("reg_nomer_au").value.length === 0){
        document.getElementById("reg_nomer_au").style.borderColor = 'red';
    }
    if (document.getElementById("form8").value.length === 0){
        document.getElementById("form8").style.borderColor = 'red';
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
            ogrnip: document.getElementById("ogrnip").value,
            famil: document.getElementById("famil").value,
            name: document.getElementById("name").value,
            otch: document.getElementById("otch").value,
            snils: document.getElementById("snils").value,
            reg_nomer_au: document.getElementById("reg_nomer_au").value,

            reg_date: Date
        };

        $.post("http://localhost:8080/Servlets_Web_exploded/", user, function(){
            console.log(user);
        });
    }
}
