package com.example.Files;
// Recursive Java program to print all files
// in a folder(and sub-folders)
 
import java.io.File;
 
public class PrintFileinDirectory 
{
     static void RecursivePrint(File[] arr, int level) 
     {
         for (File f : arr) 
         {
             for (int i = 0; i < level; i++)
                 System.out.print("\t");
             
             if(f.isFile()) 
                 System.out.println(f.getName());
              
             else if(f.isDirectory()) 
             { 
                 System.out.println("[" + f.getName() + "]");
              
                 RecursivePrint(f.listFiles(), level + 1);
             }
         }
    }
     
    public static void main(String[] args)
    {
        //String path = "C:\\MyDrive\\MyDrive2\\Docker\\LearnDocker";
        String path = "C:\\MyDrive\\MyDrive2\\vmshared";
                 
        File file = new File(path);
          
        if(file.exists() && file.isDirectory())
        {
            File[] arr = file.listFiles();

            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + file);
            System.out.println("**********************************************");
             
            RecursivePrint(arr, 0); 
       } 
    }
}