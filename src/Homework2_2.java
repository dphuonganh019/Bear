public class Homework2_2 {
    public static void main(String[] args) {
        double a = 8; //hệ số 1
        double b = 3; //hệ số 2
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}