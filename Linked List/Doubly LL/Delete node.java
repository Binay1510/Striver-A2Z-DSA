class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	if(x==1){
	    return head.next;
	}
	int c=1;
	Node temp =head;
	
	while(c<x && temp!=null){
	    c++;
	    temp=temp.next;
	}
	if(temp.next!=null){
	temp.prev.next= temp.next;
	temp.next.prev= temp.prev;
	}
	else{
	    temp.prev.next=null;
	}
	return head;
    }
    
}
