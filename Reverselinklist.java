
	istNode prev = null;
    ListNode next = null;
    
    ListNode current = head;
    
    while(current != null)
    {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    
    head = prev;
    
    return head;


