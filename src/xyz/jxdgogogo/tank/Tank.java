package xyz.jxdgogogo.tank;

import java.awt.*;

/**
 * @Author jxd
 * @Date 2020-07-31  09:04
 * @Version 1.0
 * @Write For Tank
 * @Email waniiu@126.com
 */
public class Tank {

    //    位置
    private int x, y;
    //坦克大小
    private final static int WIDTH = 50,HEIGHT = 50;
    //    方向
    private Dir dir;
    //    速度
    private final static int SPEED = 5;
    //  移动状态
    private boolean moving = false;

    // 持有窗口对象的引用
    MyFrame my = null;


    //    坦克自己的绘制方法
    public void paint(Graphics g) {
        // g就是画笔 ，想画什么就画什么
        Color color = g.getColor();
        g.setColor(Color.YELLOW);
        /*绘制矩形*/
        g.fillRect(x,y, WIDTH, HEIGHT);
        g.setColor(color);
        //移动
        move();
    }


    /**
     * 移动方法
     */
    public void move(){
        if(!moving) return ;

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

    /**
     * 发射子弹
     */
    public void fire(){
       // 设置窗口的bullet子弹对象
       // 从list里面把所有的子弹拿出来
       my.bulletList.add(new Bullet(this.x+ 15,this.y + 15,this.dir,this.my));

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Tank(int x, int y, Dir dir,MyFrame my) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.my = my;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

}
