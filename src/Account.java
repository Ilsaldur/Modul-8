import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Account {
	int id;
	double balance;
	GregorianCalendar dateCreated;
	static double annualInterestRate;

	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = (GregorianCalendar) GregorianCalendar.getInstance();
	}


	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public String getDateCreated() {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(dateCreated.getTime());
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;

	}

	public double getMontlyInterest() {
		return balance * (annualInterestRate / 1200);
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}

		return false;
	}
	public boolean deposit (double amount) {
		if (amount > 0) {
			balance +=amount;
			return true;
		}
		
		return false;
	}
}

class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 2000);
		
		boolean canWithdraw = account.withdraw(2500);
		System.out.println(canWithdraw);
		
		boolean canDeposit = account.deposit(3000);
		System.out.println(canDeposit);
		
		Account.setAnnualInterestRate(4.5);
		
		
		System.out.println(account.getBalance());
		System.out.println(account.getMontlyInterest());
		System.out.println(account.getDateCreated());
		
	}
}



