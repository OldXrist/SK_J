package reg.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/")
public class ULServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\manager\\Desktop\\SK_J\\Servlets\\src\\main\\popa.txt", StandardCharsets.UTF_8);
        String zip = req.getParameter("zip");
        pw.println(zip);
        pw.close();
    }
}