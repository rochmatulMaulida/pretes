package com.yelatihan01;

public class Utility2
{
    public static int[] Sort(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length -1; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    int temp = numbers[j];
                    //1 1 3 2 1 4 5 1 ==> j ke 0
                    numbers[j] = numbers[j + 1];
                    // 1 2 3 2 1 4 5 1 == j ke 0
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static int[] ConvertToInt(String numberString)
    {
        String[] resultString = numberString.split(" ");
        int[] resultInt = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++)
        {
            resultInt[i] = Integer.parseInt(resultString[i]);
        }
        return resultInt;
    }

}
