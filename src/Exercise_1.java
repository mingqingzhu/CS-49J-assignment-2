import javax.swing.*;


public class Exercise_1 {

    public void creatFrame() {
        /**
         * Create the frame and display signal light component in the frame
         */
        JFrame jframe = new JFrame();
        jframe.setSize(300, 400);
        jframe.setTitle("Signal Light");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SignalLightComponent component = new SignalLightComponent();
        jframe.add(component);

        jframe.setVisible(true);
    }

}
