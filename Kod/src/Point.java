/**
 * Created by Alexander on 2015-05-10.
 */
public class Point extends Vector{
    public Point(int x, int y) {
        super(new double[]{x,y});
    }

    public int getX() {
        return (int)get(0);
    }

    public int getY() {
        return (int)get(1);
    }

    public void add(Point p) {
        setData(add(p,1).getData());
    }

    /**
     * Rotates the vector a specified number of radians counter-clockwise.
     * @param radians
     */
    public void rotate(double radians) {
        Matrix rotate = new Matrix(new double[][] {
                {Math.cos(radians),-Math.sin(radians)},
                {Math.sin(radians),Math.cos(radians)}
        });
        setData(rotate.multiply(this).getData());
    }

    public void normalize() {
        double norm = Math.sqrt(getX()*getX()+getY()*getY());
        setData(multiply(norm).getData());
    }
}
