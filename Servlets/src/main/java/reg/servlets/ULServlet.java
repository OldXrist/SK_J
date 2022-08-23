package reg.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.*;

@WebServlet("/")
public class ULServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\manager\\Desktop\\SK_J\\Servlets\\src\\main\\popa.txt", StandardCharsets.UTF_8);
        String type_users = req.getParameter("type_users");
        pw.println(type_users);
        String role_users = req.getParameter("role_users");
        pw.println(role_users);
        String unn = req.getParameter("unn");
        pw.println(unn);
        String snils = req.getParameter("snils");
        pw.println(snils);
        String reg_nomer_ay = req.getParameter("reg_nomer_ay");
        pw.println(reg_nomer_ay);
        String code_ogrn = req.getParameter("code_ogrn");
        pw.println(code_ogrn);
        String code_ogrnip = req.getParameter("code_ogrnip");
        pw.println(code_ogrnip);
        String famil = req.getParameter("famil");
        pw.println(famil);
        String name = req.getParameter("name");
        pw.println(name);
        String otch = req.getParameter("otch");
        pw.println(otch);
        String poln_naim = req.getParameter("poln_naim");
        pw.println(poln_naim);
        String qr_adrs = req.getParameter("qr_adrs");
        pw.println(qr_adrs);
        String pocht_adres = req.getParameter("pocht_adres");
        pw.println(pocht_adres);
        String naim_org = req.getParameter("naim_org");
        pw.println(naim_org);
        String email = req.getParameter("email");
        pw.println(email);
        String seria = req.getParameter("seria");
        pw.println(seria);
        String nomer = req.getParameter("nomer");
        pw.println(nomer);
        String telephon = req.getParameter("telephon");
        pw.println(telephon);
        String data_vudochi = req.getParameter("data_vudochi");
        pw.println(data_vudochi);
        String kem_vudan = req.getParameter("kem_vudan");
        pw.println(kem_vudan);
        String pass = req.getParameter("pass");
        pw.println(pass);
        String reg_date = req.getParameter("reg_date");
        pw.println(reg_date);
        String last_login = req.getParameter("last_login");
        pw.println(last_login);
        pw.close();

        try{
            String url = "";
            String username = "postgres", password = "postgresql";

        }
    }
}