import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class WellsFargoAssin
{
    public String matchStringChar(String[] arr)
    {
        StringBuilder builder = new StringBuilder();
        int size = arr.length;
        if(size==0)
            return "";
        if(size==1)
            return arr[0];
        Arrays.sort(arr);
        int min = Math.min(arr[0].length(),arr[size-1].length());
        for(int i=0;i<min;i++)
        {
            char ch = arr[0].charAt(i);
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j].charAt(i)!=ch) {
                    return builder.toString();
                }

            }
            builder.append(ch);


           /* if (arr[0].charAt(i)==arr[size-1].charAt(i))
            {
                prefix = arr[0].substring(0, i);
                System.out.println(prefix);
            }*/
            System.out.println(builder.toString());
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
    @Test
    public void testCase1()
    {
        String[] str = {"flower","flow","flight"};
        String s = matchStringChar(str);
        Assert.assertEquals(s,"fl");
    }
    @Test
    public void testCase2()
    {
        String[] str = {"dog","racecar","car"};
        String s = matchStringChar(str);
        Assert.assertEquals(s,"");

    }
}
