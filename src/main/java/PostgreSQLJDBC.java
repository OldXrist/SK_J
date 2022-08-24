import java.sql.*;

public class PostgreSQLJDBC {
    public static void main(String[] args) {
        try(Connection c = DriverManager.getConnection("jdbc:postgresql://192.168.1.115/postgres", "postgres", "postgresql")) {
            Class.forName("org.postgresql.Driver");
            String x = "axaxaxaxaxaxax";
            int y = 1231;

            String sql = "INSERT INTO reg (type_users, role_users, unn, pass, reg_date, last_login) Values (?, ?, ?, ?, '2004-10-19 10:23:54+02', '2004-10-19 10:23:54+02')";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, x);
            ps.setString(2, x);
            ps.setInt(3, y);
            ps.setString(4, x);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}