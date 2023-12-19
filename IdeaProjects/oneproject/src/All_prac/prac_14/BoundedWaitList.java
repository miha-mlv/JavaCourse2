package All_prac.prac_14;
/** Класс BoundedWaitList имеет:
 * Параметризированный конструктор принимает количество элементов в списке
 * Метод возврата размера списка
 * Переопределенный метод add, который добавляет отталкиваясь от размера списка
 * Переопределенный метод toString, который выводит информацию о списке
 */
public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity;
    // Параметризированный конструктор, принимает параметр-размер списка
    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
    // Возвращает размер списка
    public int getCapacity() {
        return capacity;
    }
    //добавляет элемент в список в зависимости от текущего размера списка
    @Override
    public void add(E element){
        if(this.content.size() < capacity) {
            this.content.add(element);
        }
        else {
            System.out.println("capacity="+capacity+"!");
        }
    }
    // Выводит информацию о списке
    @Override
    public String toString() {
        String line = "";
        if(this.content.isEmpty())
        {
            return "List: ;" + "capacity="+this.capacity;
        }
        for(E item:this.content)
        {
            line = line +  item + " ";
        }
        line = "List: " + line+"; capacity="+this.capacity;
        return line;
    }

}
