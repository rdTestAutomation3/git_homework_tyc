package Homework_5;

public class maasHesapla {

    String calisan_ad;
    String calisan_soyad;
    String calisan_pozisyon;
    int calisilan_gun;
    double calisan_maas;
    double calisan_prim;

    public String getCalisan_ad() {
        return calisan_ad;
    }
    public void setCalisan_ad(String calisan_ad) {
        this.calisan_ad = calisan_ad;
    }
    public String getCalisan_soyad() {
        return calisan_soyad;
    }
    public void setCalisan_soyad(String calisan_soyad) {
        this.calisan_soyad = calisan_soyad;
    }
    public String getCalisan_pozisyon() {
        return calisan_pozisyon;
    }
    public void setCalisan_pozisyon(String calisan_pozisyon) {
        this.calisan_pozisyon = calisan_pozisyon;
    }
    public int getCalisilan_gun(){
        return calisilan_gun;
    }
    public void setCalisilan_gun(int calisilan_gun){
        this.calisilan_gun = calisilan_gun;
    }
    public double getCalisan_maas(){
        return calisan_maas;
    }
    public void setCalisan_maas(double calisan_maas){
        this.calisan_maas = calisan_maas;
    }
    public double getCalisan_prim(){
        return calisan_prim;
    }public void setCalisan_prim(double calisan_prim){
        this.calisan_prim = calisan_prim;
    }
    double maas;

    public double PrimliMaasHesapla(){
        maas = calisilan_gun * calisan_maas;
        if (calisilan_gun > 25)
        {
            calisilan_gun = calisilan_gun - 25;
            calisan_prim = calisilan_gun * 1000;
        }
        return calisan_prim+maas;
    }

    public void calisanBilgiGoster(){
        System.out.println(calisan_ad + " " +calisan_soyad + "," + calisan_pozisyon + " olarak çalışmaktadır." );
    }

    public void calisanMaasGoster(){
        System.out.println(calisan_ad + "," + PrimliMaasHesapla() + "TL kazanmaktadır."  );
    }
}
