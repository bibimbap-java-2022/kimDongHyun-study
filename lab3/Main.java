package BibimbabPractice;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // 자신의 이름 출력
        System.out.println("김동현");

        // 자신의 학번 출력
        System.out.println("202211266");

        // A와 B를 받아 A@B 연산결과를 출력하는 프로그램 작성
        // A@B = (A+B)*(A-B)
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println((A+B) * (A-B));

        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
        double C = sc.nextDouble();
        Double num1 = new Double((A+B)%C);
        Double num2 = new Double(((A%C) + (B%C))%C);
        Double num3 = new Double((A*B)%C);
        Double num4 = new Double(((A%C) * (B%C))%C);
        System.out.println(num1.equals(num2));
        System.out.println(num3.equals(num4));
    }
}
