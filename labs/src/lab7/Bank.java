package lab7;

public class Bank {

	    // Array that can store 3 Account objects
	    private Account[] accounts = new Account[3];

	    // Keeps track of the next account ID
	    private int nextId = 1;

	    // Adds a new account
	    public Account addAccount(String owner, double balance) {

	        // Find an empty space in the array
	        for (int i = 0; i < accounts.length; i++) {

	            if (accounts[i] == null) {

	                // Create a new Account with a unique ID
	                Account account = new Account(nextId, owner, balance);

	                // Store it in the array
	                accounts[i] = account;

	                // Increase ID for the next account
	                nextId++;

	                // Return the newly created account
	                return account;
	            }
	        }

	        // Array is full
	        return null;
	    }

	    // Finds an account by owner name
	    public Account getAccount(String owner) {

	        for (int i = 0; i < accounts.length; i++) {

	            if (accounts[i] != null &&
	                accounts[i].getOwner().equals(owner)) {

	                return accounts[i];
	            }
	        }

	        // No matching account found
	        return null;
	    }
	}

	
}
