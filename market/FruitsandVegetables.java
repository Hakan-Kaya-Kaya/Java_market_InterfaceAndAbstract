package market;

public class FruitsandVegetables extends Products implements Sales, ScaleBuying, Wholesale{

	public FruitsandVegetables(String productName, int price, int maksStok, int miniStok) {
		super(productName, price, maksStok, miniStok);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int doItWholesale(int saleAmount) {
		if(this.currentProductQuantity<saleAmount) {
			System.out.println("Not enough "+ productName);
		}
		if((this.currentProductQuantity - saleAmount)< miniStok) {
			System.out.println("Not enough "+ productName);
			System.out.println("You can buy "+ (this.currentProductQuantity - miniStok) + "pieces");
			return 0;
		}
		this.currentProductQuantity -= saleAmount;
		return ((saleAmount*this.price)*85)/100;
	}

	@Override
	public int doItScaleBuying(int buyAmount) {
		if((this.currentProductQuantity+buyAmount) > this.maksStok)
			this.currentProductQuantity = this.maksStok;
		else
			this.currentProductQuantity += buyAmount;
		return currentProductQuantity;
	}

	@Override
	public int doItNormalsale(int saleAmount) {
		if(this.currentProductQuantity<saleAmount) {
			System.out.println("Not enough "+ productName);
			return 0;
		}
		else
			this.currentProductQuantity -= saleAmount;
		return saleAmount*this.price;
	}

}
