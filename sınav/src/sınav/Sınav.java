/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınav;

import java.util.Scanner;

class zaman{
public void dakikaHesapla(){}   
}
class ay extends zaman {
    int ay;
    int gun;    
    int hesap;
    @Override
    public void dakikaHesapla()
    {
      hesap=(ay*30+gun)*24*60;
    }
    public void goster()
{
    System.out.println(hesap);
}
}
class gun extends zaman{

int gun;
int saat;
int hesap;
@Override
public void dakikaHesapla()
{
      hesap = (gun*24+saat)*60;
 }
public void goster()
{
    System.out.println(hesap);
}
}
class saat extends zaman{
int saat ;
int dakika;
int hesap;
@Override
      public void dakikaHesapla()
      {
      hesap=saat*60+dakika;
      
      }
      public void goster()
{
    System.out.println(hesap);
}
}
public class Sınav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ay hesap1 = new ay();        
        int s=0;        
        int tekrar = 1;       
        Scanner deger = new Scanner(System.in);        
        while(tekrar == 1)
        {
        System.out.print("Hangi Hesaplamayı Seçmek İstiyorsunuz: ");            
        s=deger.nextInt();           
        while(s == 1)
        {
        System.out.print("Ay Giriniz: ");
        hesap1.ay=deger.nextInt();
        System.out.print("Gün Giriniz: ");
        hesap1.gun=deger.nextInt();
        System.out.print(hesap1.ay+" "+"ay" +" "+ hesap1.gun +" gün"+" ");
        hesap1.dakikaHesapla();
        hesap1.goster();
        System.out.println("Dakikadır.");
        break;
        }
        while (s==2)
        {
        gun hesap2 = new gun();
        System.out.print("Gün Giriniz:");
        hesap2.gun=deger.nextInt();
        System.out.print("Saat Giriniz:");
        hesap2.saat=deger.nextInt();
        System.out.print(hesap2.gun+" "+"gün"+" "+hesap2.saat+" saat"+" ");
        hesap2.dakikaHesapla();
        hesap2.goster();
        System.out.println("Dakikadır.");
        break;
        }
        while (s==3)
        {
        saat hesap3 = new saat();
        System.out.print("Saat Giriniz:");
        hesap3.saat = deger.nextInt();
        System.out.print("Dakika Giriniz:");
        hesap3.dakika=deger.nextInt();
        System.out.print(hesap3.saat+" "+"saat"+" "+hesap3.dakika+" dakika"+" ");
        hesap3.dakikaHesapla();
        hesap3.goster();
        System.out.println("Dakikadır.");
        break;
        }          
        System.out.println("Devam Etmek için 1,çıkmak için 2 tuşlayınız.");
        tekrar = deger.nextInt();
            
        }
        System.out.println("Çıktınız.");
    
       
    }
    
    
}
