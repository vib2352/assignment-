
	ListNode h1 = headA;
    ListNode h2 = headB;
    
    int h1size = 0;
    int h2size = 0;
    
    while(h1 != null)
    {
        h1size++;
        h1 = h1.next;
    }
    while(h2 != null)
    {
        h2size++;
        h2 = h2.next;
    }
    
    int diff = Math.abs(h1size - h2size);
    
    if(h1size > h2size)
    {
        for(int i = 0; i < diff; i++)
        {
            headA = headA.next;
        }
    }
    else
    {
        for(int i = 0; i < diff; i++)
        {
            headB = headB.next;
        }
    }
    
    while(headA != headB)
    {
        headA = headA.next;
        headB = headB.next;
    }
    
    return headA;

}
