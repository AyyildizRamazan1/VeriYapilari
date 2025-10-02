package TekYonluDogrusalBagLiListe;

public class TekYonluListeYapisi {
    Node head = null;
    Node tail = null;

    void basaEkle(int x) {
        Node eleman = new Node();
        eleman.data = x;
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluştu, ilk eleman eklendi");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println("Başa eleman eklendi.");
        }
    }

    void sonaEkle(int x) {
        Node eleman = new Node();
        eleman.data = x;
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluştu, ilk eleman eklendi");
        } else {
            eleman.next = null;
            tail.next = eleman;//eleman ekle
            tail = eleman;//isim güncelle
            System.out.println("Sona eleman eklendi");
        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("Liste yapisi boş");
        } else {
            Node temp = head;
            System.out.print("Bas - > ");
            while (temp != null) {
                System.out.print(temp.data + " - > ");
                temp = temp.next;
            }
            System.out.print("Son");
        }

    }
}
