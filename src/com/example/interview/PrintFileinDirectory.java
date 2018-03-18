package com.example.interview;
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
        String maindirpath = "C:\\MyDrive\\MyDrive2\\Docker\\LearnDocker";
                 
        File maindir = new File(maindirpath);
          
        if(maindir.exists() && maindir.isDirectory())
        {
            File[] arr = maindir.listFiles();

            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("**********************************************");
             
            RecursivePrint(arr, 0); 
       } 
    }
}