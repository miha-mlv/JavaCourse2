package All_prac.One_prac.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Бедная Лиза","Карамзин",231);
        Book b2 = new Book("Война и мир","Толстой",203);
        Book b3 = new Book("Преступление и наказание","Достоевский",157);
        String text;
        text = b1.toString(); System.out.printf(text+'\n');
        text = b2.toString(); System.out.printf(text+'\n');
        text = b3.toString(); System.out.printf(text);
    }
}
