import javax.swing.*;
import java.awt.*;

/**
 * Created by Alexander on 2015-05-08.
 */
public abstract class Drawable {
    Point position;
    ImageIcon icon;

    public Drawable(Point p, ImageIcon i)
    {
        position = p;
        icon = i;

    }

    public Point getPos() {
        return position;
    }

    public void setPos(Point p) {
        position = p;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon i) {
        this.icon = i;
    }
}
