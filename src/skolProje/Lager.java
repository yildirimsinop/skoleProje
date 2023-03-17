package SkolProje;

import java.util.Scanner;

public class Lager {

    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih = "";

        do {

            System.out.println("========== YILDIZ KOLEJI ==============\n"+
                    "============= ANA MENU ================\n" +
                    "\n" +
                    "\t    1- Okul Bilgileri Goruntule\n" +
                    "\t    2- Ogretmen Menu\n" +
                    "\t    3- Ogrenci Menu\t\t\n" +
                    "\t    Q- Cikis\n");

            System.out.println("Lutfen Menuden tercihinizi yapiniz");

            tercih = scan.nextLine();

            switch (tercih) {

                case "1" : // Okul Bilgileri

                    Lager.okulBilgileriniYazdir ();


                    break;
                case "2" : // Ogretmen menu
                    Larer.ogretmenMenu ();

                    break;
                case "3" : // Ogrenci menu
                    break;
                case "q" :
                case "Q" :
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }

        } while (!tercih.equalsIgnoreCase("q"));

        Lager.projeDurdur();

    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("========== YILDIZ KOLEJI ==============\n" +
                "\t\t Adres : " + Skol.adres +
                "\n\t\t Telefon : " + Skol.telefon);

        Thread.sleep(5000);

    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
    }
}