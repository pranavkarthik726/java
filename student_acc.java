import java.time.LocalDateTime;

public class student_acc extends account{
    double min_balance = 0;
    String acc_type = "ST";
    //age limit is low (10-25)
    double trans_fee = 0;


    public student_acc(int customer_id, int acc_num, long card_no, double balance, LocalDateTime created_time){
        super(customer_id, acc_num, card_no, balance, created_time);
    }


}
