package lab10;

public class Program {

	public static void main(String[] args) {

		Account account = new Account(123, 100, "Bob");

		try {
			account.withdraw(50);
			System.out.println(account.getDetails());

			account.withdraw(60);
			System.out.println(account.getDetails());

		} catch (IllegalArgumentException e) {
			System.out.println("Unable to withdraw money: " + e.getMessage());

		} finally {
			account.close();
		}
	}
}