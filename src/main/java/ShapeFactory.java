public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType, Double size){
        if(shapeType == null){
            return null;
        }
        if(shapeType.name().equalsIgnoreCase("CIRCLE")){
            return new Circle(size);

        } else if(shapeType.name().equalsIgnoreCase("RECTANGLE")){
            return new Rectangle(size, size);

        } else if(shapeType.name().equalsIgnoreCase("TRIANGLE")){
            return new Triangle(size, size);
        }

        return null;
    }
}