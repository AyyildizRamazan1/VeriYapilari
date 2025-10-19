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

    void arayaEkle(int indis, int x) {
        Node eleman = new Node();
        eleman.data = x;
        if (head == null && indis == 0) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluştu, ilk eleman eklendi");
        } else if (head != null && indis == 0) {
            eleman.next = head;
            head = eleman;
            System.out.println(indis + " indisinci siraya yeni eleman eklendi");
        } else {

        }
    }

    void bastanSil() {
        if (head == null) {
            System.out.println("Liste bos, silinecek nesne yok");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede kalan son elemanda silindi");
        } else {
            head = head.next;
            System.out.println("Bastaki eleman silindi");
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("Liste bos, silinecek nesne yok");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede kalan son elemanda silindi");
        } else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("Sondan eleman silindi ");
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
