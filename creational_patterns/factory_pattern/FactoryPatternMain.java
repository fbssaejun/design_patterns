package factory_pattern;

//Use the Factory to get object of concrete class by passing an information such as type.
public class FactoryPatternMain {
  public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     //get an object of Circle and call its draw method.
     Shape circle = shapeFactory.getShape("CIRCLE");

     //call draw method of Circle
     circle.draw();

     //get an object of Rectangle and call its draw method.
     Shape rectangle = shapeFactory.getShape("RECTANGLE");

     //call draw method of Rectangle
     rectangle.draw();

     //get an object of Square and call its draw method.
     Shape square = shapeFactory.getShape("SQUARE");

     //call draw method of square
     square.draw();
  }
}

/*
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
 */

