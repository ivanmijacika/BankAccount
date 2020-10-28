public class BankTest{

    public static void main(String[] args){
	BankAccount account1 = new BankAccount(12345, "blackclover");
	System.out.println(account1.toString());

	System.out.println(account1.getBalance());
	System.out.println(account1.deposit(-100));
        System.out.println(account1.deposit(100));
	System.out.println(account1.getBalance());

        System.out.println(account1.withdraw(-10));
        System.out.println(account1.withdraw(10));
	System.out.println(account1.getBalance());
	System.out.println(account1.withdraw(90));
	System.out.println(account1.getBalance());
	System.out.println(account1.withdraw(10));

	System.out.println(account1.getAccountID());

	account1.setPassword("HxH"); //Doesn't do anything visible?

	System.out.println(account1.deposit(69420));
	System.out.println(account1.toString());

    }

}
