package it.polito.ooprog.main;

public class BankAccountManager {

	public static void main(String[] args) {
		
		// Create an array where to save all the bank accounts
		BasicAccount[] accountList = new BasicAccount[4];
		
		// This is a basic account
		BasicAccount account = new BasicAccount("Andrea", "Marcelli", 100);
		System.out.println(account + "\n");

		// Insert some credit card transactions
		account.insertCreditCardTransaction(12);
		account.insertCreditCardTransaction(20);
		account.insertCreditCardTransaction(25);

		System.out.println(account.printCreditCardTransactions());
		System.out.println("CC transactions sum: " + account.getCCsum());

		System.out.println("Account fee: " + account.getFee());
		System.out.println("Final balance: (basic) " + account.finalAccountBalance() + "\n");
		
		// Insert the account in the accounts array
		accountList[0] = account;
		
		
		// This is a premium account
		PremiumAccount premiumAccount = new PremiumAccount("Andrea", "Marcelli", 100);

		// Insert some credit card transactions
		premiumAccount.insertCreditCardTransaction(12);
		premiumAccount.insertCreditCardTransaction(20);
		premiumAccount.insertCreditCardTransaction(25);

		System.out.println("Final balance: (premium) " + premiumAccount.finalAccountBalance() + "\n");
		
		// Insert the account in the accounts array
		accountList[1] = premiumAccount;
		
		
		// This a gold account
		GoldAccount goldAccount = new GoldAccount("Andrea", "Marcelli", 100);

		// Insert some credit card transactions
		goldAccount.insertCreditCardTransaction(12);
		goldAccount.insertCreditCardTransaction(20);
		goldAccount.insertCreditCardTransaction(25);

		System.out.println("Final balance: (gold) " + goldAccount.finalAccountBalance() + "\n");
		
		// Insert the account in the accounts array
		accountList[2] = goldAccount;
		
		
		// This is a platinum account
		PlatinumAccount platinumAccount = new PlatinumAccount("Andrea", "Marcelli", 600);
		
		// Insert some credit card transactions
		platinumAccount.insertCreditCardTransaction(12);
		platinumAccount.insertCreditCardTransaction(20);
		platinumAccount.insertCreditCardTransaction(25);
		
		System.out.println("Final balance: (platinum) " + platinumAccount.finalAccountBalance() + "\n");
		
		// Insert the account in the accounts array
		accountList[3] = platinumAccount;
		
		
		// compute the final balances for all the accounts
		for (BasicAccount a : accountList) {
			System.out.println("Final balance: " + a.finalAccountBalance());
		}
	}

}
