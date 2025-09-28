package DugumOlusturma;

public class Ana {
    public static void main(String[] args) {
        Sinif A = new Sinif();// bellekte düğüm oluşturma
        Sinif B = new Sinif();
        Sinif C = new Sinif();

        A.sayi = 11;
        B.sayi = 22;
        C.sayi = 33;

        A.next = B;//Düğümleri birbirine bağlama
        B.next = C;
        C.next = null;

        Sinif temp = A;

        while (temp != null)//düğümlerin üzerinde dolaşma işlemi//
            {
            System.out.println(temp.sayi);
            temp = temp.next;
        }
    }
}
