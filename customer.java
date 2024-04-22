
public class customer{
     String name;
     int customer_id;
    private final String address;
    private final long contact;
    private final long Adhar_no;
    private final short age;
    private final int mon_income;
    public customer(int customer_id,String name,String address,short age,long Adhar_no,int mon_income,long contact){
        this.name = name;
        this.customer_id=customer_id;
        this.address=address;
        this.contact=contact;
        this.Adhar_no=Adhar_no;
        this.age=age;
        this.mon_income=mon_income;
    }
    public void display_cus(){
        System.out.println("NAME: "+name);
        System.out.println("CUSTOMER ID: "+customer_id+"\tcontact= "+contact);
        System.out.println("AGE= "+age+"\tMONTHLY INCOME: "+mon_income);
        System.out.println("AADHAR NUMBER: "+Adhar_no);
        System.out.println("ADDRESS:");
        System.out.println(address);
    }
}
