import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ProcessEggs p1= new ProcessEggs(sc.nextInt());
	GetEggs g1 = p1.convert();
	g1.display();
	}
}
