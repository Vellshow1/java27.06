// import java.util.Arrays;
// import java.util.LinkedList;

// public class dz4 {
//     public static void main(String[] args) {
//         LinkedList<Integer> array = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        

//         LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
//         for (int i = array.size() - 1; i >= 0; i--) {
 

//             revLinkedList.add(array.get(i));
//         }

//     System.out.print(revLinkedList);    
//     }
// }   

import java.util.LinkedList;



public class dz4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ll, getRandomNumber());
        }
        System.out.println(ll);

        System.out.println(dequeue(ll)); 
        System.out.println(ll);

        System.out.println(first(ll)); 
        System.out.println(ll); 
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { 
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}