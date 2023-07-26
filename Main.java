
public class Main {

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		
		l1.insert(10);
		 l1.insert(20);
		 l1.insertByPosition(50, 2);
	    l1.display(l1.getHead());
	  //   l1.displayRev(l1.getHead());
	 //    l1.deleteByPosition(2);
	     l1.deleteByval(50);
	     l1.display(l1.getHead());
	 System.out.println();
	}
 
}
