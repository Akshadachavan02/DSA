public class Bank {
    private  String account_name;
    private int account_number;
    public static void main(String[] args) {
        Bank_main obj = new Bank_main();
        obj.display("Radha", 800791);

   
    }}
    class Bank_main{
        void display(String account_name,int account_number){
            System.out.println("Name of the Account Holder is:"+account_name);
            System.out.println("The account number of the accont is:"+account_number);
       
        
    }

    
}
