package All_prac.prac_6.Dish;

public class Test_Dish {
    public static void main(String[] args) {
        Dish cup = new Cup();
        Plate plate = new Plate();
        cup.drink();
        cup.eat();
        plate.drink();
        plate.eat();
        cup.Get_color();
        plate.Get_color();
    }
}
