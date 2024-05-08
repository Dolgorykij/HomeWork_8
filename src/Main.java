import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int [] arr_1 = new int[3];
        for (int index = 0; index < arr_1.length; index++) {
            arr_1[index] = index+1;
            System.out.print(arr_1[index] + " ");
        }
        System.out.println();
        double[] arr_2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i] + " ");
        }
        System.out.println();
        int [] arr_3 = new int [5];
        for (int i = 0; i < arr_3.length; i++) {
            arr_3[i] = i+1;
            System.out.print(arr_3[i] + " ");
        }
            System.out.println();

        System.out.println("Задание 2");
        System.out.println(Arrays.toString(arr_1));
        System.out.println(Arrays.toString(arr_2));
        System.out.println(Arrays.toString(arr_3));

        System.out.println("Задание 3");
        for (int i = arr_1.length - 1; i >= 0; i--) {
            System.out.print(arr_1[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr_2.length - 1; i >= 0; i--) {
            System.out.print(arr_2[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr_3.length - 1; i >= 0; i--) {
            System.out.print(arr_3[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
            for (int i = 0; i < arr_1.length; i++) {
                if (arr_1[i] % 2 == 1) {
                    arr_1[i] ++;
                }
            }
            System.out.println(Arrays.toString(arr_1));

    }
}