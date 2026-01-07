import java.util.Scanner;
class Circle{
    double radius;
    String colour;
    void getInput(){
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
        colour=sc.next();
    }
    void calcArea(){
        double area=3.14159*radius*radius;
        System.out.println(area);
    }
}
public class Q3{
    public static void main(String[] args){
        Circle c=new Circle();
        c.getInput();
        c.calcArea();
    }
}