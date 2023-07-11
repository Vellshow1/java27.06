/**
 * code
 */
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Collections;

// public class code {

//     public static void main(String[] args) {
        
 

//         List <Integer> list = new ArrayList<Integer>();
//         list.add(11);
//         list.add(2);
//         list.add(5);
//         list.add(7);
//         list.add(8);
//         Collections.sort(list);

//         System.out.println(list);

    
        
//         for (int i=0;i<list.size();i++){
//             int even=list.get(i)%2;

//         if (even==0){
//             System.out.println("This is Even Number:"+ list.get(i));
//             list.remove(i);

//         // Add this:
//         i--;
//     }
// }

//         int min = list.get(0);
//         int max = list.get(0);
//         for (Integer i: list) {
//             if(i < min) 
//                 min = i;
//             if(i > max) 
//                 max = i;
//             }

//         System.out.println("минимальное число: " + min);
//         System.out.println("максимальное число: " + max);

//         System.out.println(list);
    
//     }        
// }

/**
 * code
 */
// import java.util.Scanner;
// public class code {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Enter equation like  '2? + ?5 = 69': ");
//         String equation = iScanner.nextLine();
//         String messege = "Решения нет!";
//         Boolean flag = true;

//         for (int i = 0; (i < 10)&& flag; i++) {
//             String result = equation.replace("?", Integer.toString(i));
//             System.out.println(result);
            
//             String[] arr = result.split(" ");
//             if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]));{
//                 messege = result;
//                 flag= false;
//             }
//         }
//         System.out.println(messege);
//         iScanner.close();
//     }
    
// }


/**
 * code
 */


//  import java.io.IOException;
//  import java.util.Random;
//  import java.util.logging.*;

// public class code {

//     public static void main(String[] args) throws IOException{
        
//         Logger ll = Logger.getLogger(lg.class.getName());
//         String logsPath = "log.txt";
//         FileHandler fh = new FileHandler(logsPath, false);
//         ll.addHandler(fh);
//         SimpleFormatter formatter = new SimpleFormatter();
//         fh.setFormatter(formatter);

//         Random rand = new Random();
//         for (int i = 0; i < 10; i++) {
//             int a = rand.nextInt(10);
//             ll.log(Level.INFO, "element: " +a);
//         }
//         ll.log(Level.WARNING, "logger off");
//     }
// }



import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.List;
/**
 * code
 */
public class code {

    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>(Arrays.asList("Земля", "Плутон", "Марс", "Плутон", "Марс"));
        System.out.println(list1);

        int count = 0;
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size() -1; i++) {
            if(!list2.contains(list1.get(i))){
                list2.add(list1.get(i));
                count =1;
                
                for (int j = i+ 1; j < list1.size()- 1 ; j++) {
                    if(list1.get(i) == list1.get(j)){
                        count +=1;
                    } 
                }
            System.out.println(list1.get(i) + count);   
        }
    }
    }
} 
