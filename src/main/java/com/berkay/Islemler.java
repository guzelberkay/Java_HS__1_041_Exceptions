package com.berkay;

import java.io.IOException;

public class Islemler {
    public void saveFile()throws IOException {
        System.out.println("Dosya yazdik");

    }
    public void odemeYap(){
        throw  new KKLimitException("Limit yetersiz");
    }
}
