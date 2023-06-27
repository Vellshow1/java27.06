/**
 * code
//  */
// public class dz1 {

//     public static void main(String[] args) {
    
//         for (int i = 2; i <= 1000; i++) {
//             boolean fleg = true;
//             for (int j = 2; j < i; j++) {
//                 if(i  % j==0){
//                     fleg = false;
//                     break;
//                 }
//             }
//             if(fleg){
//                 System.out.println(i);  
//             }
//         }
//     }
// }



// import java.util.Scanner;
// public class dz1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Введите первое число: ");
//         int num1 = iScanner.nextInt();
//         System.out.println("Введите второе число: ");
//         int num2 = iScanner.nextInt();
//         System.out.println("Выберите номер операции:\n 1 = [-] \n 2 = [+] \n 3 = [%] \n 4 = [/]");
//         int d = iScanner.nextInt();


//         if(d== 1){
//             int a = 0;
//             a = num1 - num2;
//             System.out.printf("Ответ: %d \n", a);
//         }
//         if(d== 2){
//             int a = 0;
//             a = num1 + num2;
//             System.out.printf("Ответ: %d \n", a);
//         }
//         if(d== 3){
//             int a = 0;
//             a = num1 % num2;
//             System.out.printf("Ответ: %d \n", a);
//         }
//         if(d== 4){
//             int a = 0;
//             a = num1 / num2;
//             System.out.printf("Ответ: %d \n", a);
//         }
//         if(d>4){
//             System.out.println("Данную операцию мы не производим");
//         }
//     }
// }



import java.util.Scanner;

/**
 * dz1
 */
public class dz1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число - n: ");
        int num = iScanner.nextInt();
        int sum1= 0;
        int ymn = 1;
        for (int i = 1; i <= num; i++) {
            sum1+=1;
            ymn = ymn*i;
           
        }
        System.out.printf("Сумма чисел от 1 до -n: %s%n",sum1);
        System.out.printf("Произведение чисел от 1 до %d:%d%n:", num, ymn);
    }
}