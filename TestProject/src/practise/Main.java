package practise;

public class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        //list.insertAtIndex(3,20);
        list.insertAtIndex(5,40);
        list.printNodes();
    }
}
