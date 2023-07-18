package market;

public class Legumes extends Products implements Sales, ScaleBuying, Wholesale{
	
	public Legumes(String productName, int price, int maksStok, int miniStok) {
		super(productName, price, maksStok, miniStok);
	}

	@Override
	public int doItWholesale(int saleAmount) {
		if(saleAmount< Amount.wholesale_Min.getId()) {
			System.out.println("You cannot buy less than 50 pieces.");
			return 0;
		}
		if(this.currentProductQuantity<saleAmount) {
			System.out.println("not enough "+ productName);
			return 0;
		}
		if((this.currentProductQuantity - saleAmount)< this.miniStok) {
			System.out.println("cannot fall below the minimum stock quantity");
			System.out.println(this.currentProductQuantity - miniStok + " You can buy products.");
			return 0;
		}
		this.currentProductQuantity -= saleAmount;
		return ((saleAmount*this.price)*85)/100;
	}

	@Override
	public int doItScaleBuying(int buyAmount) {
		if((this.currentProductQuantity+buyAmount) < this.maksStok)
			this.currentProductQuantity=this.maksStok;
		return this.currentProductQuantity;
	}

	@Override
	public int doItNormalsale(int saleAmount) {
		if(saleAmount> Amount.NormalSales_Max.getId()) {
			System.out.println("You cannot buy more than 50 pieces.");
			return 0;
		}
		if(this.currentProductQuantity<saleAmount) {
			System.out.println("not enough "+ productName);
			return 0;
		}else
			this.currentProductQuantity -= saleAmount;
		return saleAmount*this.price;
	}

}
