package com.berkay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Runner_Checked_UnChecked_Exceptions {
    public static void main(String[] args) throws IOException {

        /**
         * Unchecked Exception
         * Kontrol edilmesi zorunlu olmayan istisna fırlatması dusuk olasılık olan kullanımlardır.
         */
        int sayi;
        System.out.println("Bir sayi giriniz...: ");
        sayi = new Scanner(System.in).nextInt();


        /**
         * Checked Exception
         * kontrol edilmesi zorunludur. Yüksek ihtimal hata fırlatabilirler.
         * Bu methodları kullanıyor iseniz, ya try...catch blokları ile sarmalarsını
         * ya da sizde aynı istisna türüne bir üst method kullanımına fırlatırsınız.
         */

        try {
            Files.delete(Path.of("dosya.txt"));
        } catch (IOException e) {
            System.out.println("Hata oldu");
        }
        //Files.delete(Path.of("dosya.txt"));

        Islemler islemler = new Islemler();
        islemler.saveFile();
    }

}
