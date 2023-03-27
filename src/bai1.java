import java.sql.SQLOutput;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation giaiPT = new QuadraticEquation(a,b,c);
        if(giaiPT.delta()>0){
            System.out.println("x1= "+ giaiPT.x1());
            System.out.println("x2= "+giaiPT.x2());
        }
        else if(giaiPT.delta() ==0){
            System.out.println("x= "+ giaiPT.x3());
        }
        else {
            System.out.println("vo nghiem");
        }
    }
}
class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b * b - (4 * a * c);
    }

    public double x1() {
            return (-b + Math.pow(delta(), 0.5)) / (2 * a);

    }
    public double x2(){
            return (-b - Math.pow(delta(), 0.5)) / (2 * a);
    }
    public double x3(){
        return -b/(2*a);
    }
}