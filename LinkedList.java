
public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;

		}
		if (head == null) {
			this.head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last.getNext();
		}
		last.setNext(newNode);

		return false;

	}

//	public boolean insert(int data) {
//		Node newNode = new Node(data);
//		if (newNode == null) {
//			return false;
//		}
//		if (head == null) {
//			this.head = newNode;
//			return true;
//		}
//		Node last = head;
//		while (last.getNext() != null) {
//			last.getNext();
//		}
//		last.setNext(newNode);
//		return true;
//
//	}

// public boolean insert (int data) {
//   Node newNode=new Node(data);
//	 if(newNode==null) {
//		 return false;
//	 }
//	 if(head==null) {
//		 this.head=newNode;
//		 return true;
//	 }
//	 Node last=head;
//	 while(last.getNext()!=null) {
//		 last=last.getNext();
//	 }
//	 last.setNext(newNode);
//	return true;
// }
	public void display(Node head) {
		if (head == null) {
			return;
		}
		System.out.println(head.getData());
		display(head.getNext());

	}

	public void displayRev(Node head) {
		if (head == null) {
			return;
		}
		displayRev(head.getNext());
		System.out.println(head.getData());
	}

	public boolean insertByPosition(int data, int position) {
		if (position <= 0) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;

			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;

	}

	public boolean deleteByval(int data) {
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}
		Node prev = head, del = head;
		while (del.getData() != data) {
			//prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean deleteByPosition(int position) {
		if (position <= 0) {
			return false;
		}
		if (position == 1) {
			head = head.getNext();
			return true;

		}
		Node prev=head;
		for(int i =1;i<position -1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==null) {
				return false;
			}
		}Node del=prev.getNext();
				prev.setNext(del.getNext());
		return true;
	}

}
