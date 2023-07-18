package market;

public abstract class Products {

	protected String productName;
	protected int price;
	protected int maksStok;
	protected int miniStok;
	protected int currentProductQuantity;
	
	public Products(String productName, int price, int maksStok, int miniStok) {
		
		this.productName = productName;
		this.price = price;
		this.maksStok = maksStok;
		this.miniStok = miniStok;
		this.currentProductQuantity = 0;
	}
	
	public enum Prodcts{
		Milk(1),
		Yogurt(2),
		Cheese(3),
		Pear(4),
		Banana(5),
		Strawberry(6),
		Chickpeas(7),
		Lentil(8),
		Fame(9);
		public int id;
		Prodcts(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
	}
	
	public enum Amount{
		wholesale_Min(50),
		NormalSales_Max(49);
		public int id;
		private Amount(int id) {
		this.id=id;
		}
		public int getId() {
			return id;
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaksStok() {
		return maksStok;
	}

	public void setMaksStok(int maksStok) {
		this.maksStok = maksStok;
	}

	public int getMiniStok() {
		return miniStok;
	}

	public void setMiniStok(int miniStok) {
		this.miniStok = miniStok;
	}

	public int getCurrentProductQuantity() {
		return currentProductQuantity;
	}

	public void setCurrentProductQuantity(int currentProductQuantity) {
		this.currentProductQuantity = currentProductQuantity;
	}
	
	
}
