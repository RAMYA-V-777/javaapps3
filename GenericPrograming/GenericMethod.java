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
class MyNumber implements Runnable 
{ 
  public void run() 
   { 
     try 
       { 
        for(int i=1;i<=10;i++) 
        { 
          Thread.sleep(50);          
          System.out.println(i); 
        } 
        } 
       catch(InterruptedException e) 
           { 
             System.out.println("Exception..."+e); 
           } 
    } 
} 
 
class Number 
{ 
  public static void main(String [] args) 
   { 
     MyNumber m1 = new MyNumber(); 
     Thread thread = new Thread(m1); 
     thread.start(); 
   } 
  You need to add a listener to the Button

          protected void onCreate(Bundle qqq) {
         super.onCreate(qqq);
         setContentView(R.layout.my_layout_id);

         final Button button = (Button) findViewById(R.id.my_cool_button);
         button.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 // your handler code here
             }
         });
     }
