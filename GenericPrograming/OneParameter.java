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
public class OneParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //For int
        sample1<Integer> obj=new sample1<>(100);//get some value so 100
        System.out.println(obj.getObject());
        obj.show();
        //For double
        sample1<Double> obj1=new sample1<>(100.00);//get some value so 100
        System.out.println(obj1.getObject());
        obj1.show();
        //For character
        sample1<Character> obj2=new sample1<>('r');//get some value so 100
        System.out.println(obj2.getObject());
        obj2.show();
        //For string
        sample1<String> obj3=new sample1<>("oops");//get some value so 100
        System.out.println(obj3.getObject());
        obj3.show();
    }
    
}
class sample1<T>
{
    T value;//int a
    //constructor
    sample1(T value)//sample(int a)
    {
        this.value=value;
    }
    T getObject()//int getObject()
    {
        return value;
    }
    //In which lass a particular datatype is present and its name
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
}
//student