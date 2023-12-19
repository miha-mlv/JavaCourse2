package All_prac.prac_18;

public class task_1 <T,V,K>{
    private T t;
    private V v;
    private K k;
    task_1(T t, V v, K k)
    {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public void print_TVK(){
        System.out.println(t);
        System.out.println(v);
        System.out.println(k);
    }

    public static void main(String[] args) {
        task_1<Integer,String, Boolean> obj = new task_1<>(18, "Misha",true);
        obj.print_TVK();
    }
}
