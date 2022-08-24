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
        String role_users = req.getParameter("role_users");

        String unn = req.getParameter("unn");
        int inn = Integer.parseInt(unn);

        String data_vudochi = req.getParameter("data_vudochi");
        String pass = req.getParameter("pass");
        String reg_date = req.getParameter("reg_date");
        String last_login = req.getParameter("last_login");
        pw.close();

        try{
            Connection c = DriverManager.getConnection("jdbc:postgresql://192.168.1.115/postgres", "postgres", "postgresql");

            String sql = "INSERT INTO reg Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '2004-10-19 10:23:54+02', '2004-10-19 10:23:54+02')";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, type_users);
            ps.setString(2, role_users);
            ps.setInt(3, inn);

            String snils = req.getParameter("snils");
            if (snils != null) {
                int isnils = Integer.parseInt(snils);
                ps.setInt(4, isnils);
            } else ps.setNull(4, Types.BIGINT);


            String reg_nomer_ay = req.getParameter("reg_nomer_ay");
            if (reg_nomer_ay != null) {
                int reg_nom = Integer.parseInt(reg_nomer_ay);
                ps.setInt(5, reg_nom);
            } else ps.setNull(5, Types.BIGINT);


            String code_ogrn = req.getParameter("code_ogrn");
            if (code_ogrn != null) {
                int ogrn = Integer.parseInt(code_ogrn);
                ps.setInt(6, ogrn);
            } else ps.setNull(6, Types.BIGINT);

            String code_ogrnip = req.getParameter("code_ogrnip");
            if (code_ogrnip != null) {
                int ogrnip = Integer.parseInt(code_ogrnip);
                ps.setInt(7, ogrnip);
            } else ps.setNull(7, Types.BIGINT);

            String famil = req.getParameter("famil");
            if(famil != null) {
                ps.setString(8, famil);
            } else ps.setNull(8, Types.VARCHAR);

            String name = req.getParameter("name");
            if (name != null) {
                ps.setString(9, name);
            } else ps.setNull(9, Types.VARCHAR);

            String otch = req.getParameter("otch");
            if (otch != null) {
                ps.setString(10, otch);
            } else ps.setNull(10, Types.VARCHAR);

            String poln_naim = req.getParameter("poln_naim");
            if (poln_naim != null) {
                ps.setString(11, poln_naim);
            } else ps.setNull(11, Types.VARCHAR);

            String qr_adrs = req.getParameter("qr_adrs");
            if (qr_adrs != null) {
                ps.setString(12, qr_adrs);
            } else ps.setNull(12, Types.VARCHAR);

            String pocht_adres = req.getParameter("pocht_adres");
            if (pocht_adres != null) {
                ps.setString(13, pocht_adres);
            } else ps.setNull(13, Types.VARCHAR);

            String naim_org = req.getParameter("naim_org");
            if (naim_org != null) {
                ps.setString(14, naim_org);
            } else ps.setNull(14, Types.VARCHAR);

            String email = req.getParameter("email");
            if (email != null) {
                ps.setString(15, email);
            } else ps.setNull(15, Types.VARCHAR);

            String seria = req.getParameter("seria");
            if (seria != null) {
                int ser = Integer.parseInt(seria);
                ps.setInt(16, ser);
            } else ps.setNull(16, Types.BIGINT);

            String nomer = req.getParameter("nomer");
            if (nomer != null) {
                int num = Integer.parseInt(nomer);
                ps.setInt(17, num);
            } else ps.setNull(17, Types.BIGINT);

            String telephon = req.getParameter("telephon");
            if (telephon != null) {
                int phone = Integer.parseInt(telephon);
                ps.setInt(18, phone);
            } else ps.setNull(18, Types.BIGINT);
            ps.setDate(19, '11.11.1111');
            String kem_vudan = req.getParameter("kem_vudan");
            if (kem_vudan != null) {
                ps.setString(20, kem_vudan);
            } else ps.setNull(20, Types.VARCHAR);
        //    ps.setString(21, pass);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}