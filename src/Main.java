
public class Main {

	public static void main(String[] args) {
		
		PaymentMethod credit = new CreditCard();
		PaymentMethod paypal = new PayPal();
		PaymentMethod bank = new BankTransfer();
			
		credit.pay(500);
		paypal.pay(500);
		bank.pay(500);
		
	}
}
