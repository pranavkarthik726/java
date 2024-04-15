import java.time.LocalDateTime;

public class savings_acc extends account{
    double min_balance = 1000;
    String acc_type = "SB";
    double trans_fee = 0.1;



    public savings_acc(String acc_type,double balance){
        acc_num=create_acc_no();
        card_no=create_card();
        this.balance=balance;

    }
}
