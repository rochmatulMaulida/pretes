package com.yelatihan01;

import java.util.Scanner;

public class Soal01
{
    public static void Resolve()
    {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("==== Soal no 1 =====");
        System.out.println("Enter the text : ");
        String inputString = inputObject.nextLine();
        System.out.println("masukkan kata kedua: ");
        String inputString2 = inputObject.nextLine();
        inputString = inputString.toLowerCase();
        inputString2 = inputString2.toLowerCase();

        if (inputString.contains(inputString2))
        {
            String tampung = inputString2 + " ";
            inputString = inputString.replaceAll(tampung, " ");

            tampung = " " + inputString2;
            inputString = inputString.replaceAll(tampung, " ");
        }
        System.out.println(inputString);

        String[] inputStringArray = inputString.split(" ");

        int count = 0;
        for (int i = 0; i < inputStringArray.length; i++)
        {
            String arrayMember = inputStringArray[i];
            //char[] hanya untuk huruf/1 karakter
            char[] charMember = arrayMember.toCharArray();
            for (int j = 0; j < charMember.length; j++)
            {
                if (charMember[j] >= 97 && charMember[j]<= 122)
                {
                    count++;
                }
            }
        }
        System.out.println(" Banyak huruf yg tdk sama : "+ count);

    }
}
