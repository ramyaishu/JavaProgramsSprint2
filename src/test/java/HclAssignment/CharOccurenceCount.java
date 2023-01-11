package HclAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class CharOccurenceCount
{
    public HashMap<Character, Integer> stringOccurence(String str)
    {

        HashMap<Character,Integer> hashMap= new HashMap<>();

        int count;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!hashMap.containsKey(ch))
            {
                count=0;
                for(int j=i;j<str.length();j++)
                {
                    if(ch==str.charAt(j))
                    {
                        count++;
                    }
                }
                if(count>0)
                    hashMap.put(ch,count);
            }

        }
        System.out.println(hashMap.toString());

        for(  Character c: hashMap.keySet())
        {
            System.out.print(c);
            System.out.print(hashMap.get(c));
        }
        return hashMap;
    }

    @Test
    public void testCase1()
    {
        String str ="aaabbcccc";
        HashMap<Character,Integer> result = stringOccurence(str);
        Assert.assertTrue(result.size()==3);
    }
    @Test
    public void testCase2()
    {
        String str ="abbccc";
        HashMap<Character,Integer> result = stringOccurence(str);
        Assert.assertTrue(result.size()==3);
    }
    @Test
    public void testCase3()
    {
        String str ="";
        HashMap<Character,Integer> result = stringOccurence(str);
        Assert.assertTrue(result.size()==0);
    }
}
