/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 10/10/2022
 */
package mm23kk_assignment_2;
import java.util.Iterator;

public class Problem_5_BinaryTree implements Iterable<Integer> {
    private BTNode root; // The root of the tree.
    private int size; // The size of the tree.
    private int count; // Counter used for returning the kth-largest.

    public Problem_5_BinaryTree() {
        this.root = null; // Initialize root as null.
        this.size = 0; // Set size to 0.
    }

    /**
     * Used to calculate the height of the tree.
     * @return - Returns a value corresponding the tree height.
     */
    public int height() {
        return calcHeight(root) - 1;
    }

    /**
     * Starts at root and looks for the leaf farthest away from the root,
     * Calculates how many edges "--->" that are passed before that leaf.
     * This is done recursively, by splitting left and right into sub trees.
     * @param currentNode
     * @return returns the height.
     */
    private int calcHeight(BTNode currentNode) {
        if (currentNode == null) // Check if current node is 0.
            return 0;
        else {
            int leftHeight = calcHeight(currentNode.right); // Initialize the depth of left height.
            int rightHeight = calcHeight(currentNode.left); // Initialize the depth of right height.

            if (rightHeight > leftHeight) // Check which one is larger, and add 1 to it.
                return rightHeight + 1;
            else
                return leftHeight + 1; // Check which one is larger, and add 1 to it.
        }
    }
    /**
     * Returns  the current size of the tree.
     * @return - Number of nodes in the tree.
     */
    public int size() {
        return size;
    }

    /**
     * Used to recursively search for an empty spot in the tree, and add a
     * value.
     * @param value - The value that will be added.
     */
    public void add(int value) {
        if (root == null) { // If the root is empty. Which means tree is empty.
            root = new BTNode(value); // Create new root node with value.
            size++; // Increase size.
        } else if (root.key == value) // Do nothing if value is already in root.
            return; // Do nothing if value is same as root key.
        else {
            addWhere(value, root); // Search recursively for an empty spot.
            size++; // Increase size.
        }
    }

    /**
     * Function used to travel through tree in order to find empty spot.
     * @param value - the value that function should find sport for.
     * @param currentNode - starting point of tree.
     */
    private void addWhere(int value, BTNode currentNode) {
        if (currentNode.key == value) // Do nothing if the key already exists.
            return;
        else if (value > currentNode.key && currentNode.right == null) // Value is larger then key.
            currentNode.right = new BTNode(value); // If yes, add new key.
        else if (value < currentNode.key && currentNode.left == null)
            currentNode.left = new BTNode(value); // If yes, add new key.
        else if (value > currentNode.key)
            addWhere(value, currentNode.right); // Continue check on right sub-tree.
        else
            addWhere(value, currentNode.left); // Continue check on left sub-tree.
    }

    /**
     * Used to remove a value in the tree.
     * @param value - value wants to be removed.
     */
    public void remove(int value) {
        if (!removeTravel(value, root,
                root)) // If tree does not contain value, then throw error.
            throw new NullPointerException("The value does not exist in the tree.");
        else
            size--; // Decrease size of tree.
    }
    /**
     * Function used to recursively search and remove a node from the tree.
     * @param value - The value that is going to be removed.
     * @param currentNode - Starting point. Root.
     * @param prevNode - Previously node. (Parent node of current child).
     * @return	True - if the value if found and deleted, else false.
     */
    private boolean removeTravel(int value, BTNode currentNode, BTNode prevNode) {
        if (currentNode == null) // If tree is empty, or node is not in tree.
            return false;

        if (currentNode.key == value) { // Check if current children key is equal to value.

            if (currentNode.isLeaf()) { // Check if leaf.

                if (currentNode == root) // If the root is a leaf reset it.
                    root = null; // Set root to null.
                else if (currentNode.key > prevNode.key) // Check if left or right child.
                    prevNode.right = null; // Set right of parent to null.
                else
                    prevNode.left = null; // Set left of parent to null.

            } else if (currentNode.oneChild()) { // Check if only one child.

                if (currentNode.key > prevNode.key) // Check left or right of parent.
                    if (currentNode.right != null) // Check if one child on left or right.
                        prevNode.right = currentNode.right; // Change right pointer of parent node.
                    else
                        prevNode.right = currentNode.left; // Change right pointer of parent node.
                else // Check left or right of parent.
                    if (currentNode.right != null) // Check if one child on left or right.
                    prevNode.left = currentNode.right; // Change left pointer of parent node.
                else
                    prevNode.left = currentNode.left; // Change left pointer of parent node.
            } else if (currentNode.isFull()) {
                int prodeccor = findMin(currentNode.right); // Find the and save the minimum
                                                            // leaf on the right.
                remove(prodeccor); // Remove the minimum leaf from the tree.
                size++; // Reset size since remove, reduces the size.;
                currentNode.key = prodeccor; // Replace the deleted node with
                                             // minimum leaf key.
            }

            return true; // Return true for value found and deleted.

        } else if (value > currentNode.key) { // Check if current value is grater then key.
            prevNode = currentNode; // Current node to parent node.
            return removeTravel(value, currentNode.right,
                prevNode); // If yes, go to right child.
        } else {
            prevNode = currentNode;
            return removeTravel(value, currentNode.left, prevNode); // If no go, to left child.
        }
    }

