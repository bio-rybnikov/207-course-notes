public class Rectangle {

    /** The width of this rectangle. */
    private double width;

    /** The height of this rectangle. */
    private double height;

    /** Creates a new rectangle with given width and height. */
    public Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }

    /** Calculates and returns the area of this rectangle. */
    public double area(){
        return width * height;
    }

    /**
     * Scales this rectangle
     * @param factor the factor
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    public boolean isLargerThan(Rectangle other){
        return area() > other.area();
    }
}
