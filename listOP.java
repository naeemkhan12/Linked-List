
public class listOP {
	
	

	public static void main(String[] args) {
		
		list lis = new list();
		node n1= new node("n",12);
		node n2= new node("a",19);
		node n3= new node("e",19);
		node n4= new node("e",19);
		node n5= new node("m",19);
//		node n= new node("s",19);
		node n6= new node("r",19);	
		node n7= new node("a",19);
		node n8= new node("s",19);
		node n9= new node("h",19);
		node n10= new node("i",19);
		node n11= new node("d",19);
		lis.addAtStart(n1);
		lis.addAtEnd(n2);
		lis.addAtEnd(n3);
		lis.addAtEnd(n4);
		lis.addAtEnd(n5);
		list lis2 = new list();
		lis2.addAtStart(n6);
		lis2.addAtEnd(n7);
		lis2.addAtEnd(n8);
		lis2.addAtEnd(n9);
		lis2.addAtEnd(n10);
		lis2.addAtEnd(n11);
		lis.merge(lis2);
		//System.out.println("\n\n\n   ");
		lis.deleteAtI(10);
		lis.display();
		
		//lis.deleteFromStrart();
		//node last= new node("last" , 12);
		//lis.addAtEnd(last);
		//lis.addAtEnd(n2);
	//	lis.display();
		//n2.next.display();

	}

}
