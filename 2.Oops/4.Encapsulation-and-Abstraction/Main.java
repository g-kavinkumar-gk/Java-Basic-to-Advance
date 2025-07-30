/*
Abstract Class I - Shape

Create an abstract class named Shape with the following protected attributes / member variables.

• String name

Include a 1-argument constructor.

Include getters and setters.

Include an abstract method named calculateArea(). This method returns a Float value.

Create a class named Circle. The class Circle is a derived class of Shape. Include the following private attributes / member variables.

• Integer radius

Include a 2-argument constructor. The order of the arguments is name, radius.

Include getters and setters.

Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the circle. [Take the value of pi as 3.14] 

Create a class named Square. The class Square is a derived class of Shape. Include the following private attributes/member variables. 

• Integer side

Include a 2-argument constructor. The order of the arguments is name, side.

Include getters and setters.

Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the square.

Create a class named Rectangle. The class Rectangle is a derived class of Shape. Include the following private attributes / member variables. 

• Integer length

• Integer breadth

Include a 3-argument constructor. The order of the arguments is name, length, breadth

Include getters and setters.

Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the rectangle.

Create another class called Main. In the method, create instances of the above classes and test the above classes. Input and Output Format:

Refer sample input and output for formatting specifications.

All Float values are displayed correct to 2 decimal places.


Constraints:
Constraints:
name must be a non-empty string (1 ≤ length ≤ 50).
radius, side, length, and breadth must be positive integers (1 ≤ value ≤ 10⁶).
The value of π (pi) is fixed at 3.14.
calculateArea() should return Float and display output with 2 decimal places.
Objects must be created and tested in the Main class, following the input order.
*/

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String s;
    double val,val2;
    s=reader.nextLine();
    char ch=s.charAt(0);
    System.out.println("Circle\nSquare\nRectangle");
    System.out.println("Enter the shape name");
    switch(ch){
      case 'C':
        Circle obj1=new Circle();
        System.out.println("Enter the radius");
        val=reader.nextDouble();
        obj1.findArea(val);
        break;
      case 'S':
        Square obj2=new Square();
        System.out.println("Enter the side");
        val=reader.nextDouble();
        obj2.findArea(val);
        break;
      case 'R':
        Rectangle obj3=new Rectangle();
        System.out.println("Enter the length\nEnter the breadth");
        val=reader.nextDouble();
        val2=reader.nextDouble();
        obj3.findArea(val,val2);
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}

abstract class Shape{
  protected String name;
  protected int area;
  public void show(String name,double area){
    System.out.printf("Area of %s is %.2f",name,area);
  }
}

class Circle extends Shape{
  private double area;
  private String name="Circle";
  public void findArea(double rad){
    area=(3.14*rad*rad);
    super.show(name,area);
  } 
}

class Square extends Shape{
  private double area;
  private String name="Square";
  public void findArea(double side){
    area=side*side;
    super.show(name,area);
  }
}

class Rectangle extends Shape{
  private double area;
  private String name="Rectangle";
  public void findArea(double l,double b){
    area=l*b;
    super.show(name,area);
  }
}