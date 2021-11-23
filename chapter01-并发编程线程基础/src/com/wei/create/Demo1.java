package com.wei.create;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author www
 * @date 2021/11/23 22:48
 * @description: 实现Runnable接口来创建线程
 */
public class Demo1 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am child thread");
        // 获取线程名
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable task = new Demo1();
        new Thread(task).start();
        new Thread(task).start();
    }
}
