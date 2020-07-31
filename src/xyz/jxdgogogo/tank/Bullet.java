package xyz.jxdgogogo.tank;

import java.awt.*;

/**
 * @Author jxd
 * @Date 2020-07-31  09:21
 * @Version 1.0
 * @Write For Bullet
 * @Email waniiu@126.com
 */
public class Bullet {

    private final static int SPEED = 10;
    private final static int WIDTH = 5, HEIGHT = 5;

    private int x, y;

    private Dir dir;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {

        //颜色
        Color color = g.getColor();
        g.setColor(Color.BLUE);
        // 绘制圆
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(color);
        move();


    }


    public void move() {
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }
    }


}
