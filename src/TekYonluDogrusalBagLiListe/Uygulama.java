package TekYonluDogrusalBagLiListe;

public class Uygulama {
    public static void main(String[] args) {
        TekYonluListeYapisi tekList = new TekYonluListeYapisi();
        tekList.basaEkle(10);
        tekList.basaEkle(5);
        tekList.basaEkle(3);
        tekList.sonaEkle(20);

        //tekList.bastanSil();
        tekList.sondanSil();
        tekList.sondanSil();
        tekList.sondanSil();

        tekList.yazdir();
    }
}
