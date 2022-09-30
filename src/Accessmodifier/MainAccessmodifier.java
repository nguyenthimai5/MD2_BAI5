package Accessmodifier;

import java.util.Scanner;

public class MainAccessmodifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào giá trị của bán kính:");
        double radius=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập màu:");
       String color=scanner.nextLine();
        AccessModifier accessModifier= new AccessModifier(radius,color);
        System.out.println("Diện tích hình tròn là:"+accessModifier.getArea());
    }
}
