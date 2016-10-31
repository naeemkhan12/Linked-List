public class node {
	
	String name;
	int age;
	node next;
	public node(){
		
	}
	public node(String n,int a){
		this.age=a;
		this.name=n;
	}
	public void display(){
		System.out.println(" Name "+this.name+" age "+this.age );
	}

}
