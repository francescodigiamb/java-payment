
public class PayPal extends PaymentMethod{

	private final double fee = 1.02;

	@Override
	public double applyFee (double cost) {
		return cost * fee;
	}
	@Override
	public void pay (double cost) {
		applyFee(cost);
		System.out.println("Pagato " + applyFee(cost) + "€ " + "con PayPal!");
	}

}
