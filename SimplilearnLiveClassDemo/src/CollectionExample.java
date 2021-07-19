import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		ArrayList<Integer> al = new ArrayList<Integer>();
		//non generic
		//al.add(100);
		//al.add("John");
		//al.add(12.3);
		//generic --> Type of objects need to be collected by the collection 
		//<Wrapperclass/User defined class>
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(500);
		al.add(600);
		al.add(200);
		al.add(null);
		System.out.println(al);
//		for(int i=0;i<al.size();i++) {
//			//if you want to access a value in a specific location of a 
//			//collection then we use get()
//			if(al.get(i) == 200) {
//				System.out.println("I have found 200 at " + i);
//			}
//		}

		//Iterator
		Iterator i = al.iterator(); //we get the base address of the arraylist stored in the iterator.
		//331245 - base address of the 0th index
		while(i.hasNext()) { //checks whether u have a value in the location
			System.out.println(i.next()); //getting the value present in the location and moves the iterator to the next location.
		}

	}

}
