import java.util.ArrayList;
public class oops5{
    public static void main(String[] args) {
        Bank icci = new Bank();
        Account a1 = new Account("Jyoti Mohanta", "13190110042930", 50000 );
        Account a2 = new Account("Samikshya Jena", "7537091014890", 275000 );
        Account a3 = new Account("Puspita Priyadarshini", "9777916392456", 328000 );
        icci.addAccount(a1);
        icci.addAccount(a2);
        icci.addAccount(a3);
        ArrayList <Account> accounts = icci.getAccounts();
        for(Account lowda : accounts){
           lowda.getAccountInfo();
        }

    }

}
class Account {
   String name;
   String accountNumber;
   double balance;

  public Account(String name, String accountNumber, double balance) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }

  public void getAccountInfo() {
    System.out.println("Name : " + this.name);
    System.out.println("account number : " + this.accountNumber);
    System.out.println("balance : " + this.balance);
  }
}

 class Bank {
 ArrayList < Account > accounts;

  public Bank() {
    accounts = new ArrayList < Account > ();
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public void removeAccount(Account account) {
    accounts.remove(account);
  }

  public void depositMoney(Account account, double amount) {
    account.deposit(amount);
  }

  public void withdrawMoney(Account account, double amount) {
    account.withdraw(amount);
  }

  public ArrayList < Account > getAccounts() {
    return accounts;
  }
}

