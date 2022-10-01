/******************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 14th February
        Task: Creating a class based on UML diagram.
*********************************************************/

package pgupta85_Lab4.src.Q2;

class Circle
{
    //Declaring public field variable called radius.
    public Double radius; 

    //Creating Setter method to set radius field value, but it is not necessary as radius is public hence it can be directly accessed by other class.
    public void setRadius ( double rad){
        radius = rad;
    }

    //Creating Getter method to access radius field, but again it is not required in this case. It has return type of double and return the value in radius field when called.
    public double getRadius(){
        return radius;
    }
    
    //Creating Getter method called getArea with return type set to double. When called it will calculate the area of circle and return the value.
    public double getArea(){
        return ((Math.PI)*Math.pow(radius, 2));
    }

    //Creating Getter method called getDiameter with return type set to double. When called it will calculate the diameter of circle and return the value.
    public double getDiameter (){
        return (radius*2);
    }
    
    //Creating Getter method called getCircumference with return type set to double. When called it will calculate the circumference of circle and return the value.
    public double getCircumference(){
        return (2*Math.PI*radius);
    }
}
