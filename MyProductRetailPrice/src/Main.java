import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Products products = new Products();
		int productID=0;
		int quantity=0;
		boolean cont = true;
		while(cont){
			productID = sc.nextInt();
			quantity = sc.nextInt();
			switch(productID)
			{
			case 1:
				products.addToTotal(products.getProduct1()*quantity);
			    break;
			case 2:
				products.addToTotal(products.getProduct2()*quantity);
				break;
			case 3:
				products.addToTotal(products.getProduct3()*quantity);
				break;
			default:
				cont = false;
				break;
			}
			
		}
		
		System.out.println(products.totalValue());
		sc.close();
	}

}
