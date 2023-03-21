/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 10/10/2022
 */
package mm23kk_assignment_2;
import java.util.Iterator;

/*****************************************
 * The classes down here are for the iterators.
 * The first one is Inorder, second is "Preorder" and the last Postorder.
 * The method iterator, preIterator and postIterator can e used.
 */
class Inorder implements Iterator<Integer> {
    private int[] data;
    private int arrayIndex;
    private int index;
    private int size;

    public Inorder(int size, BTNode root) {
        this.size = size;
        this.index = this.arrayIndex = 0; // Set all index counters to 0
        this.data = dataArray(root, new int[size()]); // Get all the values from the tree.
    }

    /**
     * Method used to create an array of all elements.
     * The elements are added using the in order method.
     * @param node - starting node, which is the root.
     * @param arr - Empty array where all elements will be.
     * @return
     */
    private int[] dataArray(BTNode node, int[] arr) {
        if (node != null) {
            dataArray(node.left, arr);
            arr[arrayIndex++] = node.key; // Add current element to array.
            dataArray(node.right, arr);
        }

        return arr; // Returns an array with all elements in the tree ordered.
    }

    // Returns the size of the tree.
    private int size() {
        return size;
    }

    public boolean hasNext() {
        if (index != size() && size() != 0)
            return true;
        else
            return false; // Return false if this is the last.
    }

    /*
     * Returns the element that the iterator is on.
     */
    public Integer next() {
        return data[index++];
    }
}

/**
 * Implementation of Preorder iterator class
 *
 */
class Preorder implements Iterator<Integer> {
    private int[] data; // Array holding all the values from the ree.
    private int arrayIndex; // Array index used for
    private int index;
    private int size;

    public Preorder(int size, BTNode root) {
        this.size = size;
        this.index = this.arrayIndex = 0; // Set all counters to 0
        this.data = dataArray(root, new int[size()]); // Get all the values from the tree.
    }

    /**
     * Method used to create an array of all elements.
     * The elements are added using the in order method.
     * @param node - starting node, which is the root.
     * @param arr - Empty array where all elements will be.
     * @return
     */
    private int[] dataArray(BTNode node, int[] arr) {
        if (node == null)
            return null;

        arr[arrayIndex++] = node.key; // Add current element to array.
        dataArray(node.left, arr); // Go throw left sub tree.
        dataArray(node.right, arr); // Go throw right sub tree.

        return arr; // Returns an array with all elements in the tree ordered.
    }

    private int size() {
        return size;
    }

    /**
     * Used to check if the are more elements waiting for print.
     */
    public boolean hasNext() {
        if (index != size() && size() != 0)
            return true;
        else
            return false; // Return false if this is the last.
    }

    /*
     * Returns the element that the iterator is on.
     */
    public Integer next() {
        return data[index++];
    }
}

/**
 * Implementation of Postorder iterator class
 *
 */
class Postorder implements Iterator<Integer> {
    private int[] data;
    private int arrayIndex;
    private int index;
    private int size;

    public Postorder(int size, BTNode root) {
        this.size = size; // Set size.
        this.index = this.arrayIndex = 0; // Set all counters to 0
        this.data = dataArray(root, new int[size()]); // Get all the values from the tree.
    }

    private int size() {
        return size;
    }

    /**
     * Method used to create an array of all elements.
     * The elements are added using the post order method.
     * Starts with the most left sub-tree prints each tree going upwards.
     * When done, goes to the right sub trees from the leafs.
     * @param node - starting node, which is the root.
     * @param arr - Empty array where all elements will be.
     * @return
     */
    private int[] dataArray(BTNode node, int[] arr) {
        if (node == null)
            return null;

        dataArray(node.left, arr); // Go to the left sub-tree.
        dataArray(node.right, arr); // Go to the right sub-tree.
        arr[arrayIndex++] = node.key; // Get the current node and add to array.

        return arr; // Returns an array with all elements in the tree ordered.
    }

    public boolean hasNext() {
        if (index != size() && size() != 0)
            return true;
        else
            return false; // Return false if this is the last.
    }

    public Integer next() {
        return data[index++];
    }
}