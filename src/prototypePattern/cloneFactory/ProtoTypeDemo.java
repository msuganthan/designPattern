package prototypePattern.cloneFactory;

public class ProtoTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneFactory cloneFactory = new CloneFactory();
		Animal sally = new Sheep();
		Sheep clonedSheep = (Sheep) cloneFactory.getClone(sally);
		System.out.println("Sally hashCode "+ System.identityHashCode(sally));
		System.out.println("ClonedSheep hashCode "+ System.identityHashCode(clonedSheep));
		
	}

}
