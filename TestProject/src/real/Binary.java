package real;

import java.util.ArrayList;
import java.util.List;

public class Binary {

    Node root;

    public class Node {

        private int value;
        private Node left;
        private Node right;
        private int level = 0;

        public Node(int value, int level) {
            this.left = null;
            this.right = null;
            this.value = value;
            this.level = level;
        }
    }

    public void add(int value, int level) {
        root = addRecursiveNode(root, value, level);
    }

    private Node addRecursiveNode(Node current, int value, int level) {
        if(current == null) {
            return new Node(value, level);
        }

        if(current.left != null) {
            current.left =  new Node(value, level+1);
        }
        else if(current.right != null) {
            current.right =
                    addRecursiveNode(current.right, value, current.level + 1);
        }
        return current;
    }

    public static void main(String args[]) {
       Binary bt = new Binary();
        bt.add(1,1);
        bt.add(2,1);
        bt.add(3,1);
        bt.add(4,1);
        bt.add(5,1);
        bt.add(6,1);
        bt.add(7,1);

        System.out.println(bt.findSiblings(bt.root, bt.findlevel(bt.root, 5)).toArray());
    }

    public int findlevel(Node node, int value) {
        if(node.value == value) {
            return node.level;
        }
        if(node.value > value) {
            findlevel(node.left, value);
        }
        else if(node.value < value) {
             findlevel(node.right, value);
        }
        return -1;
    }

    public List<Integer> findSiblings(Node node, int level) {
        List<Integer> elements = new ArrayList<>();
        if(node != null) {
            if (node.level == level) {
                elements.add(node.value);
            }
            findSiblings(node.right, level);
            findSiblings(node.left, level);
        }
        return elements;
    }


    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" "+node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" "+node.value);
            traverseInOrder(node.left);
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            traverseInOrder(node.right);
            System.out.print(" "+node.value);
        }
    }
}
