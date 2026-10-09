package com.codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demo thư viện giải phương trình bậc 2 ===\n");

        // Test 1: 2 nghiệm phân biệt (x² - 3x + 2 = 0 → x=1, x=2)
        QuadraticEquation eq1 = new QuadraticEquation(1, -3, 2);
        System.out.println("Phương trình: x² - 3x + 2 = 0");
        System.out.println("Delta = " + eq1.getDiscriminant());
        System.out.println(eq1.solve());
        System.out.println();

        // Test 2: nghiệm kép (x² - 2x + 1 = 0 → x=1)
        QuadraticEquation eq2 = new QuadraticEquation(1, -2, 1);
        System.out.println("Phương trình: x² - 2x + 1 = 0");
        System.out.println("Delta = " + eq2.getDiscriminant());
        System.out.println(eq2.solve());
        System.out.println();

        // Test 3: vô nghiệm (x² + x + 1 = 0)
        QuadraticEquation eq3 = new QuadraticEquation(1, 1, 1);
        System.out.println("Phương trình: x² + x + 1 = 0");
        System.out.println("Delta = " + eq3.getDiscriminant());
        System.out.println(eq3.solve());
        System.out.println();

        // Test 4: bậc nhất (0x² + 2x - 4 = 0 → x=2)
        QuadraticEquation eq4 = new QuadraticEquation(0, 2, -4);
        System.out.println("Phương trình: 2x - 4 = 0");
        System.out.println(eq4.solve());
    }
}
