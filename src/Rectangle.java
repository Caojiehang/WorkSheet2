/** 
 *  The following code is buggy. Why?
 *
 *  We define a rectangle by the three field variables width, height,
 *  and area, each of type double. Furthermore, we write getters and
 *  setters for the three fields as well as a toString method. We test
 *  it in a main method.
 *
 *  @version 2018-08-31
 *  @author Manfred Kerber
 */

public class Rectangle {

    private double width;
    private double height;
    private double area;

    /**
     *  <pre>
     *                 width
     *  +--------------------------------------+
     *  |                                      |
     *  |                                      |
     *  |       area = width * height          |  height
     *  |                                      |
     *  |                                      |
     *  +--------------------------------------+
     *  </pre>
     *  @param width The width of the rectangle.
     *  @param height The height of the rectangle.
     *  @param area The area of the rectangle.
     */
    public Rectangle(double width, double height,double area) {
        this.area =area;
        this.width  = width;
        this.height = height;
    }

    /**
     *  Getter for the width.
     *  @return The width of the rectangle is returned.
     */ 
    public double getWidth() {
        return width;
    }

    /**
     *  Getter for the height.
     *  @return The height of the rectangle is returned.
     */ 
    public double getHeight() {
        return height;
    }

    /**
     *  Getter for the area.
     *  @return The area of the rectangle is returned.
     */
    //public double getArea() {return area;}
    public double getArea() {
        return getHeight()*getWidth();
    }

    /**
     *  Setter for the width. The width of the rectangle is updated.
     *  @param width The new width of the updated rectangle.
     */ 
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *  Setter for the height. The height of the rectangle is updated.
     *  @param height The new height of the updated rectangle.
     */ 
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *  Setter for the area. The area of the rectangle is updated.
     *  @param area The new area of the updated rectangle.
     */ 
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return A human readable description of the rectangle in form
     *     of the three field variables specifying it.
     */ 
    public String toString() {
        return "The rectangle has a width of " + getWidth() +
            ", a height of " + getHeight() +
            ", and an area of " + getArea() + ".";
    }

    /*
     *  main method with a test of the setHeight setter and the
     *  toString method.
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4,8);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }
}
