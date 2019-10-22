package code;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 一、i++的原子性问题： i++的操作实际上分为3个步骤 “读 - 改 - 写”
 * int i=10;
 * //10
 * i=i++;
 * <p>
 * int temp=i;
 * i=i+1;
 * i=temp;
 *
 * 二、原子变量： 在java.util.concurrent.atomic包下提供了一些原子变量
 *             1.volatile只保证内存可见性，不保证原子性
 *             2.CAS(Compare-And-Swap) 算法保证数据变量的原子性
 *                   CAS算法是硬件对于并发操作的支持
 *                   CAS包含了三个操作数：
 *                    ① 内存值  V
 *                    ② 预估值  A
 *                    ③ 更新值  B
 *                    当且仅当 V==A时 V=B 否则，不会执行任何操作
 * @author Jerry
 * @create 2019-10-22 17:33
 */
public class TestAtomic {
    public static void main(String[] args) {
        AtomicDemo ad = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(ad).start();
        }

    }
}

class AtomicDemo implements Runnable {
    //private volatile int serialNumber = 0;

    private AtomicInteger serialNumber=new AtomicInteger();
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + getSerialNumber());
    }

    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }
}
