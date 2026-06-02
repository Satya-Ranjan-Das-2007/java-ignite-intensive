package day6;

public class PRODUCT_DETAILS {

	String productName;
	String productId;
	String productCategory;
	int price;
	int stock;
	
	 PRODUCT_DETAILS(String pn,String pId,String pc,int p,int s)
	{
	productName = pn;
	productId = pId;
	productCategory = pc;
	price = p;
	stock = s;
	}
	void display()
	{
		System.out.println("Product Name: " +productName);
		System.out.println("Product Id: " +productId);
		System.out.println("Product Category: " +productCategory);
		System.out.println("price: " +price);
		System.out.println("stock: " +stock);
		System.out.println("------------------------------");
		
	}
	public static void main(String[] args) {
		PRODUCT_DETAILS p1 = new PRODUCT_DETAILS("MacBook","25BIo8","Electronics",150000,500);
		PRODUCT_DETAILS p2 = new PRODUCT_DETAILS("IPhone","17 pro","Electronics",134000,140);
		PRODUCT_DETAILS p3 = new PRODUCT_DETAILS("GooglePixel","36Bce","Electronics",60000,200);
		PRODUCT_DETAILS p4 = new PRODUCT_DETAILS("Nothing","25we8","Electronics",56000,150);
		PRODUCT_DETAILS p5 = new PRODUCT_DETAILS("Realme","25BIo8","Electronics",25000,1600);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}
