/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 10/10/2022
 */
package mm23kk_assignment_2;
import java.util.Iterator;

public class Problem_5_main {
    public static void main(String[] args) {
        Problem_5_BinaryTree BinaryTree = new Problem_5_BinaryTree();

        // Add values to tree.
        BinaryTree.add(6);

        BinaryTree.add(10);

        BinaryTree.add(8);

        BinaryTree.add(3);

        BinaryTree.add(9);

        BinaryTree.add(4);

        BinaryTree.add(5);

        BinaryTree.add(7);

        BinaryTree.add(2);

        BinaryTree.add(1);

        // Print current tree as array.
        System.out.print("\nCurrent Tree: [");
        BinaryTree.print();
        System.out.println("]");

        // Remove value 3.
        //	BinaryTree.remove(10);
        // Check if 3 is still there.
        System.out.println("\nContains 10: " + BinaryTree.contains(10));

        // Print current tree as array.
        System.out.print("\nCurrent Tree: [");
        BinaryTree.print();
        System.out.println("]");

        // Return height
        System.out.println("\nCurrent height: " + BinaryTree.height());

        System.out.println("\nContains 8: " + BinaryTree.contains(8));

        BinaryTree.removeKth(3);

        // Print current tree as array.
        System.out.print("\nCurrent Tree: [");
        BinaryTree.print();
        System.out.println("]");

        // In order iterator.
        System.out.println("\nInorder iterator: ");
        Iterator<Integer> Inorder = BinaryTree.iterator();
        System.out.print("[");
        while (Inorder.hasNext()) {
            System.out.print(Inorder.next() + ", ");
        }
        System.out.println("]");

        BinaryTree.removeKth(4);
        // In Preorder iterator..
        System.out.println("\nPreorder iterator largest 4th gone : ");
        Iterator<Integer> Preorder = BinaryTree.preIterator();
        System.out.print("[");
        while (Preorder.hasNext()) {
            System.out.print(Preorder.next() + ", ");
        }
        System.out.println("]");

        // remove 3.

        BinaryTree.remove(3);

        // Postorder iterator.
        System.out.println("\nPostorder iterator, 3 removed: ");
        Iterator<Integer> Postorder = BinaryTree.postIterator();
        System.out.print("[");
        while (Postorder.hasNext()) {
            System.out.print(Postorder.next() + ", ");
        }
        System.out.println("]");

        System.out.println("\nSize of tree: " + BinaryTree.size());

        System.out.println("\nHeight of tree: " + BinaryTree.height());
    }
}
