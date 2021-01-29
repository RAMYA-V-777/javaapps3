/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultiThreading;

/**
 *
 * @author velmurugan
 */
public class RunnableInterfaceCreatingThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test1 obj=new test1();
        Thread t1 =new Thread(obj);//Creating obj for thread class
        t1.start();//start->go to run->access run->Execute the statement in run
        System.out.println(Thread.currentThread().getName());//Name of the thread(Thread class)
    }
    
}
class test1 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
    System.out.println("Hi");
}
}
}