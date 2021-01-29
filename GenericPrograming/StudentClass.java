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
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s=new student("raji",100);//putiiing student class in the obj s
        OneParameter<student> obj4=new OneParameter<>(s);//pass constructor
        System.out.println(obj4.getObject());
        obj4.show();
    }
    
}
class student
{
   String name;
   int rollno;
   public student(String name,int rollno)
   {
       this.name=name;
       
   }
}