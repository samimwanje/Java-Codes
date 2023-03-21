/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

public class QueueNode<T> {
	
	public T value;
	public QueueNode<T> next = null;			// Next should start with the value null.

	QueueNode(T value){
		
		this.value = value;					// Value of current node.

	}

}
