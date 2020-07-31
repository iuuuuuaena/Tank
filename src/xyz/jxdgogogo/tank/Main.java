package xyz.jxdgogogo.tank;

import java.lang.reflect.Proxy;

/**
 * @Author jxd
 * @Date 2020-07-22  19:54
 * @Version 1.0
 * @Write For Main
 * @Email waniiu@126.com
 */
public class Main {

    public static void main(String[] args) {

        MyFrame m = new MyFrame();

        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //每个五十毫秒重绘制一次窗口
            m.repaint();
        }

    }

}
