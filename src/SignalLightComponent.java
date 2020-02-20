import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class SignalLightComponent extends JComponent {

    public void paintComponent (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        /**
         * draw the black body of the signal light
         */
        Rectangle rectangle = new Rectangle(100, 50, 70, 200);
        g2.draw(rectangle);
        g2.fill(rectangle);

        /**
         * draw the red light
         */
        Ellipse2D.Double redLight = new Ellipse2D.Double(114, 64, 45, 45);
        g2.setColor(Color.red);
        g2.draw(redLight);
        g2.fill(redLight);

        /**
         * draw the yellow light
         */
        Ellipse2D.Double yellowLight = new Ellipse2D.Double(114, 124, 45, 45);
        g2.setColor(Color.yellow);
        g2.draw(yellowLight);
        g2.fill(yellowLight);

        /**
         * draw the green light
         */
        Ellipse2D.Double greenLight = new Ellipse2D.Double(114, 184, 45, 45);
        g2.setColor(Color.green);
        g2.draw(greenLight);
        g2.fill(greenLight);
    }
}
