package com.codes.Collections;

public class SLL {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null)
            tail = head;
        //size++;
    }
    public void insertLast(int val){
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        Node prev = find(index);
        if(prev == null){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;
    }
    public Node find(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            if(node.next==null)
                return node;
            node = node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return val;
    }
    public int deleteLast(int index){
        int val = tail.val;
        Node pre = find(index-1);
        pre.next = null;
        tail = pre;
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size)
            return deleteLast(index);
        Node prev = find(index);
        prev.next = prev.next.next;
        return prev.next.val;
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node node = head;
        int size = 0;
        while(node!=null){
            node = node.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return head;
        }
        Node prev = head;
        Node temp = head;
        for(int i = 1 ; i < size-n; i++){
            temp = temp.next;
            prev = temp;
            System.out.println(prev.val);
        }
        prev.next = prev.next.next;

        return head;

    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertFirst(54);
        sll.insertFirst(4);
        sll.insertFirst(65);
        sll.insertFirst(6);
        sll.insertFirst(58);
        sll.insertFirst(41);
        sll.insertFirst(9);
        sll.display();
        sll.removeNthFromEnd(sll.head, 2);
        sll.display();
    }
}
