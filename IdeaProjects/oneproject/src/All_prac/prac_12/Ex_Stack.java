package All_prac.prac_12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex_Stack {
    private Stack <Integer> player_1_stack = new Stack<>();
    private Stack <Integer> player_2_stack = new Stack<>();
    private Queue<Integer> player_1_queue = new LinkedList<>();
    private Queue<Integer> player_2_queue = new LinkedList<>();
    private List<Integer> player_1_doublelink = new List<>();
    private List<Integer> player_2_doublelink = new List<>();
    Ex_Stack(String line)
    {
        for(int i = 0; i < 5; i++)
        {
            int num_1 = Integer.parseInt(line.substring(i,i+1));
            player_1_stack.push(num_1);
            player_1_queue.add(num_1);
            player_1_doublelink.addLast(num_1);
            int num_2 = Integer.parseInt(line.substring(i+6,i+7));
            player_2_stack.push(num_2);
            player_2_queue.add(num_2);
            player_2_doublelink.addLast(num_2);

        }
        App_stack();
        App_Queue();
        App_DoubleLink();

    }
    public void App_stack()
    {
        int count = 0;
       while(!player_1_stack.isEmpty() && !player_2_stack.isEmpty())
       {
           if(count == 106)
           {
               break;
           }//remove(int Index) - удаляет элемент с индексом Index
           Iterator iter_1 = player_1_stack.iterator();
           Iterator iter_2 = player_2_stack.iterator();
           int card_player1 = (int)iter_1.next();
           int card_player2 = (int)iter_2.next();
           player_1_stack.remove(0);
           player_2_stack.remove(0);

           if(card_player1 == 0)
           {
               player_1_stack.push(card_player1);
               player_1_stack.push(card_player2);
           }
           else if(card_player2 == 0)
           {
               player_2_stack.push(card_player2);
               player_2_stack.push(card_player1);
           }
           else if(card_player1 > card_player2)
           {
               player_1_stack.push(card_player1);
               player_1_stack.push(card_player2);
           }
           else if(card_player1 < card_player2)
           {
               player_2_stack.push(card_player2);
               player_2_stack.push(card_player1);
           }
           count++;
       }
       if(player_1_stack.isEmpty())
       {
            System.out.println("Second " + count);
       }
       else if(player_2_stack.isEmpty()){
           System.out.println("First " + count);
       }
       else {
           System.out.println("botva" + count);
       }
    }
    public void App_Queue()
    {
        int count = 0;
        while(!player_1_queue.isEmpty() && !player_2_queue.isEmpty())
        {
            if(count == 106)
            {
                System.out.println("botva" + count);
            }
            int card_1 = player_1_queue.poll();
            int card_2 = player_2_queue.poll();
            if(card_1 == 0)
            {

                player_1_queue.offer(card_1);
                player_1_queue.offer(card_2);
            }
            else if(card_2 == 0)
            {
                player_2_queue.offer(card_2);
                player_2_queue.offer(card_1);
            }
            else if(card_1 > card_2)
            {
                player_1_queue.offer(card_1);
                player_1_queue.offer(card_2);
            }
            else if(card_1 < card_2)
            {
                player_2_queue.offer(card_2);
                player_2_queue.offer(card_1);
            }
            count++;
        }
        if(player_1_queue.isEmpty())
        {
            System.out.println("Second " + count);
        }
        else{
            System.out.println("First " + count);
        }
    }
    public void App_DoubleLink()
    {
        int count = 0;
        while(!player_1_doublelink.isEmpty() && !player_2_doublelink.isEmpty())
        {
            if(count == 106)
            {
                System.out.println("botva" + count);
            }
            int card_1 = player_1_doublelink.poll();
            int card_2 = player_2_doublelink.poll();
            if(card_1 == 0)
            {

                player_1_doublelink.addLast(card_1);
                player_1_doublelink.addLast(card_2);
            }
            else if(card_2 == 0)
            {
                player_2_doublelink.addLast(card_2);
                player_2_doublelink.addLast(card_1);
            }
            else if(card_1 > card_2)
            {
                player_1_doublelink.addLast(card_1);
                player_1_doublelink.addLast(card_2);
            }
            else if(card_1 < card_2)
            {
                player_2_doublelink.addLast(card_2);
                player_2_doublelink.addLast(card_1);
            }
            count++;
        }
        if(player_1_doublelink.isEmpty())
        {
            System.out.println("Second " + count);
        }
        else{
            System.out.println("First " + count);
        }
    }
}
class List<T>
{
    private DoubleLink<T> head;
    private DoubleLink<T> tail;
    private static class DoubleLink<T> {

        private int card;
        private DoubleLink<T> next;
        private DoubleLink<T> prev;


        DoubleLink(int card) {
            this.card = card;
        }
    }
    public void addLast(int card)
    {
        DoubleLink<T> newObj = new DoubleLink<>(card);
        if(tail == null)
        {
            head = tail = newObj;
        }
        else {
            tail.next = newObj;
            newObj.prev = tail;
            tail = newObj;

        }
    }
    public int poll()
    {
        if(head == null)
        {
            return -1;
        }
        int card = head.card;
        head = head.next;
        if(head != null)
        {
            head.prev = null;
        }
        else {
            tail = null;
        }
        return card;
    }
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else {
            return false;
        }
    }
}