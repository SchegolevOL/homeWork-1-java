
/*      Сформируйте двумерный целочисленный массив.
        Число строк и столбцов нужно запросить у пользо-
        вателя. Заполните массив случайными числами от 0
        до 10 и выведите его на консоль. Удалите из массива
        одну строку (номер строки запросите у пользователя).
        Распечатайте полученный массив. Используйте ста-
        тические методы для реализации каждого действия
        (инициализация массива, вывод на консоль, удаление
        строки).*/

package Package1;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter colum: ");
        int colum = in.nextInt();
        System.out.print("Enter row: ");
        int row = in.nextInt();

        int[][] matrix = new int[row][colum];
        matrixRandom(matrix,0,10);
        matrixPrint(matrix);
        System.out.print("Enter delete row: ");
        int rowDel = in.nextInt();
        matrix = matrixDeleteRow(matrix, rowDel);
        System.out.println("------------------------------");
        matrixPrint(matrix);
    }


    public static void matrixRandom(int[][]matrix, int begin, int end){
        int row=matrix.length;
        int colum = matrix[0].length;

        for (int i = 0; i <= row-1; i++) {
            for (int j = 0; j <= colum-1; j++) {
                matrix[i][j]=(int)(Math.random()*(end-(begin)+1)+begin);
            }
        }

    }
    public static void matrixPrint(int[][]matrix){
        int row=matrix.length;
        int colum = matrix[0].length;

        for (int i = 0; i <=row-1; i++) {
            for (int j = 0; j <= colum-1; j++) {
                System.out.print(matrix[i][j]+" | ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixDeleteRow(int[][]matrix, int delRow){
        int row=matrix.length;
        int colum = matrix[0].length;
        int[][] res = new int[row-1][colum];
        int j = 0;
        for (int i = 0; i <= row-1; i++) {
            if (i==delRow)continue;
            res[j]=matrix[i];
            j++;
        }
        return res;
    }
}



