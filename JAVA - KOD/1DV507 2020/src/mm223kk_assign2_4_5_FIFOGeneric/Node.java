/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;

public class Node<T> {
	
private T data;			 // Holds the data of the element
protected Node<T> next;		// Points at the next node.(Element/data)

/**
 * Constructor that achieves new element and sets data to that.
 * 
 * @param element Element that the node will hold.
 */

	public Node(T element){
	this.data = element;		// Sets data as the added element.
	
	this.next = null;			// Points at null, until new Node/element is added.
	}

/**
 * Method that is used when retrieving the data in the node.
 * @return Returns the data(element) in the node.
 */
	protected T data() {
	
	return this.data;
	}

}
