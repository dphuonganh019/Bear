package Homework3;

public class Homework3_5 {
    //Bài 5: Tìm số lớn nhất trong mảng cho trước và vị trí của nó
    public static void main(String[] args) {
        int [] array = {50, 10, 55, 20, 25, 30};
        int max = array[0];
        int index = 0;
        for (int i = 1;i < array.length;i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
            System.out.println("Giá trị phần tử lớn nhất trong mảng là " + max);
            System.out.println("Vị trí của phần tử lớn nhất trong mảng là "+ index);
    }
}
