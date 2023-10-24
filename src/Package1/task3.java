
/*
Показать на консоли все числа Армстронга в диапазоне от 0 до 10.000.000. Число Армстронга, или
Самовлюблённое число, или совершенный цифровой
инвариант или — натуральное число, которое равно
сумме своих цифр, возведённых в степень, равную
количеству его цифр. НаПример: 13 + 53 + 33 = 153. */

package Package1;

import java.sql.Array;

public class task3 {
    public static void main(String[] args) {

        for (int i = 1; i < 10000000; i++){
            int[] arr = {0,0,0,0,0,0,0,0};
            int x = 10;
            int tmp1=0;
            int tmp2 = i;

            do{
                tmp1++;
                tmp2 /= x;
            }while (tmp2 > 0);
            tmp2 = i;
            for (int j=0; j < tmp1; j++){

                arr[j] = tmp2 % x;

                tmp2 /=x;
            }
            if (Math.pow(arr[0], tmp1) + Math.pow(arr[1], tmp1) + Math.pow(arr[2], tmp1) + Math.pow(arr[3], tmp1) + Math.pow(arr[4], tmp1) + Math.pow(arr[5], tmp1) + Math.pow(arr[6], tmp1) + Math.pow(arr[7], tmp1) == i){
                System.out.println(i);
            }
        }

    }
}
