
/*
Программа запрашивает шестизначное число, после
ввода определяет будет ли являтся счастливым билет
с таким номером (сумма первых трех цифр совпадает
с сумой трех последних).
Пример входных данных:
421151
954832
Вывод:
Да
Нет*/

package Package1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int operand1 =0;
        for (int i = 0; i<3;i++){
            operand1 += num%10;
            num/=10;
        }
        int operand2 =0;
        for (int i = 0; i<3;i++){
            operand2 += num%10;
            num/=10;
        }

        System.out.println(operand1==operand2 ?"yes":"no");
    }

}
