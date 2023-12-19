package All_prac.One_prac.Book;

public class Book {
    private String name;
    private String writer;
    private int age;
    public Book(String name, String writer, int age)
    {
        this.name = name;
        this.writer = writer;
        this.age = age;
    }
    public String toString()
    {
        return "Book: "+name+" "+age+" "+writer;
    }

}
