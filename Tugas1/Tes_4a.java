package Tugas1;

public class Tes_4a {
	public static void main(String [] args) {
	    // membuat 4 buah node n1, n2, n3, dan n4
	    Node n1 = new Node(5);
	    Node n2 = new Node(7);
	    Node n3 = new Node(9);
	    Node n4 = new Node(8);
	    
	    // membuat relasi antar node
	    n1.setNext(n2);
	    n2.setNext(n3);
	    n3.setNext(n4);

	    // menampilkan Node n1, n2, n3, dan n4 dengan pointer p
	    Node p = n1;
	    while (p != null) {
	        System.out.printf("%d ", p.getNilai()); 
	        p = p.getNext();
	    }
	}
}
