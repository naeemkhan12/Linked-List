public class list {
	node head;
	
	public list(node e){
		this.head=e;
		
	}
	public list(){
		head =null;
		
	}
	
	public void display(){
		node temp = head;
		while(head!=null){
			head.display();
			head=head.next;
		}
		this.head=temp;
		
	}
	public void addAtEnd(node t){
		node temp=head;
		node secondLast = null;
		
		while(head!=null){
			//this.head.display();
			secondLast=head;
			this.head=head.next;
			
		}
		
		secondLast.next=t;
	//	this.head.display();
		head=temp;
		
	//	this.head.display();
		
	}
	public void addAtStart(node x){
		x.next=head;
		head=x;
		
	}
	public void deleteFromStrart(){
		head = head.next;
	}
	public void deleteFromEnd(){
		node temp = head;
		node secondLast = null;
		
		while(this.head!=null){
			secondLast=head;
			head=head.next;
		}
		secondLast=null;
		this.head=temp;
		
		
		
	}
	public boolean Search(String name){
		node temp=head;
		while(head!=null){
			if(head.toString().equals(name))
				return true;
			head=head.next;
			
		}
		head = temp;
		return false;
		
		
	}
	public void deleteAtI(int index){
		int counter = 0,end=size()-1;
		node header = head;
		node pervious = null;
		while (header!=null){
			if(index==0){
				this.head=header.next;
				head.display();
				break;
			}else if(index==counter){	
				if(index!=end){
				//	System.out.println(pervious.next.name);
					pervious.next = header.next;
					//System.out.println(pervious.next.name);
					break;
				}
				else {
					deleteFromEnd();
				break;
				}
			}
			pervious= header;
			header= header.next;
			counter++;
		}
		
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	public int size(){
		int counter=1;
		node header = head;
		while(header!=null){
			header=header.next;
			counter++;
		}
		
		return counter;
	}
	

	public void merge(list b){
	this.addAtEnd(b.head);	
	}
	

}
