public class BankTest{

    public static void main(String[] args){
	BankAccount account1 = new BankAccount(12345, "blackclover");
	BankAccount account2 = new BankAccount(100, "FMA");
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

	System.out.println(account1.transferTo(account2, 69000, "hxh"));
	System.out.println(account1.transferTo(account2, 70000, "HxH"));
	System.out.println(account1.transferTo(account2, -69000, "HxH"));
	System.out.println(account1.transferTo(account2, 69000, "HxH"));
	System.out.println(account1);
	System.out.println(account2);
    }

}
