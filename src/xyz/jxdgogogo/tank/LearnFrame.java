package xyz.jxdgogogo.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @Author jxd
 * @Date 2020-07-22  19:35
 * @Version 1.0
 * @Write For LearnFrame
 * @Email waniiu@126.com
 */
public class LearnFrame {

    public static void main(String[] args) {

        // 显示一个窗口
        Frame frame = new Frame();
        // 设置可见
        frame.setVisible(true);
        // 可设置大小
        frame.setResizable(true);
        // 设置窗口大小
        frame.setSize(500,400);
        // 设置窗口标题
        frame.setTitle("坦克大战");
        // 添加窗口关闭事件，监听器
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // 系统退出
                System.exit(0);
            }
        });



    }

}
