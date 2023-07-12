/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchstatementexample;
import java.util.Scanner;
/**
 *
 * @author Mpho Kola 
 */
public class SwitchStatementExample {

    public static void main(String[] args) {
        
        //declaring variable
        int year;
        
        //declaring and intialising scanner
        Scanner input = new Scanner(System.in);
        
        //getting year input from user 
        System.out.println("Enter year you were admitted: ");
        year = input.nextInt();
        
        //using switch statement to check which case to run
        switch (year){
            case(2019):
                System.out.println("You are in third year");
                // break statement to break out of switch
                break;
            case(2020):
                System.out.println("You are in second year");
                break;
            case(2021):
            System.out.println("You are in first year");
                break; 
                
                //default case
            default:
                System.out.println("You have entered an invalid year");
                    
        }
    }
}
