import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Bank";
        String password = "Pk44password@";
        String username = "root";
        dbm d1 = new dbm(url,username,password);
        Integer[] acclist = d1.getacc(2);
        for (int accountId : acclist) {
            System.out.println("Account Number: " + accountId);
        }
    }
}
