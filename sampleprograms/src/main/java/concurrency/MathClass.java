package concurrency;

public class MathClass
{

    // synchronised block
    void printNumbers(int n) throws InterruptedException
    {
        synchronized (this){
            for (int i = 1; i <= n; i++)
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
            }
        }
    }

    // synchronised method
   /* synchronized void printNumbers(int n) throws InterruptedException
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println(Thread.currentThread().getName() + " :: "+  i);
            Thread.sleep(500);
        }
    }*/



}
