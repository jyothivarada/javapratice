import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {



    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = BinaryTree.createBinaryTree();

        System.out.println(bt.root.getValue());

        bt.traverseInOrder(bt.root);

        bt.add(2);

        System.out.println(".......");
        System.out.println(bt.root.getValue());


        bt.traversePreOrder(bt.root);
        System.out.println(".........................");
        System.out.println(bt.root.getValue());


        bt.traversePostOrder(bt.root);
        System.out.println(".........................");
        System.out.println(bt.root.getValue());

        System.out.println(".........................");
    }


}
