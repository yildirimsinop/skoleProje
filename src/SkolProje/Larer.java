package SkolProje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Larer {

    static Scanner scan = new Scanner (System.in);

    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle () {

        ogretmenlerMap.put("987654321987", "Hasan, Yildiz, 1984, Matte");
        ogretmenlerMap.put("231456987456", "Mahmut, Yildirim, 1987, Fizik");
        ogretmenlerMap.put("569874532145", "Mehmet, Temizoz, 1985, Naturfag");
        ogretmenlerMap.put("326987412358", "Orhan, Yildirim, 1978, Gym");
        ogretmenlerMap.put("985237965412", "Isa, Kaya, 1982, Muzik");
    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = "";

        do {

            System.out.println("========== YILDIZ KOLEJI ==============\n"+
                    "============= ANA MENU ================\n" +
                    "\n" +
                    "\t    1- Ogretmenler Listesi Yazdir\n" +
                    "\t    2- Soyisimden Ogretmen Bulma\n" +
                    "\t    3- Branstan Ogretmen Bulma\n" +
                    "\t    4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t    5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t    A- ANAMENU\n" +
                    "\t    Q- Cikis\n");

            tercih = scan.nextLine();

            switch (tercih) {

                case "1" :
                    break ;
                case "2" :
                    break ;
                case "3" :
                    break ;
                case "4" :
                    break ;
                case "5" :
                    break ;
                case "A" :
                    SkolProje.Lager.anaMenu();
                    break ;
                case "a" :
                    break ;
                case "Q" :
                    break ;
                case "q" :
                    break ;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }


        } while (!tercih.equalsIgnoreCase("q"));
        SkolProje.Lager.projeDurdur();
    }
}