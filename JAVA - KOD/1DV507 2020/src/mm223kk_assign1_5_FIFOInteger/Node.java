/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_5_FIFOInteger;

public class Node {
	
private int data;			 // Holds the data of the element
protected Node next;		// Points at the next node.(Element/data)

/**
 * Constructor that achieves new element and sets data to that.
 * 
 * @param element Element that the node will hold.
 */

	public Node(int element){
	this.data = element;		// Sets data as the added element.
	
	this.next = null;			// Points at null, until new Node/element is added.
	}

/**
 * Method that is used when retrieving the data in the node.
 * @return Returns the data(element) in the node.
 */
	protected int data() {
	
	return this.data;
	}

}
