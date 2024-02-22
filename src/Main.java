import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0, sayac = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        } else
            System.out.println("Matematik notunuz hatalı");

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;
        } else
            System.out.println("Fizik notunuz hatalı");

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        } else
            System.out.println("Türkçe notunuz hatalı");

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        } else
            System.out.println("Kimya notunuz hatalı");

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        } else
            System.out.println("Müzik notunuz hatalı");

        double ortalama = (toplam / sayac);

        if (ortalama <= 55 ){
            System.out.println("Sınıfta Geçemediniz ortalamanız ; "+ ortalama);
        }

        else System.out.println("Başarılı bir şekilde sınıfı geçtiniz : " + ortalama);

    }


}


