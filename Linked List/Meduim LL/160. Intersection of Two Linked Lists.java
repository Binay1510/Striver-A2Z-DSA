/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet <ListNode> st = new HashSet<>();

        while(headA!=null){
            st.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(st.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
         ListNode a=headA;
         ListNode b=headB;

         while(a!=b){
             if(a==null){
                 a=headB;
             }
             else{
                 a=a.next;
             }
             if(b==null){
                b=headA;
             }
             else{
                 b=b.next;
             }

         }
         return a;



    }
}

//USING HASHMAP
HashSet <ListNode> st = new HashSet<>();

        while(headA!=null){
            st.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(st.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
