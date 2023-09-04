package Homework3;

import java.util.Scanner;

public class Homework3_4 {
    //Bài 4: Tính giai thừa của 1 số nguyên do người dùng nhập vào
    //Công thức giai thừa: n ! = nx (n -1) x (n – 2) x. . . x 2 x 1
    //*n là số nguyên dương (n > 0)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương: ");
        int number = sc.nextInt();
        long giaithua = 1;
        if (number < 0) {
            System.out.println("Cần nhập số nguyên dương để tính giai thừa");
        } else {
            for (int i = 1; i <= number; i++) {
                giaithua *= i; //giaithua = giaithua*i
            }
            System.out.println("Giai thừa của " + number + " là " + giaithua);
        }
    }
}
