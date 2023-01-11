package HclAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Swapping
{
    public String swapping(String arr)
    {
        String[] str = arr.split(" ");
        String result= " ";
        String temp=" ";
        temp=str[0];
        str[0]=str[2];
        str[2]=temp;
        System.out.println(Arrays.toString(str));
        return str.toString();

    }
    @Test
    public void testCase1()
    {
        String str = "I am Mohan from bangalore";
        String result = swapping(str);
        Assert.assertEquals(result,"Mohan am I from bangalore");
    }
    @Test
    public void testCase2()
    {
        String str = "";
        String result = swapping(str);
        Assert.assertEquals(result,"");
    }
}
