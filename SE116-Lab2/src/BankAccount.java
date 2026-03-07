/* class BankAccount {
    private String ownerName;
    private long iban;
    private double balance;
    public BankAccount(String name, long ibanNo) {
        this.ownerName = name;
        this.iban = ibanNo;
        this.balance = 0.0;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public long getIban() {
        return iban;
    }
    public void setIban(long ibanNo) {
        this.iban = ibanNo;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " TL deposited to " + ownerName);
        }
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("ERROR: Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println(amount + " TL withdrawn. New balance: " + balance);
        }
    }
    public void sendMoney(int amount, long receiverIban, BankAccount a) {
        if (amount > balance) {
            System.out.println("Warning: Insufficient balance to send money!");
        } else if (a.getIban() != receiverIban) {
            System.out.println("Warning this iban not match the acc");
        } else {
            this.balance -= amount;
            a.deposit(amount);
            System.out.println("Success " + amount + getOwnerName());
        }
    }
    public void displayAccountInfo() {
        System.out.println(" Owner: " + ownerName + " IBAN: " + iban + " Balance: " + balance + " TL");
    }
}
class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Azra", 12345678901L);
        BankAccount account2 = new BankAccount("Aylin", 98765432109L);
        account1.deposit(1000);
        account1.withdraw(200);
        account1.sendMoney(300, 98765432109L, account2);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
*/
 public class BankAccount{
     private String ownerName;
     private long iban;
     private double balance;

     BankAccount(String ownerName,long iban){
             this.ownerName = ownerName;
             this.iban = iban;
             balance=0.0;

     }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public long getIban(){
         return iban;
    }
    public void setIban(long iban){
         this.iban=iban;
    }
    public double getBalance(){
         return balance;
    }
    void deposit(int amount){
         this.balance += amount;
    }
    void withdraw(int amount){
         if(amount>balance){
             System.out.println("ERROR!");
         }
         else if (amount <= balance ){
             balance -=amount;
             System.out.println("Current balance: " + balance);

         }

        }
    public  void sendMoney (int amount,long receiverIban,BankAccount a){
         if (amount > this.balance) {
             System.out.println("ERROR");
         } else if(a.getIban() != receiverIban){
                 System.out.println("ERROR");
             }
             else{
                 this.balance -= amount;
                 a.deposit(amount);
                 System.out.println("Transfer successful!");
             }

         }
      void displayAccountInfo(){
          System.out.println("Owner Name " + ownerName  +  " -> " + " Iban ||  " + iban + "Balance: " + balance);
    }

 }

 class Bank{
     public static void main (String [] args){
         BankAccount acc1 = new BankAccount ("Azra",98721245057L);
         BankAccount acc2 = new BankAccount( "Fatih",98763322183L);
         acc1.deposit(580000);
         acc1.withdraw(70045);
         acc1.sendMoney(85722,98763322183L,acc2);
         acc1.displayAccountInfo();
         acc2.displayAccountInfo();
     }
 }


