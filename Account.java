public class Account{
    private int number;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    /* default constructor */

    public Account(){
        this(5789, 50000, "Default name", "Default adress", 58862);
        System.out.println("Empty constructor called");
    }

    public Account(int number, int balance, String name, String email, int phoneNumber){
        this.name = name;
        this.balance = balance;
        this.number = number;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Filled constructor called");
    }
    public Account(String name, String email, int phoneNumber){
        this(99999, 17000, name, email, phoneNumber);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(int deposit){
        this.balance += deposit;
    }
    public void withdrawFunds(int withdraw){
        if(balance < withdraw){
            System.out.println("Not enough funds, your balance is " + balance);
        } else{
            this.balance -= withdraw;
            System.out.println("Your balance is " + balance +" $.");
        }
        
    }


}