
/*
                Сформируйте массив из 10 элементов, заполнив его
                целыми случайными числами от –10 до 10. Определите
                среднее арифметическое элементов массива. Сформируйте новый массив, переписав в него элементы
                исходного массива, меньшие среднего.
                Выполните сортировку исходного массива по возрастанию элементов.
                */


package Package1;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        int[] array = new int [10];
        for (int i = 0; i < 10; i++) {
            array[i]= (int)(Math.random()*22-11);
        }
        printArray(array);
        double ave = average(array);
        System.out.println(ave);
        int size=0;
        for (int i = 0; i < 10; i++) {
            if (array[i]<ave) {
                size++;
            }
        }
        int j=0;
        int[] arr2=new int[size];
        for (int i = 0; i < 10; i++) {
            if (array[i]<ave) {
                arr2[j]=array[i];
                j++;
            }
        }
        for (int item:
             arr2) {
            System.out.print(item+" | ");
        }
        System.out.println();
    }
    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }
    public static double average(int [] arr){
        double res =0;
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];
        }
        res/=arr.length;
        return res;
    }
}
