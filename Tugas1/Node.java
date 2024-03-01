//223040107_Humaira
package Tugas1;

public class Node {
	private int nilai;
    private Node next;

    // Inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
    }

    // Setter & Getter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    // Setter & Getter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
