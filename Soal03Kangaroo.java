package com.yelatihan01;
import java.util.Scanner;
public class Soal03Kangaroo
{
    public static void Resolve()
    {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("lokasi kangguru 1 : ");
        int lokasiK1 = inputObject.nextInt();
        System.out.println("kecepatan kangguru 1 : ");
        int kecepatanK1 = inputObject.nextInt();
        System.out.println("lokasi kangguru 2 : ");
        int lokasiK2 = inputObject.nextInt();
        System.out.println("kecepatan kangguru 2: ");
        int kecepatanK2 = inputObject.nextInt();


//-----> kangguru dapat bertemu dg kangguru lain
        if (kecepatanK1 <= kecepatanK2)
        {
            System.out.println("NO");
        }
        else
        {
            boolean bertemu = (lokasiK2 - lokasiK1) % (kecepatanK2 - kecepatanK1) == 0;
            System.out.println("Apakah kangguru 1 & 2 dapat bertemu ? ");
            System.out.print(bertemu ? "YES" : "NO");
        }
    }
}
