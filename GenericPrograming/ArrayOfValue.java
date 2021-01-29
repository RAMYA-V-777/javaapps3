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
public class ArrayOfValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={1,2,3,4,5,6,7,8,9};
        test2<Integer> obj=new test2<>(num);//if 1 val will be a errror so array name pass=num
        obj.display();
        Character c[]={'i','j','k'};
           test2<Character> obj1=new test2<>(c);
        obj1.display();
          String s[]={"pointer","ferrow"};
           test2<String> obj2=new test2<>(s);
        obj2.display();
    }
    
}
class test2<T>
{
    T[] value;//Array Of Values

    public test2(T[] value) {
        this.value = value;
    }

   public void display()
   {
       for(int i=0;i<value.length;i++)
       {
           System.out.println(value[i]);
       }
   }
    
}