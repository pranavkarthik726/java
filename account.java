import java.time.LocalDateTime;
public class account  {
    int customer_id;
    int acc_num;
    long card_no;
    double balance;
    LocalDateTime created_time;

    public account( int customer_id, int acc_num, long card_no, double balance, LocalDateTime created_time){
        this.acc_num=acc_num;
        this.customer_id=customer_id;
        this.balance=balance;
        this.card_no=card_no;
        this.created_time=created_time;
    }

    public account(int acc_num){
        this.acc_num=acc_num;
    }


    int create_acc_no(){
        //radomly create acc num
        return 0;
    }
    long create_card(){
        //radomly create card num
        return 0;
    }

    private void print_card(){
        String lastFourDigits = String.valueOf(card_no).substring(12);
        System.out.printf("CARD NO: XXXX-XXXX-XXXX-%04d",(card_no%10000));
        System.out.println();
    }
    public void display_acc(){
        System.out.println("CUSTOMER ID: "+customer_id);
        System.out.println("ACCOUNT NO: "+acc_num);
        print_card();
        System.out.println("BALANCE: "+balance);
        System.out.println("ACCOUNT CREATED DATE: "+created_time);


    }
    public void acctranc(int type,int amount){
        transaction selft=new transaction(acc_num,balance);
    }
    public void acctranc(int type,int amount,int bene){

    }
    
}
