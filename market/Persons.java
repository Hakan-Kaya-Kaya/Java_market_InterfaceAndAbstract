package market;

public abstract class Persons {

	protected String name;
	protected String adrress;
	protected boolean isThereDeliveryHome;
	protected Boolean regularCustomer;

	public Persons(String name, String adrress, boolean isThereDeliveryHome, Boolean regularCustomer) {
		this.name = name;
		this.adrress = adrress;
		this.isThereDeliveryHome = isThereDeliveryHome;
		this.regularCustomer = regularCustomer;
	}
	
	public abstract void information();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public boolean isThereDeliveryHome() {
		return isThereDeliveryHome;
	}

	public void setThereDeliveryHome(boolean isThereDeliveryHome) {
		this.isThereDeliveryHome = isThereDeliveryHome;
	}

	public Boolean getRegularCustomer() {
		return regularCustomer;
	}

	public void setRegularCustomer(Boolean regularCustomer) {
		this.regularCustomer = regularCustomer;
	}
	
	
}
