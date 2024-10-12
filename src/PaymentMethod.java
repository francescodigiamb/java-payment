
public class PaymentMethod {

	public void pay (double cost) {	
		applyFee(cost);
		System.out.println("Pagato " + applyFee(cost) + "€");
	}
	public double applyFee (double cost) {
		return cost;
	}
}
