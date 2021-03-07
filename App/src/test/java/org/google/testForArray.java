package org.google;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class testForArray {
    @Test //bai1
    public void loc_phan_tu()
    {
        int[] mang1 = {1,2,3};
        int[] mang2 = {1,4};
        int[] expected = {2,3,4};
        int[] actual = Mang.locphantu(mang1,mang2);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test  //bai2
    public void tinh_tong_hai_mang(){
        int[] mang1 = {1,3,5};
        int[] mang2 = {2,3,4};
        int expected = 18;
        int actual = Mang.tinhtonghaimang(mang1, mang2);
        Assert.assertEquals(expected,actual);
    }



    @Test //bai3
    public void loc_SNT() {
        int[] input = {5, 10, 16, 17};
        int[] expected = {5,17};
        int[] actual = Mang.locsnt(input);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test //bai4
    public void phan_tich_SNT(){
        int input = 10;
        int[] expected = {2,5};
        int[] actual = Mang.phantichsnt(input);
        Assert.assertArrayEquals(expected,actual);
    }

}
