package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {

    static Scanner s = new Scanner(System.in);
    int x1,x2,y1,y2;
    void getData(){
        System.out.println("Enter x1:");
        x1 = s.nextInt();
        System.out.println("Enter y1:");
        y1 = s.nextInt();
        System.out.println("Enter x2:");
        x2 = s.nextInt();
        System.out.println("Enter y2:");
        y2 = s.nextInt();
    }
    float getSqrt(){
        int x = (x2-x1)*(x2-x1);
        int y = (y2-y1)*(y2-y1);
        int num = x+y;
        System.out.println(num);
        float temp;
        float sqrt = num/2;
        do{
            temp = sqrt;
            sqrt = (temp+(num/temp))/2;
        }while ((temp - sqrt) != 0);
        return sqrt;
    }
    public static void main(String[] args) {

        LineComparison l = new LineComparison();
        l.getData();
        float ans = l.getSqrt();
        System.out.println("Length of a line is "+ans);
    }
}
