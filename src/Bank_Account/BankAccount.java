package Bank_Account;

public class BankAccount {
	int accountnum=0;
	float accountbal=0;
	public BankAccount()
	{
	}
	public BankAccount(int accountNumber,float balance)
	{
		accountnum=accountNumber;
		accountbal=balance;
	}
	void setAccountNumber(int accno) {
		this.accountnum=accno;
	}
	void withdraw(float amount)
	{
		accountbal=accountbal-amount;
	}
	void deposit(float amount) {
		accountbal=accountbal+amount;
}
	void status()
	{
		System.out.println(accountnum);
		System.out.println(accountbal);
	}
	
	public static void main(String args[])
	{
		BankAccount account1=new BankAccount();
		account1.setAccountNumber(456);
		account1.deposit(10000);
		account1.status();

		BankAccount account2=new BankAccount();
		account2.setAccountNumber(356);
		account2.deposit(20000);
		account2.status();	
	}
}
