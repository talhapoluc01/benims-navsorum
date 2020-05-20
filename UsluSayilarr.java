
public class UsluSayilarr extends Sayilarr{
     
    public int us;
    public int fakt=1;
     public int UsluSay(){
       Sayilarr s=new Sayilarr(8);
       us=s.Sayi1*s.Sayi1;
       return us;
    }
     public int Fakt(){
       Sayilarr s=new Sayilarr(4);
         for (int i = s.Sayi1; i >= 1; i--) {
             fakt=fakt*i;
         }
       return fakt;
    }
    public static  void Goster(){
        Sayilarr s=new Sayilarr();
        Sayilarr s1=new Sayilarr(4,5);
        UsluSayilarr s4=new UsluSayilarr();
        System.out.println(s1.toString());
        s.setbolum(5,2);
        System.out.println("Bölüm  :"+s.getbolum());
        System.out.println("Çarpım  :"+s.carpim(2,4));
        System.out.println("Toplam  :"+s.toplam(5,2));
        System.out.println("Fark  :"+s.fark(18,6));
        System.out.println("Üsü  :"+s4.UsluSay());
        System.out.println("Faktöriyeli  :"+s4.Fakt());
    }
   
    public static void main(String[] Args ){
        Goster();
    }
}
