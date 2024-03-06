package com.berkay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner_Soru {
    public static void main(String[] args) {
        /**
         * Okul Otomasyonu
         * 1- Öğrenci Ekle
         * 2- Öğrenci Listele
         * 3- Öğrenci Ara
         * 4- Öğrenci Sil
         * 5- Öğretmen ekle
         * 0- Çıkış
         */
        int secim;
        do{
            try{
                System.out.println("""
                ***** Okul Otomasyonu *****
                1- Öğrenci Ekle
                2- Öğrenci Listele
                3- Öğrenci Ara
                0- Çıkış
                """);

                secim = secimYap(0,3);
                switch (secim){
                    case 1:
                        System.out.println("Ogrenci Eklendi");
                        break;
                    case 2:
                        System.out.println("Ogrenci Listelendi");
                        break;
                    case 3:
                        System.out.println("Ogrenci buldum");
                        break;
                    case 0:
                        System.out.println("Cıkış");
                        break;
                    default:
                        System.out.println("Hatalı Girdi");
                }
            }catch (Exception exception){
                System.out.println("Lütfen geçerli bir seçim yapınız");
                secim = -1;
            }

        }while (secim != 0);

    }

    private static int secimYap(int start, int end){
        Scanner scanner;
        int secim= 0;
        boolean isRepeat;
        do{
            System.out.println();
            scanner = new Scanner(System.in);
            System.out.print("seçiniz.....: ");
            try{
                secim = scanner.nextInt();//beş
                if(secim<start || secim>end){
                    System.err.println("Lütfen " +start +" ile " + end+ " arasında bir rakam giriniz.");
                    isRepeat = true;
                }else {
                    isRepeat = false;
                }
            }catch (Exception exception){
                System.err.println("Lütfen geçerli bir sayısal değer giriniz.");
                isRepeat = true;
            }
        }while (isRepeat); // hata varsa dönmeye devam et

        return secim;
    }
}