    /**
     * Function used to find the minimum value of a given right-sub-tree.
     * @param currentNode - First node of the right sub tree.
     * @return	- returns the minimum child-key-value.
     */
    private int findMin(BTNode currentNode) {
        if (currentNode.left != null) // Check if the upcoming left child is null.
            return findMin(currentNode.left); // Jump to the left child in not null.

        return currentNode.key; // Return the key of the least leaf on the right side.
    }

    /**
     *Checks if tree contains a certain value.
     ** @param value - value that user is looking for in tree contains.
     */
    public boolean contains(int value) {
        return travel(value, root);
    }

    /**
     * This function is used to return the kth largest value,
     * in the binary tree.
     * @param k - Kth largest parameter.
     */
    public void removeKth(int k) {
        if (k > size() || k <= 0) // Check if correct k is entered.
            throw new NullPointerException(
                "There is no such k, element. Size: " + size()); // If no throw error.

        count = 0; // Set c to 0.
        // Running the findKth function with root node and empty. Return an
        // array containing all elements ordered.
        remove(findKth(root,
            new int[size()])[size() - k]); // The kth-largest element index is located and removed.
    }

    /**
     * This function is used to find all elements in the tree,
     * while allaying then in order of an empty array.
     * @param node - The root node where the traversing begins.
     * @param arr	- an empty array that will contain all tree elements
     *     ordered.
     * @return - return an array with all elements in the tree ordered.
     */
    private int[] findKth(BTNode node, int[] arr) {
        if (node != null) {
            findKth(node.left, arr); // Traverse from the left subtree.
            arr[count++] = node.key;
            findKth(node.right, arr); // Traverse the right sub tree.
        }

        return arr; // Returns an array with all elements in the tree ordered.
    }

    /**
     * Used when recursively traveling inside the tree.
     * Called by the function contains(). In order to look for a certain key,
     * in the tree.
     * @param value - The value/key that the user is looking for.
     * @param currentNode - Starting node before traveling in tree. Starts with
     *     root.
     * @return	- True if value was found, else false.
     */
    private boolean travel(int value, BTNode currentNode) {
        if (currentNode == null) // Check if current spot is empty.
            return false;
        else if (currentNode.key == value) // Do nothing if the key exist.
            return true;
        else if (value > currentNode.key) // Search on the right sub tree.
            return travel(value, currentNode.right);
        else
            return travel(value, currentNode.left); // Else search on the left.
    }

    /**
     * Used to print the values inside the tree,
     * Only used while testing the tree.
     * Not the iterator.
     */
    public void print() {
        traverseTree(root);
    }
    /**
     * Part of the print function above.
     * Used as above function to print,
     * all the current values in the tree.
     * Uses the inorder method.
     * @param node - The root node where it all starts.
     */
    private void traverseTree(BTNode node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print("" + node.key);
            System.out.print(", ");
            traverseTree(node.right);
        }
    }

    /**
     * Method used to create the "inorder" Iterator Class.
     */
    public Iterator<Integer> iterator() {
        return new Inorder(size(), root);
    }

    /**
     * Method used to create the "Preorder" Iterator Class.
     */
    public Iterator<Integer> preIterator() {
        return new Preorder(size(), root);
    }

    /**
     * Method used to create the "Postorder" Iterator Class.
     */
    public Iterator<Integer> postIterator() {
        return new Postorder(size(), root);
    }
}