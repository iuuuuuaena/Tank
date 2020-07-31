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
    private final static int WIDTH = 20, HEIGHT = 20;

    private int x, y;

    private Dir dir;

    private MyFrame my = null;

    //子弹的状态
    private boolean isLive = true;

    public Bullet(int x, int y, Dir dir,MyFrame my) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.my = my;
    }

    public void paint(Graphics g) {

        //如果子弹死了
        if (!isLive){
            my.bulletList.remove(this);
        }

        //颜色
        Color color = g.getColor();
        g.setColor(Color.RED);
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
        if (x <= 0 || y <= 0 || x > MyFrame.SCREEN_WIDTH || y > MyFrame.SCREEN_HEIGHT) isLive = false;
    }


}
