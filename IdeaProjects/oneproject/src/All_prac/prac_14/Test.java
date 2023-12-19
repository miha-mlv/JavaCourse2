package All_prac.prac_14;

public class Test {
    public static void main(String[] args) {
        //TODO: создаем объект list класса WaitList<Integet>
        WaitList<Integer> list = new WaitList<>() {};
        //TODO: создаем объект list_2 класса WaitList<Integet>
        WaitList<Integer> list_2 = new WaitList<>() {};
        //TODO: создаем объект list_unfair класса UnfairWaitList<Integet>
        UnfairWaitList<Integer> list_unfair = new UnfairWaitList<>();
        //TODO: добавляем в list_2 элемент 5 при метода add() класса WaitList
        list_2.add(5);
        //TODO: добавляем в list элемент 5 при метода add() класса WaitList
        list.add(5);
        //TODO: добавляем в list элемент 5 при метода add() класса WaitList
        list.add(5);
        //TODO: Выводим информацию о списке list при помощи метода toString() класса WaitList
        System.out.println(list.toString());
        //TODO: Удаляет первый элемент из списка list при помощи метода remove() класса WaitList
        list.remove();
        System.out.println(list.toString());
        System.out.println("contains: "+list.contains(5));
        System.out.println("containsALL: "+list.containsAll(list_2));
        list_unfair.add(5);
        list_unfair.add(5);
        list_unfair.add(5);
        list_unfair.add(2);
        list_unfair.add(5);
        list_unfair.moveToBack(2);
        BoundedWaitList<Integer> list_capacity = new BoundedWaitList<>(3);
        list_capacity.add(5);
        list_capacity.add(5);
        list_capacity.add(5);
        list_capacity.add(5);
        System.out.println(list_capacity.toString());


    }
}
