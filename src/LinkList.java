class LinkList {
	
 static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static Node head;
	
	public static void add(int data){
		Node newNode = new Node(data);
		if(head == null){
			head =  newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public static Node reversLink(){
		Node prev = null;
		Node nextNode = null;
		Node currentNode = head;
		
		
		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next = prev;
			
			prev = currentNode;
			currentNode = nextNode;
		}
		
		head = prev;
		return prev;
		
	}
	
	public static Node deleteNode(int key){
		// [1,2,3,4]
		Node temp = head;
		while(temp != null){
			if(temp.data == key){
				temp.next = temp.next.next;
			}
			
			temp = temp.next;
		}
		
		return head;
	}
	
	public static void printNode(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public static Node sort(){
		Node curr = head;
		Node index = null;
		int temp;
		while(curr != null){
			index = curr.next;
			while(index != null){
				if(curr.data > index.data){
					temp = curr.data;
					curr.data = index.data;
					index.data = temp;
				}
				
				index = index.next;
			}
			
			curr = curr.next;
		}
		
		return head;
	}
	
	public static void main(String args[]) {
		LinkList node = new LinkList();
		node.add(1);
		node.add(4);
		node.add(3);
		node.add(8);
		node.add(7);
		node.add(6);
		node.add(9);
		
		// node.printNode();
		// node.reversLink();
		// node.deleteNode(2);
		node.sort();
		node.printNode();
	}
} 
