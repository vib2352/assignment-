 ListNode n3 = new ListNode();
        ListNode res = null;
        int count = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        
        while(head1 != null && head2 != null)
        {
            if(head1.val < head2.val)
            {
                n3.next = new ListNode(head1.val);
                if(count == 0)
                {
                    res = n3.next;
                }
                count++;
                n3 = n3.next;
                head1 = head1.next;
            }
            else
            {
                n3.next = new ListNode(head2.val);
                if(count == 0)
                {
                    res = n3.next;
                }
                count++;
                n3 = n3.next;
                head2 = head2.next;
            }
        }
        
        while(head1 != null)
        {
            n3.next = new ListNode(head1.val);
            if(count == 0)
            {
                res = n3.next;
            }
            count++;
            n3 = n3.next;
            head1 = head1.next;
        }
        while(head2 != null)
        {
            n3.next = new ListNode(head2.val);
            if(count == 0)
            {
                res = n3.next;
            }
            count++;
            n3 = n3.next;
            head2 = head2.next;
        }
        
        return res;
