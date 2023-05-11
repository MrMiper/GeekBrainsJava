// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

class HomeWork1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = in.nextInt();
        in.close();
        int result = 0;
        for(int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
