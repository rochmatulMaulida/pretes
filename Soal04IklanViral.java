package com.yelatihan01;

import java.util.Scanner;

public class Soal04IklanViral
{
    public static void Resolve()
    {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Input hari ke : ");
//----> inputan deret angka berupa String pakai spasi
        int n = inputObject.nextInt();
        //sharedLikeKomulatif
        //shared 5 6 9 12 //like 2 3 4 6 9 //komulatif 2 5 9 15 24

//        int shared = 5;
//        int angka1 = 6;
//        int angka2 = 9;
//        int angka3 = 6;
//        int angka4 = 9;
//        int liked = 2;
//        int komulatif = 2;
//        int[][] arr = new int[3][n];
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                if(i == 0 && j == 0)
//                {
//                    arr[i][j] = shared;
//                }
//                else if(i == 0 && j % 2 == 1)
//                {
//                    arr[i][j] = angka1;
//                    angka1 *= 2;
//                }
//                else if(i == 0 && j % 2 == 0)
//                {
//                    arr[i][j] = angka2;
//                    angka2 *= 2;
//                }
//                else if(i == 1 && j < 3)
//                {
//                    arr[i][j] = liked;
//                    liked += 1;
//                }
//                else if(i == 1 && j % 2 == 1)
//                {
//                    arr[i][j] = angka3;
//                    angka3 *= 2;
//                }
//                else if(i == 1 && j % 2 == 0)
//                {
//                    arr[i][j] = angka4;
//                    angka4 *= 2;
//                }
//                else if(i == 2 && j == 0 )
//                {
//                    arr[i][j] = komulatif;
//                }
//                else if(i == 2 )
//                {
//                    arr[i][j] = arr[1][j]+ arr[1][j + 1];
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(); //pindah baris pada tabel bariskolom
       //}
        int orang = 2;
        int count  = 2;
        for (int i = 2; i <= n; i++) {
            orang = (orang * 3) / 2;
            count += orang;
        }
        System.out.println("komulatif : " + count);
    }
}
