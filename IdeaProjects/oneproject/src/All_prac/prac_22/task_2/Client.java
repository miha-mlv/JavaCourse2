package All_prac.prac_22.task_2;

public class Client {
    public static void main(String[] args) {
        Chair chair_1 = ChairFactory.getChair("VictorianChair", "red");
        Chair chair_2 = ChairFactory.getChair("MagicChair", "green");
        Chair chair_3 = ChairFactory.getChair("MultifunctionalChair", "black");
        System.out.println(chair_1.getColor());
        System.out.println(chair_2.getColor());
        System.out.println(chair_3.getColor());
    }
}
