package All_prac.prac_18.task_4;

public class TestMinMax {
    static Integer[] arr = {1,2,3};
    public static void main(String[] args) {
        MinMax<Integer> obj = new MinMax<>(arr);
        System.out.println(obj.findMax());
        System.out.println(obj.findMin());
        Calculator calculator = new Calculator();
        Integer a = 3;
        Double b = 0.5;
        Double c = 0.5;
        System.out.println("summ: ");
        System.out.println(Calculator.summ(a,a));
        System.out.println(Calculator.summ(b,a));
        System.out.println(Calculator.summ(a,b));
        System.out.println(Calculator.summ(b,c));
        System.out.println("multiply: ");
        System.out.println(Calculator.multiply(a,a));
        System.out.println(Calculator.multiply(b,a));
        System.out.println(Calculator.multiply(a,b));
        System.out.println(Calculator.multiply(b,c));
        System.out.println("divide: ");
        System.out.println(Calculator.divide(a,a));
        System.out.println(Calculator.divide(b,a));
        System.out.println(Calculator.divide(a,b));
        System.out.println(Calculator.divide(b,c));
        System.out.println(Calculator.divide(b,0));
        System.out.println("subtraction: ");
        System.out.println(Calculator.subtraction(a,a));
        System.out.println(Calculator.subtraction(b,a));
        System.out.println(Calculator.subtraction(a,b));
        System.out.println(Calculator.subtraction(b,c));
    }

}
