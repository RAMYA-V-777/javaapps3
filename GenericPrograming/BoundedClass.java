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
public class BoundedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {///Perform Sum And Average
        // TODO code application logic here
        Integer num[]={2,3,4,5,6};
        test3<Integer> obj=new test3<>(num);
        obj.sum();
        Float fnum[]={2.5f,6.7f,9.0f};
         test3<Float> obj1=new test3<>(fnum);
        obj1.sum();
        Double dnum[]={2.8,8.0,8.7};
         test3<Double> obj2=new test3<>(dnum);
        obj2.sum();
        Character c[]={'o','o','o','p'};
        /* test3<Character> obj3=new test3<>(c);
        obj3.sum();*///it wont accept the character
    }
    
}
class test3<T extends Number>
{
    T[] value;
double sum=0;
    public test3(T[] value) {
        this.value = value;
    }
    public void sum()
    {
        for(int i=0;i<value.length;i++)
        {
            sum += value[i].doubleValue();//it wont accept since i is varying according to the type
        }
        System.out.println(sum/value.length);
    }
}