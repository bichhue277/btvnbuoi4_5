package org.google;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mang {

    //Bài 1: Viết method nhận vào 2 mảng số nguyên, sau đó lọc ra các phần tử chỉ xuất hiện trong
    //một mảng, viết testmethod cho method vừa viết.

    public static int[] locphantu(int[] mang1, int[] mang2)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i: mang1) {
            boolean contain = false;
            for (int j: mang2) {
                if(i == j) {
                    contain = true;
                    break;
                }
            }

            if(!contain) {
               list.add(i);
            }
        }
        for (int i: mang2) {
            boolean contain = false;
            for (int j: mang1) {
                if(i == j) {
                    contain = true;
                    break;
                }
            }

            if(!contain) {
                list.add(i);
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }

    //Bài 2: Viết method nhận vào 2 mảng số nguyên, sau đó tính tổng của hai mảng này.
    //Tổng của hai mảng là một mảng thõa mãn điều kiện: T[i] = A[i] + B[i];
    //Viết testmethod cho method này.
    public static int tinhtonghaimang (int[] mang1, int[] mang2){
        int[] arr1 = mang1;
        int[] arr2 = mang2;
        int sum1=0;
        int sum2=0;
        int result;
        for (int num1:arr1) {
            sum1=sum1+num1;
        }
        for (int num2:arr2) {
            sum2=sum2+num2;
        }
        return result=sum1+sum2;

    }

    //Bài 3: Viết method nhận vào một mảng các số nguyên, sau đó lọc ra các số nguyên tố có trong
    // mảng (sử dụng method CheckSNT viết trong bài trước). Viết testmethod cho method này.

    public static int[] locsnt(int[] input)
    {
        int[] arr = input;
        ArrayList<Integer> SNT = new ArrayList<>();
        for (int num:arr) {
            if (checksonguyento(num))
            {
                SNT.add(num);
            }
        }
        int[] result = SNT.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static boolean checksonguyento (int input)
    {
        int num = input;
        if (num <2) {
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Bài 4: Viết method nhận vào một số, sau đó phân tích số này thành mảng các thừa số nguyên tố
    //Viêt stesstmethod cho method này.
    //20 = 5*2*2 hoặc 12 = 3*2*2 (tích của các số nguyên tố)
    public  static int[] phantichsnt(int input)
    {
        int num = input;
        int i = 2;
        ArrayList<Integer> listNumbers = new ArrayList<>();
        while (num>1){
            if (num%i==0){
                num=num/i;
                listNumbers.add(i);
            } else{
                i++;
            }
        }
        if (listNumbers.isEmpty()){
            listNumbers.add(num);
        }
        int[] result = listNumbers.stream().mapToInt(j -> j).toArray();
        return result;
    }

}
