            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultiThreading;
import java.io.InterruptedIOException;

/**
 *
 * @author velmurugan
 */
public class ExtendsMethodOfCreatingThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start();//1st thread
        /*
           try
            {
            Thread.sleep(10);//the order may change which means both threads are running simultaneously
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }*/
        obj1.start();//2nd thread
        System.out.println(obj.isAlive());
       /* obj.setName("Threads1");
        obj1.setName("threads2");
        System.out.println(obj.getName());
        System.out.println(obj1.getName());*/
       /* System.out.println(obj.getId());
        System.out.println(obj1.getId());*/
        obj.setPriority(1);
        obj1.setPriority(10);
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        obj.join(1000);//1000 millisec = 1 sec//will die for 1 sec and die
        obj1.join();
        System.out.println(obj.isAlive());
        System.out.println("Finished");
    }
    
}
class thread1 extends Thread
{
    public void run()//only run method should be given else will not run =>start will search for ONLY run 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            //sleep() method
            try
            {
            Thread.sleep(500);//the order may change which means both threads are running simultaneously
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
//Here thread2 have to wait for thread2,so by using thread concept we can make both threads to run simultaneously

class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
        }
    }
}