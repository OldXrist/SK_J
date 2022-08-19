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
        let formData = [
            document.getElementById("form1").value,
            document.getElementById("form2").value,
            document.getElementById("form3").value,
            document.getElementById("form4").value,
            document.getElementById("form5").value,
            document.getElementById("form6").value,
            document.getElementById("form7").value
        ];
        $.ajax({
            url: "http://localhost:63342/SK_J/reg_uchastnikov/reg_ql.html?_ijt=dfuq1474eqfttq7a4ud3k8v9rf/UL_Servlet",
            method: "get",
            data: 'formData',
            error: function() {
                console.log("error");
            },
            success: function() {
                console.log(formData);
            }
        });
    }
}
