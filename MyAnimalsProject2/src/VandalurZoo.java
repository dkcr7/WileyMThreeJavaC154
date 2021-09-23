import org.animals.*;

public class VandalurZoo {
	Lion lion = new Lion();
	Tiger tiger = new Tiger();
	Giraffe giraffe = new Giraffe();
	Parrot parrot = new Parrot();
	Eagle eagle = new Eagle();
	
	private void veg(boolean yes) {
		if(yes) 
			System.out.println("It is vegetarian");
		else 
			System.out.println("It is not vegetarian");
	}
	
	private void fly(boolean yes) {
		if(yes) 
			System.out.println("It can fly");	
		else 
			System.out.println("It can not fly");
	}
	
	
	public void printCharacteristics() {
		
		System.out.println("Lion");
		fly(lion.canFly());
		veg(lion.isVegetarion());
		System.out.println(" ");
		
		System.out.println("Tiger");
		fly(tiger.canFly());
		veg(tiger.isVegetarion());
		System.out.println(" ");
		
		System.out.println("Giraffe");
		fly(giraffe.canFly());
		veg(giraffe.isVegetarion());
		System.out.println(" ");
		
		System.out.println("Parrot");
		fly(parrot.canFly());
		veg(parrot.isVegetarion());
		System.out.println(" ");
		
		System.out.println("Eagle");
		fly(eagle.canFly());
		veg(eagle.isVegetarion());
		System.out.println(" ");
		
	}
}
