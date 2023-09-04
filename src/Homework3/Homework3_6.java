package Homework3;

public class Homework3_6 {
    //Bài 6: In ra 20 số Fibonaccy
    //Số Fibonacci là một dãy số trong đó mỗi số sau đó được tạo ra bằng cách cộng hai số trước đó.
    //VD: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    //Công thức: F(n) = F(n-1) + F(n-2)
    //Note lại cho đỡ quên, chả nhớ tí gì kiến thức toán học nữa huhu
    public static void main(String[] args) {
        int n = 20; //n là số lượng số fibonacci cần in
        int [] fibo = new int[n]; //khai báo mảng có số lượng phần tử là n = 20

        fibo[0] = 0; //Gán giá trị 0 vào vị trí 0 của mảng, vì dãy số Fibo bắt đầu bằng 0 và 1
        fibo[1] = 1;

        for (int i = 2; i < n; i++){//bắt đầu từ i=2 vì vị trí 0 và 1 đã được gán giá trị rồi
            fibo[i] = fibo[i - 1]+ fibo[i - 2];
        }
        System.out.println("20 số Fibonaccy đầu tiên là:");
        for (int i = 0; i < n; i++){
            System.out.print(fibo[i] + " ");//In cùng một dòng
        }
    }
}
