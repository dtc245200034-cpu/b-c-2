package com.codegym;

/**
 * Lớp giải phương trình bậc 2: ax² + bx + c = 0
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    /**
     * Tính delta = b² - 4ac
     */
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    /**
     * Nghiệm thứ nhất (khi delta >= 0)
     * x1 = (-b + sqrt(delta)) / (2a)
     */
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    /**
     * Nghiệm thứ hai (khi delta >= 0)
     * x2 = (-b - sqrt(delta)) / (2a)
     */
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    /**
     * Trả về mô tả kết quả giải phương trình
     */
    public String solve() {
        if (a == 0) {
            // Giảm về phương trình bậc 1: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    return "Phương trình vô số nghiệm";
                } else {
                    return "Phương trình vô nghiệm";
                }
            }
            double x = -c / b;
            return "Phương trình bậc nhất có nghiệm x = " + x;
        }

        double delta = getDiscriminant();
        if (delta > 0) {
            double x1 = getRoot1();
            double x2 = getRoot2();
            return "Phương trình có 2 nghiệm phân biệt:\n  x1 = " + x1 + "\n  x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phương trình có nghiệm kép x = " + x;
        } else {
            return "Phương trình vô nghiệm (delta < 0)";
        }
    }
}
