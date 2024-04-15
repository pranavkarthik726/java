import java.time.LocalDateTime;
public class salary_acc extends account {

    double min_balance = 0;
    String acc_type = "SL";
    double trans_fee = 0.2;

    public salary_acc(String acc_type,double balance){
        acc_num=create_acc_no();
        card_no=create_card();
        this.balance=balance;
    }
}
