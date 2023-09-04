package Homework3;

public class Homework3_2 {
    //Bài 2: In ra các số chẵn chia hết cho 5 trong khoảng từ 1->10
    public static void main(String[] args) {
        //Cách 1: Dùng FOR
        for (int i= 1; i <= 10; i++){
            if (i % 2 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
        //Cách 2: Dùng WHILE
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0 && i % 5 == 0) {
            System.out.println(i);
        }
            i++;
        }
        //Cách 3: Dùng DO - WHILE
        int j = 1;
        do {
            if (j % 2 == 0 && j % 5 == 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 10);
    }
}