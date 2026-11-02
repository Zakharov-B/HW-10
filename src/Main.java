import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("task 1");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"Яблоко", "Банан", "Апельсин"};
        //Task 2
        System.out.println("task 2");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);
            if (i < thirdArray.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        //Task 3
        System.out.println("task 3");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.println(firstArray[i]);
            if (i > 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.println(secondArray[i]);
            if (i > 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.println(thirdArray[i]);
            if (i > 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        //Task 4
        System.out.println("task 4");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));

    }
}