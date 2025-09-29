package BagliListe;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void ekle(int x) {
        Node eleman = new Node();   //eklenecek olan düğüm(obje)
        eleman.data = x;
        eleman.next = null;

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm(obje) eklendi");
        } else {
            tail.next = eleman;
            tail = eleman;
            System.out.println("Listenin sonuna yeni bir eleman eklendi");
        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("Liste yapısı boş !!!");
        } else {
            Node temp = head;
            System.out.print("\nbaş -> ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("son.");
        }
    }

}
