import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dz3 {
    private static int j;

    /**
     * @param args
     */
    public static void main(String[] args) {
                


    }
    static void sortList(){

    List<Integer> numbers = new ArrayList<Integer>();

    numbers.add(11);
    numbers.add(45);
    numbers.add(12);
    numbers.add(32);
    numbers.add(36);

System.out.println("Unsorted List: " + numbers);

    for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
        Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("This is Even Number: " + number);
                iterator.remove();
    }

}

Collections.sort(numbers);
System.out.println("Sorted List: " + numbers);


 

}
