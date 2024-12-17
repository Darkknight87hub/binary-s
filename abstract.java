 import java.util.Scanner;
abstract class Shape
{
  double dimenstion1;
  double dimension2;

public void inputData(double d1,double d2)

{
 this.dimension1=d1;
 this.dimension2=d2;

public abstract double compute_area ()

}

  

class TringleextendShape
{
    public double compute_area()
{
   return 0.5*dimension1*dimension2;

}

}
class RectangleextendShape
{
public double compute_area()
{

return dimeision1*dimension2;

}

}

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
Rectangle retangle=new retangle();
Tringle tringle =new tringle();


System.out.printn("*****we have follow shape to calculate area*****");

System.out.printn("1.Tringle");
System.out.printn("2.Retangle");
System.out.printn("Enter your choice:");
int ch=sc.nextInt();


if(ch==1)
{

System.out.printn("Enter base and height of Tringle");
double d1=sc.nextDouble();
double d2=sc.nextDouble();
tringle.inputData(d1,d2);
dopuble area=tringle.compute_area();
System.out.printn("Calculate area of tringle is:"+area);
}
else if(ch==2)
{

System.out.printn("Enter base and height of Rectangle");
double d1=sc.nextDouble();
double d2=sc.nextDouble();
tringle.inputData(d1,d2);
dopuble area=tringle.compute_area();
System.out.printn("Calculate area of Rectangle is:"+area);
}
else
{
System.out.printn("invalid choice");
return;
}
}

}
