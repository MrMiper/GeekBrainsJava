// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
public class Sem5HomeWork4 {



    public static void main(String[] args) {
        int[] queens = new int[8];
        findPosition(0, queens);

        // Вывод доски в консоль
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("X");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }

    // Функция для поиска расстановки ферзей
    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) { // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col; // Сохранить расстановку ферзя в массив
                if (findPosition(row + 1, queens)) { // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;
    }
}
