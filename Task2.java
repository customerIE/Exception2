/* Если необходимо, исправьте данный код (задание 2)
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */


public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 18, 41, 36, 78, 899, 1};
        int d = 1;
        int index = 5;
        if (d == 0) {
            System.out.println("Знаменатель не может быть 0.");
        } else if (intArray == null) {
            System.out.println("Массив пустой.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Индекс вне диапазона.");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}

 