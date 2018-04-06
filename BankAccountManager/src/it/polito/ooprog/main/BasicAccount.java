package it.polito.ooprog.main;

public class BasicAccount {
	
	protected String name;
	protected String surname;
	protected double initialBalance;
	
	protected double[] creditCardTransactions = new double[10];
	protected int creditCardTransactionNumber = 0;
	
	public BasicAccount(String name, String surname, double initialBalance) {
		this.name = name;
		this.surname = surname;
		this.initialBalance = initialBalance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public double[] getCreditCardTransactions() {
		return creditCardTransactions;
	}

	public void setCreditCardTransactions(double[] creditCardTransactions) {
		this.creditCardTransactions = creditCardTransactions;
	}
	
	public void insertCreditCardTransaction(double transaction) {
		creditCardTransactions[creditCardTransactionNumber] = transaction;
		creditCardTransactionNumber++;
	}

	public String printCreditCardTransactions() {

		// First option: directly concatenate strings
//		String returnValue = "Found " + creditCardTransactionNumber + " CC transactions \n";
//		for (int i = 0; i < creditCardTransactionNumber; i++) {
//			returnValue += creditCardTransactions[i] + "\n";
//		}
//		return returnValue;
		
		// Second option: use a StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Found " + creditCardTransactionNumber + " CC transactions \n");
		for (int i = 0; i < creditCardTransactionNumber; i++) {
			sb.append(creditCardTransactions[i] + "\n");
		}
		return sb.toString();
	}
	
	public double getCCsum() {
		double sum = 0;
		for (int i = 0; i < creditCardTransactionNumber; i++) {
			sum += creditCardTransactions[i];
		}
		return sum;
	}
	
	public double getFee() {
		if (initialBalance > 100) {
			return initialBalance * 0.1;
		}
		return 10;
	}
	
	public double finalAccountBalance() {
		double CCsum  = getCCsum();
		double fee = getFee();
		return initialBalance - CCsum - fee;
	}

	@Override
	public String toString() {
		return name + " " + surname + " " + initialBalance;
	}
	
}
