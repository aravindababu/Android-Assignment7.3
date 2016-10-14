/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aravind.Babu
 */
public class SubString {

    /**
     * @param args the command line arguments
     */
    //main method is throwing exception because the user can enter a different value other than a string
    //which might terminate the programme so i am using throws exception here
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        //BufferedReader is a class in java which reads text from character input stream
        //Creating a new object of buffered reader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                //User has to enter First string here
		System.out.println("Enter you string:");
		String s1=br.readLine();//First string goes here
                //User has to enter First string here
		System.out.println("Enter the substring");
		String s2=br.readLine();//Second String goes here 
                System.out.println("Entered String is a SubString of : " +s1);
                
                //Defining two integers i,j for the length of string and substring
		int i=0;int j=0;
                //creating char array which converts the strings deined above to new character arrays
                //i am converting both the strings deined above to character arrays
		char[] string=s1.toCharArray();
		char[] subString=s2.toCharArray();
               
		int count=0;
                //while i is less than length of the string
		while(i<string.length)
		{
                    //if string is equal to substring
			if(string[i]==subString[j])
			{
				j++;//incrementing j
			}
			else
			{
                            //if string is not equal to substring
				j=0;
			}
                        //if j is equal to the length of the substring
			if(j==subString.length)
			{
				j=0;
				count++;
			}
			i++;
			
		}
	}
    }
       
    
        
    
 
	
    


