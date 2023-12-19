package All_prac.prac_9;

public class TestNameable {
    public static void main(String[] args) {
        Nameable book_1 = new Book("book_1");
        System.out.println(book_1.getName());
        Book book_2 = new Book("book_2");
        System.out.println(book_2.getName());
        Human human = new Human("human");
        System.out.println(human.getName());

    }
}
