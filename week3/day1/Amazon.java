package week3.day1;

public  final class Amazon extends CanaraBankAbstractClass {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.upiPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}
}
