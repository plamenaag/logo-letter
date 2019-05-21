package com.logo.letter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Input logo letters: ");
        String[] letters = sc.nextLine().trim().split("");
        Integer letterSize;
        do{
            System.out.print("Input letter size: ");
            letterSize = sc.nextInt();
            if(letterSizeIsInvalid(letterSize)){
                System.out.println("Wrong input for letter size!!!");
                System.out.println("Letter size must be > 2 and < 10 000 and an odd number!!!");
            }
        } while(letterSizeIsInvalid(letterSize));
        
        sc.close();
        
        List<LogoLetter> logoLetters = new ArrayList<>();
        for(String letter : letters){
            switch(letter.toUpperCase()){
                case "M": logoLetters.add(new LogoLetterM(letterSize));break;
                case "P": logoLetters.add(new LogoLetterP(letterSize));break;
                default: {
                    System.out.println("Letter '" + letter + "' is not supported yet!!!");
                    return;
                }
            }
        }
   
        LogoPrinter.printLogo(logoLetters);
        
    }
    
    public static Boolean letterSizeIsInvalid(Integer letterSize){
        return letterSize % 2 == 0 || letterSize < 2 || letterSize > 100000;
    }
 
}
