import java.time.LocalDateTime;

public class student_acc extends account{
    double min_balance = 0;
    String acc_type = "ST";
    //age limit is low (10-25)
    double trans_fee = 0;


    public student_acc(String acc_type,double balance){
        acc_num=create_acc_no();
        card_no=create_card();
        this.balance=balance;

    }

}
