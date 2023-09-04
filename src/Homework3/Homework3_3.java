package Homework3;

import java.util.Scanner;

public class Homework3_3 {
    //Bài 3: Tính chỉ số BMI theo dữ liệu người dùng nhập vào
    //Công thức tính BMI = Cân nặng (kg) / Chiều cao (m) * Chiều cao (m)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        double BMI = weight/ (height * height);
        System.out.println("Chỉ số BMI của bạn là: "+ BMI);
    }
}
