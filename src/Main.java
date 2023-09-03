import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception{
        JFrame jFrame = getFrame();
        jFrame.add(new Mycomponent());
    }

    static class Mycomponent extends JComponent {
        @Override
        protected void paintComponent (Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            RoundRectangle2D r2 = new RoundRectangle2D.Double(150, 125, 100, 325, 20, 20);
            g2.draw(r2);
            g2.setColor(Color.black);
            g2.fill(r2);
            g2.setColor(Color.white);
            Ellipse2D ew1 = new Ellipse2D.Double(160, 135, 80, 80);
            g2.draw(ew1);
            g2.fill(ew1);
            Ellipse2D ew2 = new Ellipse2D.Double(160, 245, 80, 80);
            g2.draw(ew2);
            g2.fill(ew2);
            Ellipse2D ew3 = new Ellipse2D.Double(160, 355, 80, 80);
            g2.draw(ew3);
            g2.fill(ew3);
            g2.setColor(Color.black);
            Ellipse2D eb1 = new Ellipse2D.Double(160, 145, 80, 80);
            g2.draw(eb1);
            g2.fill(eb1);
            Ellipse2D eb2 = new Ellipse2D.Double(160, 255, 80, 80);
            g2.draw(eb2);
            g2.fill(eb2);
            Ellipse2D eb3 = new Ellipse2D.Double(160, 365, 80, 80);
            g2.draw(eb3);
            g2.fill(eb3);
            g2.setColor(Color.red);
            Ellipse2D er = new Ellipse2D.Double(165, 150, 70, 70);
            g2.draw(er);
            g2.fill(er);
            g2.setColor(Color.yellow);
            Ellipse2D ey = new Ellipse2D.Double(165, 260, 70, 70);
            g2.draw(ey);
            g2.fill(ey);
            g2.setColor(Color.green);
            Ellipse2D eg = new Ellipse2D.Double(165, 370, 70, 70);
            g2.draw(eg);
            g2.fill(eg);
            g2.setColor(Color.black);
            Arc2D arc = new Arc2D.Double(157.5, 97.5, 85, 45, 0, 180, 1);
            g2.draw(arc);
            g2.fill(arc);
            g2.fillRoundRect(95,143, 50, 10, 10, 10);
            g2.fillRoundRect(135,145, 10, 55, 10, 10);
            int[] p11 = {140,136,95};
            int[] p12 = {145,199,149};
            g2.fillPolygon(p11,p12,3);
            g2.fillRoundRect(95,253, 50, 10, 10, 10);
            g2.fillRoundRect(135,255, 10, 55, 10, 10);
            int[] p21 = {140,136,95};
            int[] p22 = {255,309,259};
            g2.fillPolygon(p21,p22,3);
            g2.fillRoundRect(95,363, 50, 10, 10, 10);
            g2.fillRoundRect(135,365, 10, 55, 10, 10);
            int[] p31 = {140,136,95};
            int[] p32 = {365,419,369};
            g2.fillPolygon(p31,p32,3);
            g2.fillRoundRect(255,143, 50, 10, 10, 10);
            g2.fillRoundRect(255,145, 10, 55, 10, 10);
            int[] p41 = {260,264,305};
            int[] p42 = {145,199,149};
            g2.fillPolygon(p41,p42,3);
            g2.fillPolygon(p31,p32,3);
            g2.fillRoundRect(255,253, 50, 10, 10, 10);
            g2.fillRoundRect(255,255, 10, 55, 10, 10);
            int[] p51 = {260,264,305};
            int[] p52 = {255,309,259};
            g2.fillPolygon(p51,p52,3);
            g2.fillRoundRect(255,363, 50, 10, 10, 10);
            g2.fillRoundRect(255,365, 10, 55, 10, 10);
            int[] p61 = {260,264,305};
            int[] p62 = {365,419,369};
            g2.fillPolygon(p61,p62,3);
            g2.fillRoundRect(180, 455, 40, 50, 10, 10);
        }
    }

    static JFrame getFrame() throws Exception{
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 300, 400, 600);
        jFrame.setTitle("СВЕТОФОР");
        try {
            URL url = new URL("https://detskiy-sad.com/wp-content/uploads/2017/08/svetofor-dla-dou7.png");
            Image image = new ImageIcon(url).getImage();
            jFrame.setIconImage(image);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        jFrame.setVisible(true);
        return jFrame;
    }
}
