package Homework3;

public class Homework3_1 {
    //Bài 1: In ra các số từ 1->10
    public static void main(String[] args) {
        // Cách 1: Dùng FOR
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //Cách 2: Dùng WHILE
        int i = 1;
        while (i <=10){
            System.out.println(i);
            i++;
        }
        //Cách 3:Dùng DO - WHILE
        int j = 1;
        do {
            System.out.println(j); j++;
        } while (j <= 10);
    }
}
