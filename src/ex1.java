import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = sc.nextDouble();
        System.out.println("Enter height:");
        double height = sc.nextDouble();
        Rectangle hcn = new Rectangle(width,height);
        System.out.println(hcn.display());
        System.out.println("Area: "+ hcn.getArea());
        System.out.println("Perimeter: "+ hcn.getPerimeter());
    }
}
class Rectangle{
    private double width,height;
    public Rectangle(double w,double h){
        this.width =w;
        this.height=h;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }

   public String display(){
        return "Rectangle{" + "width" + width + ", heigth" + height+ "}";
   }

}
