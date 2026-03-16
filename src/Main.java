import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("***Задача 1***");
        int[] inputArray1 = {500, 750, 250, 1500, 800};
        float[] outputArray1 = new float[4];
        outputArray1[2] = inputArray1[0];
        for (int element : inputArray1) {
            outputArray1[0] = outputArray1[0] + element;
            if (outputArray1[1] < element) {
                outputArray1[1] = element;
            }
            if (element < outputArray1[2]) {
                outputArray1[2] = element;
            }
        }
        outputArray1[3] = outputArray1[0] / inputArray1.length;
        System.out.println("Значения входного массива");
        System.out.println(Arrays.toString(inputArray1));
        System.out.println("Значения выходного массива");
        System.out.println(Arrays.toString(outputArray1));
        System.out.printf("Cумма значений массива " + outputArray1[0] + "%n Максимум значений массива " + outputArray1[1] + "%n Минимум значений массива " + outputArray1[2] + "%n Среднее значений массива " + outputArray1[3] + "%n");
        //Exercise 2
        System.out.println("***Задача 2***");
        int[] inputArray2 = {512, 1024, 128, 4096, 64};
        float[] outputArray2 = new float[inputArray2.length];
        int i2 = 0;
        for (int element : inputArray2) {
            outputArray2[i2] = element * 0.13f;
            i2++;
        }
        System.out.println("Значения входного массива");
        System.out.println(Arrays.toString(inputArray2));
        System.out.println("Значения выходного массива");
        System.out.println(Arrays.toString(outputArray2));
        //Exercise 3
        System.out.println("***Задача 3***");
        int[] inputArray3 = {4000, 5000, 3500, 7000, 2000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int i3 = 0;
        for (int element : inputArray3) {
            outputArray3[i3] = element > 5000;
            i3++;
        }
        System.out.println("Значения входного массива");
        System.out.println(Arrays.toString(inputArray3));
        System.out.println("Значения выходного массива");
        System.out.println(Arrays.toString(outputArray3));
        //Exercise 4
        System.out.println("***Задача 4***");
        int[] inputArray4 = {4000, 5000, -20, 7000, 2000};
        boolean[] outputArray4 = {true};
        for (int element : inputArray4) {
            if (element < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("Значения входного массива");
        System.out.println(Arrays.toString(inputArray4));
        System.out.println("Значения выходного массива");
        System.out.println(Arrays.toString(outputArray4));
        //Exercise 5
        System.out.println("***Задача 5***");
        int[] inputArray5 = {20000, 15000, -3500, 70000, 2000};
        int[] outputArray5 = {0};
        int profitMonths = 0;
        for (int element : inputArray5) {
            if (element > 0) {
                profitMonths++;
            }
        }
        outputArray5[0] = profitMonths;
        System.out.println("Значения входного массива");
        System.out.println(Arrays.toString(inputArray5));
        System.out.println("Значения выходного массива");
        System.out.println(Arrays.toString(outputArray5));
    }
}