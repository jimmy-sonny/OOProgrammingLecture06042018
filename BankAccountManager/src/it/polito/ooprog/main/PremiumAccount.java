package it.polito.ooprog.main;

public class PremiumAccount extends BasicAccount {

	public PremiumAccount(String name, String surname, double initialBalance) {
		super(name, surname, initialBalance);
	}
	
	public double getPenalty() {
		if (initialBalance <= 100) {
			return 0;
		} else {
			return initialBalance * 0.03;
		}
	}
	
	public double getInterests() {
		return initialBalance * 0.015;
	}
	
	@Override
	public double finalAccountBalance() {
		double CCsum  = getCCsum();
		double fee = getFee();
		double penalty = getPenalty();
		double interests = getInterests();
		return initialBalance - CCsum - fee - penalty + interests;
	}
}
