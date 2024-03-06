package com.berkay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerOrnek {
    public static void main(String[] args) {

        try {
            System.out.println("Bir sayi giriniz: " );
            int sayi1 = new Scanner(System.in).nextInt();

            System.out.println("Bir sayi giriniz: " );
            int sayi2 = new Scanner(System.in).nextInt();

            int bolum = sayi1/sayi2;

            System.out.println("bolum : "+bolum);

            int[] sayilar = {1,2,3,4,5,6,7,8,9,10};
            System.out.println(sayilar[10]);

        }catch (InputMismatchException exception){
            System.err.println("Tip uyusmazligi, lutfen sayi olarak rakam giriniz.");
        }catch (ArithmeticException exception){
            System.err.println("Bir sayi 0 a bolunmez, islem tanimsizdir.");
        }catch (Exception exception){
            System.err.println("Beklenmeyen bir hata oldu. Yoneticiniz ile iletişime geciniz."+exception);


        }
    }
}
