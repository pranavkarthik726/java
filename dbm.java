import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dbm {
    String url;
    String password;
    String username;
    Connection con = null;
    Statement st = null;

    public dbm(String url,String username,String password) throws SQLException {
        this.url = url;
        this.password = password;
        this.username = username;

        String insertQuery = "INSERT INTO Account (acc_num, customer_id, balance, created_time, acc_type) VALUES (999999, 002, 1250.00, '2024-04-15', 'SB')";
        this.con = DriverManager.getConnection(url,username,password);
        st = con.createStatement();
        //st.executeUpdate(insertQuery);
    }

    public Integer[] getaccid(int customer_id) throws SQLException {
        String selectQuery = "SELECT acc_num FROM Account WHERE customer_id="+customer_id;
        List<Integer> acclist = new ArrayList<>();
        ResultSet rs = st.executeQuery(selectQuery);
        while (rs.next()) {
            int accountId = rs.getInt("acc_num");
            acclist.add(accountId);
        }
        return  acclist.toArray(new Integer[0]);

    }

    public account getacc(int acc_num) throws SQLException {
        String selectQuery = "SELECT * FROM Account WHERE acc_num="+acc_num;
        ResultSet rs = st.executeQuery(selectQuery);
        account acc = new account(acc_num);
        rs.next();
        acc.customer_id=rs.getInt(2);
        acc.balance=rs.getInt(3);
        acc.created_time= rs.getTimestamp(4).toLocalDateTime();
        acc.card_no=rs.getLong(6);
        return acc;


    }





}



