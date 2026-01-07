import java.util.Scanner;

class Commission{
    String name,address,phone;
    double sales;
    void accept(){
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        address=sc.nextLine();
        phone=sc.nextLine();
        sales=sc.nextDouble();
    }
    void calculate(){
        double c=0;
        if(sales>=100000)c=sales*0.10;
        else if(sales>=50000)c=sales*0.05;
        else if(sales>=30000)c=sales*0.03;
        else c=0;
        System.out.println(c);
    }
}
public class Q2{
    public static void main(String[] args){
        new Student();
        Commission c=new Commission();
        c.accept();
        c.calculate();
    }
}

class Student{
    Student(){
        System.out.println("Student object is created");
    }
}