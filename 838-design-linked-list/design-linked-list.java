class MyLinkedList {
    class Node{
        int val;
        Node next;
            Node(int val){
                this.val=val;
                this.next=null;
            }
        }
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp=head;
        for(int i=1; i<=index; i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        else if(index==0)  addAtHead(val);
        else if(index==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1 ; i<index; i++){
                temp=temp.next;
            }
            Node t= new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head=head.next;
            size--;

            if(size == 0) {
            tail = null;
            }
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//deleteing
        if(index==size-1) tail= temp;//if we have to remove the tail
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */