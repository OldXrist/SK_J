function selectOnlyThis(id) {
    for (let i = 1;i <= 7; i++){
        document.getElementById("check" + i).checked = false;
    }

    const links = ["reg_uchastnikov/reg_ql.html", "reg_uchastnikov/reg_ip.html", "reg_uchastnikov/reg_fl.html", "reg_organizatorov/reg_org_ql.html", "reg_organizatorov/reg_org_ip.html", "reg_organizatorov/reg_org_fl.html", "reg_organizatorov/reg_org_ay.html"]

    document.getElementById(id).checked = true;

    for (let i = 1; i <= 7; i++){
        if (id == "check" + i){
            document.getElementById("next").href = links[i-1];
        }
    }
}

