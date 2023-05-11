// Вывести все простые числа от 1 до 1000

class HomeWork2 {
    public static void main(String[] args) {
        int number = 1000;
        int counter = 0;
        System.out.printf("Простые числа в диапозоне от 1 до %d:\n", number);
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 1) {
                System.out.println(i);
            } 
            counter = 0;
        }
    }
}