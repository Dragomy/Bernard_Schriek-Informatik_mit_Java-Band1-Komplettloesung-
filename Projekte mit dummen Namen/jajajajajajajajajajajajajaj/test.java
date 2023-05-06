


public class PenisAnimation extends JFrame {

int x = 0;

public PenisAnimation() {

super("Penis Animation");

setSize(200, 200);

setVisible(true);

}

public void paint(Graphics g) {

super.paint(g);

g.fillOval(x, 50, 40, 40);

x += 5;

try {

Thread.sleep(100);

} catch (InterruptedException e) {

e.printStackTrace();

}

repaint();

}

public static void main(String[] args) {

new PenisAnimation();

}

}