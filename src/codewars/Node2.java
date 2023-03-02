package codewars;

class Node2 {

	  int data;
	  Node2 next = null;
	  
	  Node2(final int data) {
	    this.data = data;
	  }
	  
	  public static Node2 push(final Node2 head, final int data) {
		  Node2 list = new Node2(data);
		  if(head== null) {
			 return list;
		  } else {
			  list.next = head;
			  
		  }
	    return list; 
	  }
	  
	  public static Node2 buildOneTwoThree() {
		    Node2 list = new Node2(3);
		    list = push(list, 2);
		    list = push(list, 1);
		    return list;
	    
	  }
	}