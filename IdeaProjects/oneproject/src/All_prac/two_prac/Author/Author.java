package All_prac.two_prac.Author;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String GetName()
    {
        return this.name;
    }
    public char GetGender()
    {
        return this.gender;
    }
    public String GetEmail()
    {
        return this.email;
    }
    public void SetEmail(String email)
    {
        this.email = email;
    }
    public String toString()
    {
        return "Author: "+name+" "+gender+" at "+email+"\n";
    }

}
