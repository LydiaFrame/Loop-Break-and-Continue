/*
 * Program: CompareStrings.java
 * Student: Lydia Frame 
 * Purpose: Using any type of loop, create a program that prints numbers from 1 to 10 and set a break at 7.
 *  and create a similar loop that counts from 1 to 10 and set a continue at 7.
*/

package loopbreak; 
import java.util.Scanner; 

public class LoopBreak {
    public static void main(String[] args){

        // For loop with break
        for(int i = 1; i <= 10; i++){
            if(i==7){
                break;
            }

            System.out.println(i);
        }

        System.out.println("Line Break");
        System.out.println("Line Continue");

        //For loop continued 
        for(int i = 1; i <= 10; i++){
            if(i < 7){
                continue;
            }
            System.out.println(i);
        }
    }
}

