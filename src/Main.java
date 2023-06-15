import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] resultArray = subtractArrays(array1, array2);
        System.out.println(Arrays.toString(resultArray));
}
    public static void divideByZero() {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }

    public static void outOfBounds() {
        int[] myArray = {1, 2, 3};
        try {
            System.out.println(myArray[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс находится за пределами массива!");
        }
    }

    public static void nullPointer() {
        String myString = null;
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: ссылка на null объект!");
        }
    }

    public static int[] subtractArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Ошибка: длины массивов не совпадают!");
            return new int[0];
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }
    }
}