function Validate (){
    for (let i = 1; i <= 8; i++){
        if (document.getElementById("form" + i).value.length === 0){
            alert("error");
        }
    }
    if (document.getElementById("check1").checked === false || document.getElementById("check2").checked === false || document.getElementById("check3").checked === false){
        alert("check error");
    }
    else {
        let formData = new FormData;
        formData.append("INN", document.getElementById("form1").value);
        formData.append("OGRN", document.getElementById("form2").value);
        formData.append("FULL_NAME", document.getElementById("form3").value);
        formData.append("U_ADDRESS", document.getElementById("form4").value);
        formData.append("ZIP", document.getElementById("form5").value);
        formData.append("PHONE", document.getElementById("form6").value);
        formData.append("EMAIL", document.getElementById("form7").value);
        $.ajax({
            url: "http://localhost:63342/SK_J/reg_uchastnikov/reg_ql.html",
            method: "post",
            data: "formData",
            error: function() {
                console.log("error");
            },
            success: function() {
                console.log("pobeda");
            }

        });
    }
}