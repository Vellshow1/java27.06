import java.util.Deque;
import java.util.LinkedList;


public class dz2 {
    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        // Проверка на пустые списки или наличие только нулей
        if (num1.isEmpty() || num2.isEmpty() || (num1.size() == 1 && num1.peek() == 0) || (num2.size() == 1 && num2.peek() == 0)) {
            Deque<Integer> result = new LinkedList<>();
            result.add(0);
            return result;
        }

        // Умножение двух чисел
        Deque<Integer> result = new LinkedList<>();
        int carry = 0;

        for (int digit2 : num2) {
            Deque<Integer> tempResult = new LinkedList<>(result);
            result.clear();
            for (int i = 0; i < carry; i++) {
                result.add(0);
            }
            carry = 0;

            for (int digit1 : num1) {
                int product = digit1 * digit2 + carry;
                result.add(product % 10);
                carry = product / 10;
            }

            while (carry > 0) {
                result.add(carry % 10);
                carry /= 10;
            }

            while (!tempResult.isEmpty() || !result.isEmpty()) {
                int sum = (tempResult.isEmpty() ? 0 : tempResult.remove()) + (result.isEmpty() ? 0 : result.remove());
                result.add(sum % 10);
                carry = sum / 10;
            }
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }

        return result;
    }

    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        // Сложение двух чисел
        Deque<Integer> result = new LinkedList<>();
        int carry = 0;

        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.remove();
            int digit2 = num2.isEmpty() ? 0 : num2.remove();
            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Пример использования
        Deque<Integer> num1 = new LinkedList<>();
        num1.add(2);
        num1.add(3);
        num1.add(4);

        Deque<Integer> num2 = new LinkedList<>();
        num2.add(5);
        num2.add(6);

        // Умножение чисел
        Deque<Integer> product = multiply(num1, num2);
        System.out.println("Результат умножения: " + product);

        // Сложение чисел
        Deque<Integer> sum = add(num1, num2);
        System.out.println("Результат сложения: " + sum);
    }
}

   

