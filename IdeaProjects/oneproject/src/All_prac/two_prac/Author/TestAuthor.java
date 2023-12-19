package All_prac.two_prac.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("ААА","aaa@mail.ru",'М');
        Author a2 = new Author("BBB","bbb@mail.ru",'М');
        Author a3 = new Author("CCC","bbb@mail.ru",'М');
        a3.SetEmail("ccc@gmail.com");
        String text;
        text = a1.toString(); System.out.println(text);
        text = a2.toString(); System.out.println(text);
        text = a3.toString(); System.out.println(text);
    }
}
