package Homework_5;

public class MaasMain {
    public static void main(String[] args) {

        maasHesapla maasHesapla1 = new maasHesapla();
        maasHesapla1.setCalisan_ad("Tuğba");
        maasHesapla1.setCalisan_soyad("Yeşil");
        maasHesapla1.setCalisan_pozisyon("developer");
        maasHesapla1.setCalisan_maas(5000);
        maasHesapla1.setCalisilan_gun(30);

        maasHesapla1.calisanBilgiGoster();
        maasHesapla1.calisanMaasGoster();
    }
}
