package iufanfa;

public class Hash {
	  public static int hash(String input) {
	    int hash = 0;
	    for (int i = 0; i < input.length(); i++) {
	      hash += (int) input.charAt(i);
	    }
	    return hash % 256;
	  }

	  public static void main(String[] args) {
	    int hashValue = hash("hje");
	    System.out.println("Hash value: " + hashValue);
	  }
	}