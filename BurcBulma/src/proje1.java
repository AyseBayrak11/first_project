
import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum bilgilerini al
        System.out.print("Doğduğunuz ayı (1-12 arası) girin: ");
        int ay = scanner.nextInt();

        System.out.print("Doğduğunuz günü (1-31 arası) girin: ");
        int gun = scanner.nextInt();

        System.out.print("Doğduğunuz saati (0-23 arası) girin: ");
        int saat = scanner.nextInt();

        String[] burclar = {"Kova", "Balık", "Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak"};
        String[] yukselenler = {"Koç Yükseleni", "Boğa Yükseleni", "İkizler Yükseleni", "Yengeç Yükseleni", "Aslan Yükseleni", "Başak Yükseleni", "Terazi Yükseleni", "Akrep Yükseleni", "Yay Yükseleni", "Oğlak Yükseleni", "Kova Yükseleni", "Balık Yükseleni"};

        String burc = burcHesapla(ay, gun, burclar);
        String yukselen = yukselenHesapla(saat, yukselenler);
        String burcOzellikleri = burcOzellikleri(burc);
        String anlastigiBurclar = anlastigiBurclar(burc);

        if (!burc.isEmpty()) {
        	// isEmpty Burç geçerli bir şekilde hesaplandıysa  çalışır.
        	System.out.println();
            System.out.println("Burcunuz: " + burc);
            System.out.println("Yükseleniniz: " + yukselen);
            System.out.println("Burcunuzun Özellikleri: " + burcOzellikleri);
            System.out.println("Anlaştığınız Burçlar: " + anlastigiBurclar);
        } else {
        	// Burç boşsa (geçersiz bir tarih girildiyse) bu blok çalışır.
            System.out.println("Geçersiz tarih girdiniz. Lütfen tekrar deneyin.");
        }

        scanner.close();
    }

    public static String burcHesapla(int ay, int gun, String[] burclar) {
        String burc = "";

        if ((ay == 1 && gun >= 20 && gun <= 31) || (ay == 2 && gun <= 18 && gun >= 1)) {
            burc = burclar[0];
        } else if ((ay == 2 && gun >= 19 && gun <= 29) || (ay == 3 && gun <= 20 && gun >= 1)) {
            burc = burclar[1];
        } else if ((ay == 3 && gun >= 21 && gun <= 31) || (ay == 4 && gun <= 19 && gun >= 1)) {
            burc = burclar[2];
        } else if ((ay == 4 && gun >= 20 && gun <= 30) || (ay == 5 && gun <= 20 && gun >= 1)) {
            burc = burclar[3];
        } else if ((ay == 5 && gun >= 21 && gun <= 31) || (ay == 6 && gun <= 20 && gun >= 1)) {
            burc = burclar[4];
        } else if ((ay == 6 && gun >= 21 && gun <= 30) || (ay == 7 && gun <= 22 && gun >= 1)) {
            burc = burclar[5];
        } else if ((ay == 7 && gun >= 23 && gun <= 31) || (ay == 8 && gun <= 22 && gun >= 1)) {
            burc = burclar[6];
        } else if ((ay == 8 && gun >= 23 && gun <= 31) || (ay == 9 && gun <= 22 && gun >= 1)) {
            burc = burclar[7];
        } else if ((ay == 9 && gun >= 23 && gun <= 30) || (ay == 10 && gun <= 22 && gun >= 1)) {
            burc = burclar[8];
        } else if ((ay == 10 && gun >= 23 && gun <= 31) || (ay == 11 && gun <= 21 && gun >= 1)) {
            burc = burclar[9];
        } else if ((ay == 11 && gun >= 22 && gun <= 30) || (ay == 12 && gun <= 21 && gun >= 1)) {
            burc = burclar[10];
        } else if ((ay == 12 && gun >= 22 && gun <= 31) || (ay == 1 && gun <= 19 && gun >= 1)) {
            burc = burclar[11];
        }

        return burc;
    }

    public static String yukselenHesapla(int saat, String[] yukselenler) {
        if (saat >= 6 && saat < 8) {
            return yukselenler[0];
        } else if (saat >= 8 && saat < 10) {
            return yukselenler[1];
        } else if (saat >= 10 && saat < 12) {
            return yukselenler[2];
        } else if (saat >= 12 && saat < 14) {
            return yukselenler[3];
        } else if (saat >= 14 && saat < 16) {
            return yukselenler[4];
        } else if (saat >= 16 && saat < 18) {
            return yukselenler[5];
        } else if (saat >= 18 && saat < 20) {
            return yukselenler[6];
        } else if (saat >= 20 && saat < 22) {
            return yukselenler[7];
        } else if (saat >= 22 && saat < 24) {
            return yukselenler[8];
        } else if (saat >= 0 && saat < 2) {
            return yukselenler[9];
        } else if (saat >= 2 && saat < 4) {
            return yukselenler[10];
        } else if (saat >= 4 && saat < 6) {
            return yukselenler[11];
        } else {
            return "Bilinmiyor";
        }
    }

    public static String burcOzellikleri(String burc) {
        switch (burc) {
            case "Kova":
                return "Bağımsız, yenilikçi ve insancıl.";
            case "Balık":
                return "Hassas, sezgisel ve hayalperest.";
            case "Koç":
                return "Cesur, enerjik ve lider ruhlu.";
            case "Boğa":
                return "Sadık, sabırlı ve pratik.";
            case "İkizler":
                return "Zeki, iletişimci ve meraklı.";
            case "Yengeç":
                return "Duygusal, şefkatli ve koruyucu.";
            case "Aslan":
                return "Güçlü, yaratıcı ve cömert.";
            case "Başak":
                return "Detaycı, çalışkan ve mantıklı.";
            case "Terazi":
                return "Adil, zarif ve uyumlu.";
            case "Akrep":
                return "Tutkulu, kararlı ve gizemli.";
            case "Yay":
                return "Macera sever, özgür ruhlu ve filozofik.";
            case "Oğlak":
                return "Disiplinli, sorumlu ve hedef odaklı.";
            default:
                return "Bilinmiyor.";
        }
    }

    public static String anlastigiBurclar(String burc) {
        switch (burc) {
            case "Kova":
                return "İkizler, Terazi, Yay.";
            case "Balık":
                return "Yengeç, Akrep, Boğa.";
            case "Koç":
                return "Aslan, Yay, İkizler.";
            case "Boğa":
                return "Başak, Oğlak, Balık.";
            case "İkizler":
                return "Terazi, Kova, Koç." ;
            case "Yengeç":
                return "Akrep, Balık, Boğa.";
            case "Aslan":
                return "Koç, Yay, İkizler.";
            case "Başak":
                return "Boğa, Oğlak, Yengeç.";
            case "Terazi":
                return "İkizler, Kova, Yay.";
            case "Akrep":
                return "Yengeç, Balık, Oğlak.";
            case "Yay":
                return "Koç, Aslan, Terazi.";
            case "Oğlak":
                return "Başak, Boğa, Akrep.";
            default:
                return "Bilinmiyor.";
        }
    }
}


