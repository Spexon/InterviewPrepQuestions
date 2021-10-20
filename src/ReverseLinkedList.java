import java.util.Arrays;

public class ReverseLinkedList {

  /**
   Definition for singly-linked list. */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


  public ListNode reverse() {

      ListNode l1 = new ListNode();
      for (int i = 0; i < 6; i++) {

        l1.next = null;
        l1.val = i;
        System.out.println(l1.val);
      }

      while (l1 != null) {
        System.out.println(l1.val);
        l1 = l1.next;
      }


      return l1;
  }

}
