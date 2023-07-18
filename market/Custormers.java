package market;

import java.util.ArrayList;

public class Custormers extends Persons {

	private ArrayList<String> productList = new ArrayList<>();
	private ArrayList<Integer> priceList = new ArrayList<>();
	
	public Custormers(String name, String adrress, Boolean regularCustomer) {
		super(name, adrress, isThereDelivery(adrress), regularCustomer);
	}
	
	public enum DeliveryAddresses{
		BILKENT("Bilkent"),
		BEYTEPE("Beytepe"),
		ERYAMAN("Eryaman"),
		CAYYOLU("Cayyolu"),
		SINCAN("Sincan");
		public String Neighbourhood;
		private DeliveryAddresses(String Neighbourhood) {
			this.Neighbourhood = Neighbourhood;
		}
		public String getNeighbourhood() {
			return this.Neighbourhood;
		}
	}
	
	private static boolean isThereDelivery(String adrress) {
		for(DeliveryAddresses d:DeliveryAddresses.values()) {
			if(adrress.equals(d.getNeighbourhood())) {
				return true;
			}
		}
		return false;
	}

	public void doShopping(String product, Integer price) {
		this.productList.add(product);
		this.priceList.add(price);
	}

	public void finishShopping() {
		int total = 0;
		for(int i=0; i<this.productList.size(); i++) {
			System.out.println(this.productList.get(i)+" : "+ this.priceList.get(i));
			if(regularCustomer == true)
				total+= ((this.priceList.get(i)*98)/100);
			else
				total += this.priceList.get(i);
			System.out.print("$");
		}
	}

	@Override
	public void information() {
		System.out.println("Name: "+this.name);
		System.out.println("Address: " + this.adrress);
		System.out.println("Is there Delivery Home"+(this.isThereDeliveryHome?" Yes":" No"));
		
	}

}
