import java.time.LocalDateTime;

public class transaction{
     String Transaction_id;
     int acc_num;
    double balance;
     LocalDateTime time_stamp;
     public transaction(int acc_num,double balance){
        this.acc_num=acc_num;
        this.balance=balance;
     }
    private String create_tid(){
        return "crete id here";
    }
    public double deposit(int amount){
        balance += amount;
        return balance;
    }
    public double withdrawal(int amount){
        balance -= amount;
        return balance;
    }
    public double transfer(int amount,int beneficiary){
        balance -= amount;
        return balance;
    }

}
