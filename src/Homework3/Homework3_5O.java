package Homework3;

import java.util.Scanner;

public class Homework3_5O {
    //Bài 5 (Optional): Cho người dùng nhập vào 1 mảng và tìm max của mảng đó và vị trí của phần tử đó
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int slpt = sc.nextInt(); //slpt là Số lượng phần tử =))

        int [] arr = new int[slpt];//Khởi tạo bảng có số lượng phần tử như user nhập

        for (int i = 0; i < slpt; i++){ //Vì vị trí mảng bắt đầu từ 0, còn số phần tử thì bắt đầu từ 1, nên i bắt đầu bằng 0
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");// thì user sẽ nhận được yêu cầu nhập từ "thứ 1"
            arr[i] = sc.nextInt(); //Điền các phần tử user nhập vào từng vị trí trong mảng
        }

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < slpt; i++){
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị phần tử lớn nhất của mảng là " + max);
        System.out.println("Vị trí phần tử lớn của mảng là " + index);
    }
}
