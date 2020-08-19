package prototypePattern.cloneFactory;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made");
	}
	
	public Animal makeCopy() {
		// TODO Auto-generated method stub
		System.out.println("Sheep is being made");
		Sheep sheepObject = null;
		try {
			sheepObject = (Sheep) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("The sheep was turned to mush");
		}
		return sheepObject;
	}
	
	public String toString() {
		return "Dolly is my Hero, Baaaaaaa";
	}

}
