import java.util.Scanner;
//Kullanıcan veri alabilmek için Scanner sınıfını projeye dahil ediuoruz.


public class Main {
    public static void main(String[] args) {

        //Kullanıcdan yıl verisi alıp değer atamak ve işlem yapabilmek için bir inr değişkeni tanımlaıyoruz
        int yil;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Yıl bilgisi istiyoruz
        System.out.print("Lütfen Doğum Yılınızı Yazın: ");
        yil = input.nextInt();


        //Kullanıcının gireceği değerin geçerli ve 4 haneli olmasını koşulunu sağlamak için İf ile bir aralık belirliyoruz
        if (yil > 1000 && yil <= 2999) {

            //Yine iç içe İf yapııs Kullanıcının Girdiği yıl değerinin 12 ile bölümünden kalana göre sonuç belirliyoruz
            if (yil % 12 == 0) {
                System.out.println("Çin Zodyağı Burcunuz: Ceylan");
            }
            if (yil % 12 == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
            }
            if (yil % 12 == 2) {
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
            }
            if (yil % 12 == 3) {
                System.out.println("Çin Zodyağı Burcunuz: Sincap");
            }
            if (yil % 12 == 4) {
                System.out.println("Çin Zodyağı Burcunuz: Zebra");
            }
            if (yil % 12 == 5) {
                System.out.println("Çin Zodyağı Burcunuz: Yılan");
            }
            if (yil % 12 == 6) {
                System.out.println("Çin Zodyağı Burcunuz: Karaca");
            }
            if (yil % 12 == 7) {
                System.out.println("Çin Zodyağı Burcunuz: Urangutan");
            }
            if (yil % 12 == 8) {
                System.out.println("Çin Zodyağı Burcunuz: Bal Porsuğu");
            }
            if (yil % 12 == 9) {
                System.out.println("Çin Zodyağı Burcunuz: Kertenkele");
            }
            if (yil % 12 == 10) {
                System.out.println("Çin Zodyağı Burcunuz: At");
            }
            if (yil % 12 == 11) {
                System.out.println("Çin Zodyağı Burcunuz: Bizon");
            }
        }
        //Kullanucının Girdiği değerin belirlenmiş aralıkta olamlamsı durumunda kullanıcıya bir hata mesajı yazdırıyoruz
        else {
            System.out.println("Lütfen Doğum Yılınızı 4 haneli olarak Yazın\n Örnek: 1999");
        }

    }
}