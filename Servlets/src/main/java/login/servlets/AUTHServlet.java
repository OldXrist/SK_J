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

        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");

        try {
            Connection c = DriverManager.getConnection("jdbc:postgresql://192.168.1.115/postgres", "postgres", "postgresql");

            String sql = "SELECT email, pass FROM reg WHERE email = ?";
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String x = rs.getString(1);
                String y = rs.getString(2);
                pw.println(x);
                pw.println(y);
                pw.println("success");
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
