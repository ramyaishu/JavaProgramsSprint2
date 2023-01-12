package OopsConcept.Polimorphism;

public class OverLoading
{
    public void add(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(int a,int b,int c)
    {
        int sum = a+b+c;
        System.out.println(sum);
    }
    public void add(int a,int b,double c)
    {
        double sum = a+b*c;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        {
            OverLoading overLoading = new OverLoading();
            overLoading.add(2,3);
            overLoading.add(2,3,4);
            overLoading.add(3,4,5.6);
        }
    }
}
