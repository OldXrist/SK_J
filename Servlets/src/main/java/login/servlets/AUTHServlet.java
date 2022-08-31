package login.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


@WebServlet("/AUTHServ")
public class AUTHServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\manager\\Desktop\\SK_J\\src\\main\\resources\\scripts\\popa.txt", StandardCharsets.UTF_8);

        res.setHeader("Access-Control-Allow-Origin", "http://localhost:63342/SK_J/login.html");
        res.setHeader("Access-Control-Allow-Methods", "GET");

        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");

        try {
            Connection c = DriverManager.getConnection("jdbc:postgresql://192.168.1.115/postgres", "postgres", "postgresql");

            String sql = "SELECT email, pass FROM reg WHERE email = ? AND pass = ?";
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, pwd);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pw.println(rs.getString(1));
                pw.println(rs.getString(2));
                pw.println("success");
                res.sendRedirect("http://localhost:63342/SK_J/main.html?_ijt=gckjkrah7uctccdva84ir5k84q&_ij_reload=RELOAD_ON_SAVE");
            } else {
                pw.println("denied");
            }

            rs.close();
            ps.close();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
