package All_prac.One_prac.Dog;

public class Dog {
    private String name;
    private int age;
    public Dog(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    public Dog(String n)
    {
        this.name = n;
        this.age = 0;
    }
    public Dog()
    {
        this.name = "Pup";
        this.age = 0;
    }
    public void SetAge(int a) { this.age = a; }
    public int GetAge() { return age; }
    public void SetName(String n) { this.name = n; }
    public String GetName() { return name; }
    public String toString() { return this.name+", age "+this.age; }
    public void intoHumanAge()
    {
        System.out.println(name+"'s age in human years is " +age*7+" years");
    }
}
