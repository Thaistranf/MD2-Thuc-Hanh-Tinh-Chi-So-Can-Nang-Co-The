import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng: ");
        float weight =sc.nextFloat();
        System.out.print("Nhập chiều cao: ");
        float height =sc.nextFloat();

        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi < 25){
            System.out.println("Normal");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Overweight");
        } else if (30 <= bmi){
            System.out.println("Obese");
        }
    }
}