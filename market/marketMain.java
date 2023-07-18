package market;

import java.util.*;

public class marketMain {

	public enum productTyeps{
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
		productTyeps(int id) {
			this.id=id;
		}
		public int getId() {
			return id;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DairyProducts milk = new DairyProducts("Milk", 5, 200, 70);
		DairyProducts yogurt = new DairyProducts("Yogurt", 18, 190, 70);
		DairyProducts cheese = new DairyProducts("Cheese", 12, 255, 80);
		FruitsandVegetables pear = new FruitsandVegetables("Pear", 10, 200, 60);
		FruitsandVegetables banana = new FruitsandVegetables("Banana", 8, 200, 60);
		FruitsandVegetables strawberry = new FruitsandVegetables("Strawberry", 15, 140, 30);
		Legumes chickpeas = new Legumes("Chickpeas", 2, 240, 80);
		Legumes lentil = new Legumes("Lentil", 3, 260, 100);
		Legumes fame = new Legumes("Fame", 1, 400, 100);
		
		while(true) {
			System.out.println("1-Product Operation\r\n"+"2-Customer Transactions\r\n"+"3-Exit");
		int process = scan.nextInt();
		
		if(process==1) {
			for(productTyeps pr: productTyeps.values())
				System.out.println(pr.getId()+" "+ pr);
			System.out.println("Select product");
			int selectProduct = scan.nextInt();
			System.out.println("Enter amount");
			int amount = scan.nextInt();
			switch (selectProduct) {
			case 1:
				milk.doItScaleBuying(amount);
				break;
			case 2:
				yogurt.doItScaleBuying(amount);
				break;
			case 3:
				cheese.doItScaleBuying(amount);
				break;
			case 4:
				pear.doItScaleBuying(amount);
				break;
			case 5:
				banana.doItScaleBuying(amount);
				break;
			case 6:
				strawberry.doItScaleBuying(amount);
				break;
			case 7:
				chickpeas.doItScaleBuying(amount);
				break;
			case 8:
			lentil.doItScaleBuying(amount);
				break;
			case 9:
				fame.doItScaleBuying(amount);
				break;

			}
		}
		else if(process == 2) {
		System.out.println("Name: ");
		String name1 = scan.next();
		System.out.println("Would you like to be taken to your home?(1-Yes, 0-No)");
		int delivery = scan.nextInt();
		System.out.println("Regular customer?(1-Yes, 0-No)");
		int regular = scan.nextInt();
		String address1 ="";
		if(delivery==1) {
			System.out.println("Write address. ");
			address1 = scan.next();
		}
		Custormers customer = new Custormers(name1, address1, regular==1?true:false);
		customer.information();
		if(delivery==0 || (delivery==1 && customer.isThereDeliveryHome())) {
			while(true) {
				System.out.println("1- Sales, 2-WholeSale, 3-Finish");
				int select = scan.nextInt();
				if(select==1 || select==2) {
					for(Products.Prodcts p: Products.Prodcts.values()) {
						System.out.println(p.getId()+" | "+ p);
					}
					System.out.println("Select product.");
					int selcProduct = scan.nextInt();
					System.out.println("Select amount.");
					int amount = scan.nextInt();
					switch(selcProduct) {
					case 1:
						if(select == 1) {
							int price = milk.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" Lt", price);
						}
						else {
							int price = milk.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" Lt", price);
						}
						break;
					case 2:
						if(select == 1) {
							int price = yogurt.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" Lt", price);
						}else {
							int price = yogurt.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" Lt", price);
						}
						break;
					case 3:
						if(select == 1) {
							int price = cheese.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = cheese.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 4:
						if(select == 1) {
							int price = pear.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = pear.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 5:
						if(select == 1) {
							int price = banana.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = banana.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 6:
						if(select == 1) {
							int price = strawberry.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = strawberry.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 7:
						if(select == 1) {
							int price = chickpeas.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = chickpeas.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 8:
						if(select == 1) {
							int price = lentil.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = lentil.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					case 9:
						if(select == 1) {
							int price = fame.doItNormalsale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}else {
							int price = fame.doItWholesale(amount);
							if(price>0)
								customer.doShopping(amount +" kg", price);
						}
						break;
					}
				}
				else if(select==3) {
					System.out.println("Shopping finish. ");
					customer.finishShopping();
					System.out.println("");
					System.out.println("--------------------");
					break;
				}
				else
				{
					System.out.println("Wrong choice");
					continue;
				}
			}
		}
		}
		
		}
	}

}
