
public class dlink {
	
	node header = null;
	node footer = null;
	public void addAtStart(node t){
		if(header!=null)
			header.next=t;
		t.next=null;
		t.previous=header;
		header=t;
		if(footer==null)
			footer= t;
//		System.out.println(header.data+"    "+footer.data);
	}
	
	public void removeAtStart(){
		header=header.previous;
		header.next=null;
		if(footer==header)
			footer=null;
	}
	public void addAtEnd(node t){
		t.next=footer;
		t.previous=null;
		if(footer!=null)
		footer.previous=t;
		footer=t;
		if(header==null)
			header=t;
		//System.out.println(header.data+" " +footer.data);
	}
	public void removeAtEnd(){
		footer=footer.next;
		footer.previous=null;
		if(header==footer){
			header=null;
		}
		
	}
	public void addAtIth(node t ,int i){
		if(i==0)
			addAtStart(t);
		else{
			int counter = 0;
			node iterator = header;
			while(iterator!=null){
				if(counter==(i-1)){
					t.next=header;
					t.previous=iterator.previous;
					iterator.previous=t;
					iterator=t.previous;
					iterator.next=t;
					break;
				}
				iterator=iterator.next;
			}
		}
	}
	public void removeAtIth(node t , int i){
		if(i==0)
			removeAtStart();
		else{
			int counter = 0;
			node iterator = header,next,pervious;
			while(iterator!=null){
				if(counter==(i-1)){
					 next = iterator.next;
					 pervious= iterator.previous;
					 pervious.next=next;
					 next.previous=pervious;
					break;
				}
				iterator=iterator.next;
				
			}
		}
	}
	public void display(){
		node start = header, end=footer;
		while (start!=end){
			System.out.println(start.data);
			System.out.println(end.data);
			start=start.previous;
			if(start==end)
				break;
			end = end.next;
		}
	}

	public static void main(String[] args) {
		dlink d = new dlink();
		d.addAtStart(new node (4));
		d.addAtStart(new node (3));
		d.addAtStart(new node (2));
		d.addAtStart(new node (1));
		d.addAtStart(new node (0));
		d.addAtEnd(new node(5));
		//d.addAtEnd(new node(6));
		d.display();
	}

}
