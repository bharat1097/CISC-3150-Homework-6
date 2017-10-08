import ChildClass.*;

public class main {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();	

        	System.out.println("Value of child's int variable = " + child.childInt + "\n");
        	System.out.println("The value of parent's int variable = " + child.intOfParent);
    
	}
}