package org.google;

public class buoi5String {
    //Bài 1: Cho một chuỗi số hãy tính tổng các số có trong chuỗi đó.

    public static String tinhtong(String input)
    {
        String string = input;
        int num = Integer.valueOf(string);
        int soDu;
        int sum = 0;
        String SUM;
        while (num>0){
                soDu =num%10;
                sum=sum+soDu;
                num=num/10;
        }
        SUM = String.valueOf(sum);
        return SUM;
    }

    //Bài 2: Cho một chuỗi có số từ bất kỳ. Hãy chuẩn hóa chuỗi này (ký tự đầu tiên của
    // mỗi từ phải là chữ hoa)."khanh tran" -> "Khanh Tran"

    public static String chuanhoa(String input)
    {
        String str = input;
        str = str.trim();
        return str;
    }
    public static String chuanhoachuoi(String input)
    {
        String str = chuanhoa(input);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++)
        {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return  str;
    }


    //Bài 3: Cho một chuỗi ký tự bất kỳ, hãy đảo ngược chuỗi này. "khanhtran" -> "narthnahk"

    public static String daonguocchuoi(String input)
    {
        StringBuffer str = new StringBuffer(input);
        String result = str.reverse().toString();
        return result;
    }

    //Bài 4: CHo một chuỗi họ và tên bất kỳ, hãy đảo ngược các từ có trong chuỗi "Tran Xuan Khanh" -> "Khanh Xuan Tran"

    public static String daonguoctu(String input)
    {
        String str = chuanhoa(input);
        String temp[] = str.split(" ");
        str = "";
        for (int i = temp.length-1; i >= 0; i--)
        {
            str=str+" "+temp[i];
        }
        String result = chuanhoa(str);
        return result;
    }
}
