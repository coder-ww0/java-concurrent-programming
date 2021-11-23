package com.wei.create;

/**
 * @author www
 * @date 2021/11/23 22:51
 * @description: TODO
 */
public class Demo2 extends Thread {
    @Override
    public void run() {
        System.out.println("I am child thread");
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        // 创建线程
        Thread thread = new Demo2();
        // 启动线程
        thread.start();
    }
}
