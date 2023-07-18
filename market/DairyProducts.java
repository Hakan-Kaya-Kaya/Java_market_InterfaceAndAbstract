package market;

public class DairyProducts extends Products implements Sales, ScaleBuying{

	public DairyProducts(String productName, int price, int maksStok, int miniStok) {
		super(productName, price, maksStok, miniStok);
		
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
			System.out.println("Not enough " + productName);
			return 0;
		}
		this.currentProductQuantity -= saleAmount;
		return saleAmount*this.price;
	}

	
}
