/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GenericPrograming;

/**
 *
 * @author velmurugan
 */
public class TwoParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test<Integer,Character> obj=new test<>(100,'j');
        System.out.println(obj.getvalue());
        System.out.println(obj.getvalue1());
          obj.display();
    }
    
}
class test<T,V>
{
    T value;
            V value1;
           public test(T value,V value1)
           {
               this.value=value;
               this.value1=value1;
           }
           public T getvalue()
           {
               return value;
           }
           public V getvalue1()
           {
               return value1;
           }
           public void display()
           {
               System.out.println(value.getClass().getName());
                System.out.println(value1.getClass().getName());
           }
}