
/*
        Необходимо нарисовать ёлочку символом звёздочки.
        Каждый новый ярус должен быть шире предыдущего.
        С клавиатуры вводится количество ярусов, и высота
        первого (верхнего) яруса ёлочки. Ёлочка должна быть
        симметричная.
        *
       ***
        *
       ***
      *****


        */

package Package1;

import java.util.Scanner;

public class task4 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of tiers: ");
        int tiers = in.nextInt();
        System.out.print("Enter number of height: ");
        int height = in.nextInt();
        for (int i=0; i<tiers; i++){
            printTriangle(height+tiers, height+i);
        }


    }



    public static void printTriangle(int height, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j < height - i - 1 || j < height - i - 1) System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = height; j > 1; j--) {
                if (j < height - i + 1 || j < height - i - 1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();

        }
    }

}
