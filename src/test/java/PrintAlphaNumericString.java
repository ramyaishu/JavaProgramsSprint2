import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.TreeSet;

public class PrintAlphaNumericString
{
    public String printAlphaNumeric(String str)
    {
        String s=" ";
        StringBuffer upper  = new StringBuffer();
        StringBuffer lower  = new StringBuffer();
        StringBuffer number  = new StringBuffer();
        StringBuffer space = new StringBuffer();
        StringBuffer result = new StringBuffer();


        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                upper.append(str.charAt(i));
            }
            else if (Character.isLowerCase(str.charAt(i)))
            {
                lower.append(str.charAt(i));
            }
            else if (Character.isDigit(str.charAt(i))) {
                number.append(str.charAt(i));
            }
            else if(Character.isSpaceChar(str.charAt(i)))
            {
                space.append(str.charAt(i));
            }

        }
        result.append(upper);
        result.append(lower);
        result.append(space);
        result.append(number);
        System.out.println(result.toString());
        return result.toString();


    }
    @Test
    public void testCase1()
    {
        String str = "INisDI 83355A";
        Set<Character > treeSet = new TreeSet<>();
        for (Character s:str.toCharArray())
        {
            treeSet.add(s);

        }
        StringBuffer sb = new StringBuffer();
        for(Character c:treeSet) {
            sb.append(c);
        }
        String concat = printAlphaNumeric(sb.toString());
        Assert.assertEquals(concat,"ADINis 358");
    }

}
