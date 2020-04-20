package com.yelatihan01;

import java.util.Scanner;

public class Soal02Perpustakaan
{
    public static void Resolve()
   {
       Scanner inputObject = new Scanner(System.in);
       System.out.println("Masukkan tanggal,bulan, tahun pinjam dg spasi(dd mm yyyy): ");
       String numberString = inputObject.nextLine(); //pinjam
       System.out.println("Masukkan tanggal,bulan, tahun kembali dg spasi (ddmmyyyy): ");
       String numberString2 = inputObject.nextLine(); //kembali
       int[] pinjam = Utility2.ConvertToInt(numberString);
       int[] kembali = Utility2.ConvertToInt(numberString2);

       int pinjamHari   = pinjam[0];
       int pinjamBulan  = pinjam[1];
       int pinjamTahun  = pinjam[2];
       int kembaliHari   = kembali[0];
       int kembaliBulan  = kembali[1];
       int kembaliTahun  = kembali[2];

       int denda = 0;
       if (kembaliTahun > pinjamTahun)
       {
           denda = 10000;
       }
       else if (kembaliTahun == pinjamTahun)
       {
           if (kembaliBulan > pinjamBulan)
           {
               denda = 500 * (kembaliBulan - pinjamBulan);
           }
           else if (kembaliBulan == pinjamBulan)
           {
               if (pinjamHari > kembaliHari)
               {
                   denda = 15 * (kembaliHari - pinjamHari);
               }
           }
       }
       System.out.println("Denda : " + denda);
    }
}
