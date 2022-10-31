import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        double notToplami=0;
        System.out.print("matematik notunu gir: ");
        int mat= klavye.nextInt();
        if (mat>0 && mat<101){
            notToplami+=mat;
        }
        else {
            System.out.println("gecersiz not");
            notToplami+=0;
        }


        System.out.print("fizik notunu gir: ");
        int fizik= klavye.nextInt();

        if (fizik>0 && fizik<101)
        {
            notToplami+=fizik;
        }
        else {
            System.out.println("gecersiz not");
            notToplami+=0;
        }

        System.out.print("türkçe notunu gir: ");
        int turkce= klavye.nextInt();

        if (turkce>0 && turkce<101){
            notToplami+=turkce;
        }
        else {
            System.out.println("gecersiz not");
            notToplami+=0;
        }

        System.out.print("kimya notunu gir: ");
        int kimya= klavye.nextInt();

        if (kimya<101 && kimya>0){
            notToplami+=kimya;
        }
        else {
            System.out.println("gecersiz not");
            notToplami+=0;
        }

        System.out.print("müzik notunu gir: ");
        int muzik= klavye.nextInt();
        if (muzik>0 && muzik<101){
            notToplami+=muzik;
        }
        else {
            System.out.println("gecersiz not");
            notToplami+=0;
        }

        double ort=notToplami/5;
        System.out.println("ort: " +ort);

        if (ort>55){
            System.err.println("Dersten Geçtiniz.Tebrikler.");

        }
        else {
            System.err.println("Dersten Kaldınız !");
        }





    }
}