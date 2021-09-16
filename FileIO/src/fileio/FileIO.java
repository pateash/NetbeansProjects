/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

/**
 *
 * @author ashish_patel
 */
import java.io.*;
import java.util.Scanner;
public class FileIO {
    public static void main(String[] args)  {
        System.out.println("Going to read the values from file");
          String[]var=null;
        try{     
          BufferedReader br=new BufferedReader(new FileReader("data.txt"));
        var= br.readLine().split(","); 
        br.close();
        }catch(FileNotFoundException e){
            System.out.println("Failed on open file for writin because it is not Found!");
        }catch(IOException e){
            System.out.println("Error while reading file");
        }
        
        PrintWriter pr=null;
       
        
          int a=Integer.parseInt(var[0]);
          int b=Integer.parseInt(var[1]);
          int c=Integer.parseInt(var[2]);
          double r1,r2;
          r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
          r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
         System.out.println("The roots are "+r1+"  and "+r2);
          try{
          pr=new PrintWriter(new FileWriter("data.txt",true));
          pr.println(); 
          pr.println("the roots are "+r1+" and "+r2);
          
          pr.flush();
          pr.close();
        }catch(FileNotFoundException e){
            System.out.println("File can't be found");
            System.out.println("Can't write data on File.");
        }
        catch(IOException e){
            System.out.println("Error while Writing");
        }
        System.out.println("\nGoing to read data");
            if(pr!=null)
            {
                pr.close();
            }
        
        
    }
}
          

