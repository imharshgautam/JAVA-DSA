package LinkedList;

class Linkedlist{
    Node head;  // null
    Node tail;  // null

    int size;

    void addAtHead(int val){
        Node temp = new Node(val);
        if( head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    int search(int val){
        if(head == null) return -1;     // false
        Node temp = head;
        int idx = 0;

        while(temp != null){
            if(temp.val == val) return idx;         // true
            temp = temp.next;
            idx++;
        }
        return -1;          // false
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    void insert(int val, int idx) {
        if(idx < 0 || idx > size)  System.out.println("Invalid Index");

        else if(idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    int get(int idx){
        Node temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }


    void delete(int idx) {
        if(idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }

        if(idx == 0){
            deleteAtHead();
            return;
        }

        Node temp = head;
        for(int i = 1; i <= idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;     // delete
        if(idx == size-1) tail = temp;  // we are deleting tail
        size--;
    }
}

public class LLDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);

        ll.display();

        ll.insert(45,2);
        ll.display();

        ll.delete(3); ll.display();





    }

}
