package code;

/**
 * 内存可见性（memory visibility）是指当某个线程正在使用对象状态而另一个线程在
 * 同时修改该状态，需要确保当一个线程修改了对象状态之后，其他线程能够看到发生的状态变化
 *
 * 可见性错误是指当操作与读写操作在不同的线程中执行时，我们无法确保执行读操作的线程能适时的
 * 看到其他线程的写的值，有时甚至时根本不可能的事情。
 *
 * 我们可以通过同步来保证对象被安全的发布。除此之外我们也可以使用更加轻量级的volatile变量
 *
 *
 * volatile 关键字： 当多个线程进行操作共享数据时，可以保证内存中的数据可见性
 *                   相较于synchronized是一种轻量级的同步策略
 *
 * 注意：
 *  1.volatile 不具备“互斥性”
 *  2.volatile 不能保证变量的“原子性”
 * @author Jerry
 * @create 2019-10-22 16:52
 */
public class TestVolatile {
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        new Thread(td).start();
        while(true){
            //不使用volatile关键字 td.isFlag是false
            if(td.isFlag()){
                System.out.println("-----");
                break;
            }
        }
    }
}
class  ThreadDemo implements  Runnable{
    private volatile boolean flag=false;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=true;
        System.out.println("flag="+isFlag());
    }
    public boolean isFlag(){
       return flag;
    }

}
