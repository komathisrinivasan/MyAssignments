package week3.day1;

public abstract class CanaraBankAbstractClass implements Payments {
	
	public void recordPaymentDetails() {
		System.out.println("To print payment specific details");
	}
	
	public void cashOnDelivery() {
		System.out.println("COD is Done");
	}
	public void upiPayments() {
		System.out.println("UPI Payments is Done");
	}
	
	public void cardPayments() {
		System.out.println("Card Payment Displayed");
	}
	
	public void internetBanking() {
		System.out.println("Internet Banking Account");
	}
	}

