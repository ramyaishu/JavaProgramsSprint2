package OopsConcept.Encapsulation;

public class Encapsulation
{
    private String name;
    private String idNumber;
    private int age;

    public String getName()
    {
        return name;

    }
    public String getIdNumber()
    {
        return idNumber;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String nameName)
    {
        name=nameName;
    }
    public void setIdNumber(String  newIdNumber)
    {
        idNumber = newIdNumber;
    }
    public void setAge(int newAge)
    {
        age= newAge;
    }
}
 class EncapTest
{
    public static void main(String[] args) {
        {
            Encapsulation encap = new Encapsulation();
            encap.setAge(20);
            encap.setIdNumber("A101");
            encap.setName("James");
            System.out.println("Id"   +encap.getIdNumber()+" Name"+  encap.getName()+"Age"+  encap.getAge());
        }
    }

}
