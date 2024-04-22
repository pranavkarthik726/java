import java.time.LocalDateTime;
public class salary_acc extends account {

    double min_balance = 0;
    String acc_type = "SL";
    double trans_fee = 0.2;

    public salary_acc(int customer_id, int acc_num, long card_no, double balance, LocalDateTime created_time){
        super(customer_id, acc_num, card_no, balance, created_time);
    }
}
