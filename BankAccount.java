public class BankAccount{

    private double balance;
    private int accountID;
    private String password;

    public BankAccount(double b, int a, String p){
	balance = b;
	accountID = a;
	password = p;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountID(){
        return accountID;
    }

    public void setPassword(String pd){
        password = pd;
    }

    public boolean deposit(double amount){
        if (amount>=0){
            balance += amount;
            return true;
        }
        else return false;
    }

    public boolean withdraw(double amount){
        if (balance>=amount && amount>0){
            balance -= amount;
            return true;
        }
        else return false;
    }

    public String toString(){
        return String.valueOf(accountID)+"\t"+String.valueOf(balance);
    }

}
