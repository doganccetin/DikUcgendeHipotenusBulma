import java.util.Scanner;
public class HipotenusHesapla {
    public static void main (String[]args){

        int Kenar1, Kenar2;
        double H;

        //input kısmına istediğimiz şeyi yazabiliriz...
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz: ");
        Kenar1 =input.nextInt();

        System.out.print("İkinci Kenarı Giriniz: ");
        Kenar2 = input.nextInt();

        H=Math.sqrt((Kenar1*Kenar1) + (Kenar2*Kenar2));
        System.out.print("Hipotenüs: " + H);

    }
}
