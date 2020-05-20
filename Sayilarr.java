
public class Sayilarr {
    public int Sayi1;
    public int Sayi2;
    public int toplam;
    public int fark;
    private int carpim;
    public double bolum;
    public void setcarpim(int carpim){
        this.carpim=carpim;
    }
    public int getcarpim(){
        return carpim;
    }
    Sayilarr(){
        this.bolum=0;
        this.carpim=0;
        this.fark=0;
        this.bolum=0.0;
    }
    Sayilarr(int s1){
        this.Sayi1=s1;
    }
    Sayilarr(int s1, int s2){
         this.carpim=s1*s2;
         System.out.println("Çarpım:   "+this.carpim);
         this.toplam=s1+s2;
         System.out.println("Toplam:   "+this.toplam);
         if (s1>s2) {
            this.fark=s1-s2;
            System.out.println("Fark:   "+this.fark);
        }
         else{
            this.fark=s2-s1;
            System.out.println("Fark:   "+this.fark);
         }
         if (s1>s2) {
            this.bolum=s1/s2;
            System.out.println("Bölüm:   "+this.bolum);
        }
         else{
            this.bolum=s2/s1;
            System.out.println("Bölüm:   "+this.bolum);
         }
    }
    public int carpim(int s1, int s2){
        this.carpim=s1*s2;
        return this.carpim;
    }
    public int toplam(int s1, int s2){
        this.toplam=s1+s2;
        return this.toplam;
    }
    public int fark(int s1, int s2){
        if (s1>s2) {
            this.fark=s1-s2;
        }
        else
            this.fark=s2-s1;
        return this.fark;
    }
    public void setbolum(int s1, int s2){
         if (s1>s2) {
            this.bolum=s1/s2;
        }
        else
            this.bolum=s2/s1;
    }
    public double getbolum(){
        return this.bolum;
    }
   

}
