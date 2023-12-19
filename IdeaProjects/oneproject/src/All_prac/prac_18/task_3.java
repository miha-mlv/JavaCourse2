package All_prac.prac_18;

import java.io.Serializable;

class Animal implements Serializable {
    Animal(){}
}

public class task_3<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public task_3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void print_TVK() {
        System.out.println("T: " + t);
        System.out.println("V: " + v);
        System.out.println("K: " + k);
    }

    public static void main(String[] args) {
        task_3<Integer, Animal, Animal> genericObj = new task_3<>(42, new Animal(), new Animal());
        genericObj.print_TVK();
    }
}