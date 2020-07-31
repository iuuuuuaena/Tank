package xyz.jxdgogogo.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

/**
 * @Author jxd
 * @Date 2020-07-22  19:46
 * @Version 1.0
 * @Write For MyFrame
 * @Email waniiu@126.com
 */
public class MyFrame extends Frame {
    // 坦克
    public Tank tank;
    public MyFrame() {
        // 显示一个窗口

        tank = new Tank(200,200,Dir.DOWN);

        // 可设置大小
        setResizable(true);
        // 设置窗口大小
        setSize(500, 400);
        // 设置窗口标题
        setTitle("坦克大战");
        // 设置可见
        setVisible(true);

        // 添加窗口关闭事件，监听器
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // 系统退出
                System.exit(0);
            }
        });


        //添加兼听事件，兼听我们自己重写的键盘事件
        this.addKeyListener(new MyKeyListener());
    }

    /**
     * 重写父类的print方法，会给我一个画笔
     * // 窗口需要重新绘制的时候，自动调用这个方法
     *
     * @param g 画笔
     */
    @Override
    public void paint(Graphics g) {
        // 把画笔交给坦克
        tank.paint(g);
    }


    // 键盘事件内部类
    class MyKeyListener extends KeyAdapter {
        // 四个方向，让坦克根据四个方向，走
        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        //键被按下的时候，回调
        @Override
        public void keyPressed(KeyEvent e) {

            // 取出key的具体事件
            int key = e.getKeyCode();

            switch (key) {
                // 左
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            setTankLocation();
        }


        // 键弹起的时候，回调
        @Override
        public void keyReleased(KeyEvent e) {


            // 取出key的具体事件
            int key = e.getKeyCode();
            // 弹起的时候，设置为false;
            switch (key) {
                // 左
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }

            setTankLocation();

        }

        //判断方向
        public void setTankLocation() {
            // 开始移动

            if(!bL && !bR && !bU && !bD) {
                return ;
            }else {
                tank.setMoving(true);
                if (bL) tank.setDir(Dir.LEFT);
                if (bR) tank.setDir(Dir.RIGHT);
                if (bU) tank.setDir(Dir.UP);
                if (bD) tank.setDir(Dir.DOWN);
            }
        }

    }


}


