package lab7;

public class Bank {

	private Account[] accounts = new Account[3];
	private int numberOfAccounts = 0;
	
	
	
	public Account addAccount(String owner, double balance) {
		//check if max number of accounts in array has been reached
		if (numberOfAccounts < accounts.length) {
			// increase ID 
			int id = numberOfAccounts + 1;
			// setup account
			Account account = new Account(id, owner, balance);
			accounts[numberOfAccounts] = account;
			numberOfAccounts++;
			return account;

		} else {

			return null;
		}
	}
	//getter for account
	public Account getAccount(String owner) {
		//loop through accounts looking to see if passed string (owner) matches any account name
		for (int i = 0; i < numberOfAccounts; i++) {
			
			if (accounts[i].getOwner().equals(owner)) {
				return accounts[i];
			}
		}
		
		return null;
	}
}
