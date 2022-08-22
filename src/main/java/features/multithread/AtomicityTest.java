/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 10:22
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class AtomicityTest {

    private int count = 0;

    public synchronized void inc() throws InterruptedException {
        count++;
        //Thread.sleep(100);
    }

    public static void main(String[] args) throws InterruptedException {

        getAtomicityTest();
        getAtomicityTest1();

           /* new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 100000; j++){
                            c.inc();
                        }
                        System.out.println("当前线程执行完毕");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 100000; j++){
                            c.inc();
                        }
                        System.out.println("当前线程执行完毕");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 100000; j++){
                            c.inc();
                        }
                        System.out.println("当前线程执行完毕");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 100000; j++){
                            c.inc();
                        }
                        System.out.println("当前线程执行完毕");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();*/


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //这里每次运行的值都有可能不同,可能为1000
//            System.out.println("运行结果:Counter.count=" + c.count);
    }


    private static void getAtomicityTest() {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        final AtomicityTest c = new AtomicityTest();

        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Long start = System.nanoTime();
                    for (int j = 0; j < 10000; j++) {
                        try {
                            c.inc();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("本次耗时：" + (System.nanoTime() - start));
                }
            }).start();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Long start = System.nanoTime();
                for (int j = 0; j < 10000; j++) {
                    c.count++;
                }
                System.out.println("本次耗时：" + (System.nanoTime() - start));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Long start = System.nanoTime();
                for (int j = 0; j < 10000; j++) {
                    c.count++;
                }
                System.out.println("本次耗时：" + (System.nanoTime() - start));
            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + c.count);
    }

    private static void getAtomicityTest1() {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        final AtomicityTest c = new AtomicityTest();


        new Thread(new Runnable() {
            @Override
            public void run() {
                Long start = System.nanoTime();
                for (int j = 0; j < 10000; j++) {
                    c.count++;
                }
                System.out.println("本次耗时：" + (System.nanoTime() - start));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Long start = System.nanoTime();
                for (int j = 0; j < 10000; j++) {
                    c.count++;
                }
                System.out.println("本次耗时：" + (System.nanoTime() - start));
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + c.count);
    }

    public static void getAtomicityTest2() {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        final AtomicityTest c = new AtomicityTest();

        c.runTread();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + c.count);
    }


    public void runTread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 100000; j++) {
                    count++;
                }

            }
        }).start();
    }

}
