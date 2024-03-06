package com.berkay;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Exception - Istisna -> Javada beklenmeyen bir durum oluştuğunda, hata fırlatır.
         * Bu hatalar belli düzeylerde gerçekleşebilirler. En temelde istisnalar Java sınıfları
         * tarafından yönetilir, ancak istisna sınıfları miras alınarak her method istisna fırlatabilir.
         * Oluşan beklenmeyen durumları yönetmek için try ... catch ... finaly blokları kullanılır.
         *
         */


        try {
            System.out.println("""
                    ****** TOPLAMA ISLEMI ******
                    """);
            System.out.println("1. sayiyi giriniz...: ");
            int sayi1 = new Scanner(System.in).nextInt();

            System.out.println("2. sayiyi giriniz...: ");
            int sayi2 = new Scanner(System.in).nextInt();

            int toplam = sayi1 + sayi2;
            System.out.println("Toplam : " + toplam);

            System.out.println("UYGULAMA SONA ERDI");
        } catch (Exception e) {
            System.err.println("Lutfen gecerli bir deger girin....");
        }


    }
}
