package org.google;

import org.junit.Assert;
import org.junit.Test;

public class testForString {
    @Test
    public void tinh_tong_chuoi(){
        String input = "120";
        String expected = "3";
        String actual = buoi5String.tinhtong(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void chuan_hoa_chuoi()
    {
        String input = "  do thi bich hue";
        String expected = "Do Thi Bich Hue";
        String actual = buoi5String.chuanhoachuoi(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void dao_nguoc_chuoi()
    {
        String input = "bich hue";
        String expected = "euh hcib";
        String actual = buoi5String.daonguocchuoi(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void daonguoctu()
    {
        String input = "bich hue";
        String expected = "hue bich";
        String actual = buoi5String.daonguoctu(input);
        Assert.assertEquals(expected,actual);
    }
}
