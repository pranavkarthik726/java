import java.time.LocalDateTime;
public class account  {
    String name;
    int customer_id;
    int acc_num;
    long card_no;
    double balance;

    LocalDateTime created_time;
    int create_acc_no(){
        //radomly create acc num
        return 0;
    }
    long create_card(){
        //radomly create card num
        return 0;
    }

    private void print_card(){
        System.out.println("CARD NO: XXXX-XXXX-XXXX-"+(card_no%10000));
    }
    public void display_acc(){
        System.out.println("NAME: "+name+"\tCUSTOMER ID: "+customer_id);
        System.out.println("ACCOUNT NO: "+acc_num);
        print_card();
        System.out.println("BALANCE: "+balance);


    }
    public void acctranc(int type,int amount){
        transaction selft=new transaction(acc_num,balance);
    }
    public void acctranc(int type,int amount,int bene){

    }
    
}
