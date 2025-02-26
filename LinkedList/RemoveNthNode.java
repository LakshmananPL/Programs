package com.codes.LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthNode {
    private static ListNode head;
    private static ListNode tail;
    public static void main(String[] args) {

        insertLast(1);
        insertLast(2);
        insertLast(3);
        insertLast(4);
        insertLast(5);


        ListNode ans = removeNthFromEnd(head, 5);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(ans.val);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        ListNode temp1 = head;
        int length = 0;
        while(temp1!=null){
            temp1 = temp1.next;
            length++;
        }
        int prev = length - n;
        if(n == length){
            head = head.next;
            return head;
        }
        ListNode temp2 = head;
        int i = 1;
        while(i<prev){
            temp2 = temp2.next;
            i++;
        }
        temp2.next = temp2.next.next;
        return head;
    }
    static void insertLast(int val){
        ListNode node = new ListNode(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }
    static void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
    }

}
