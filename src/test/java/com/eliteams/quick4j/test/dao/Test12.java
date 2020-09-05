package com.eliteams.quick4j.test.dao;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Test12 {

    public static void main(String[] args)
            throws AWTException
    {
        Robot r=new Robot();//创建自动化工具对象
        r.keyPress(KeyEvent.VK_F4);//按下左Contrl  keycode为17

    }
}
