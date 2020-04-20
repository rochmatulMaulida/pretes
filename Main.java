package com.yelatihan01;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //objek scanner
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the number ");
        String answer = "y";

        while (answer.toUpperCase().equals("Y"))
        {
            System.out.println("Enter the exercise number: ");
            //inputan int , stl nextInt bawahnya diberi nextLine agar tak skip di nextLine selanjutnya
            int inputExample = inputObject.nextInt();
            inputObject.nextLine();
            switch (inputExample)
            {
                case 1:
                    Soal01.Resolve();
                    break;
                case 2:
                    Soal02Perpustakaan.Resolve();
                    break;
                case 3:
                    Soal03Kangaroo.Resolve();
                    break;
                case 4:
                    Soal04IklanViral.Resolve();
                    break;
//                case 5:
//                    Soal5.Resolve();
//                    break;
//                case 6:
//                    Soal6.Resolve();
//                    break;
//                case 7:
//                    Soal7.Resolve();
//                    break;
//                case 8:
//                    Soal8.Resolve();
//                    break;
//                case 9:
//                    Soal9.Resolve();
//                    break;
//                case 10:
//                    Soal10.Resolve();
//                    break;
                default:
                    System.out.println("The number doesn't exists" );
                    break;
            }
            System.out.println();
            System.out.println("Continue ?");
            //inputan untuk string
            answer = inputObject.nextLine();
        }
    }
}
