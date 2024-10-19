package Question2OddEvenLinkedList;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

	}

	public ListNode oddEvenList(ListNode head) {
	 
		

        // Temel durumları kontrol et
        if (head == null || head.next == null) {
            return head;
        }

        // Tek ve çift düğümleri ayırmak için işaretçiler
        ListNode odd = head; // Tek düğümler
        ListNode even = head.next; // Çift düğümler
        ListNode evenHead = even; // Çift düğümlerin başını tut

        // Düğümleri gruplandırma
        while (even != null && even.next != null) {
            odd.next = even.next;  // Tek düğümleri sıradaki tek düğüme bağla
            odd = odd.next;        // Tek düğüme geçiş yap

            even.next = odd.next;  // Çift düğümleri sıradaki çift düğüme bağla
            even = even.next;      // Çift düğüme geçiş yap
        }

        // Tek ve çift düğümleri birleştir
        odd.next = evenHead;

        return head;
	 }

}

