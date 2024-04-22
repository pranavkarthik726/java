import java.time.LocalDateTime;

public class savings_acc extends account{
    double min_balance = 1000;
    String acc_type = "SA";
    double trans_fee = 0.1;



    public savings_acc(int customer_id, int acc_num, long card_no, double balance, LocalDateTime created_time){
        super(customer_id, acc_num, card_no, balance, created_time);
    }
}
