import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class dz3 {

    public static void main(String[] args) {
        
 

        List <Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        Collections.sort(list);

        System.out.println(list);

    
        
        for (int i=0;i<list.size();i++){
            int even=list.get(i)%2;

        if (even==0){
            System.out.println("This is Even Number:"+ list.get(i));
            list.remove(i);

        // Add this:
        i--;
    }
}

        int min = list.get(0);
        int max = list.get(0);
        for (Integer i: list) {
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;
            }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);

        System.out.println(list);
    
    }        
}