public class Main{
    public static void main(String[] args) {
        Account newAccount = new Account();
        
/*         (1778, 20000, "Michal", "jan@gmail.com", 736057656);

 */
        Account secondAccount = new Account()

        newAccount.getBalance();
        

        System.out.println("You balance is " + newAccount.getBalance());

        newAccount.withdrawFunds(15000);
        System.out.println("My balance is " + newAccount.getBalance());

        Account michalsAccount = new Account("Michal", "janko@gmail.com", 789152);
        System.out.println(michalsAccount.getName());
    }
}