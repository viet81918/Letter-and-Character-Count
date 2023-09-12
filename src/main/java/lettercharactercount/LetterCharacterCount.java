/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lettercharactercount;

/**
 *
 * @author viet
 */
import java.io.*;
import java.util.*;

class LetterCharacterCount {
    public static Scanner sc = new Scanner(System.in);
    public static void main( String args[] ) {
        //given string
        String str = sc.nextLine();
        //declare hashmap
        HashMap<Character, Integer> characterResult = characterCount(str.toLowerCase());
        //convert string to character array
        HashMap<String, Integer> letterResult = letterCount(str.toLowerCase());
        //traverse the map and print the number of occurences of a character
        for(Map.Entry entry : characterResult.entrySet()){
          System.out.println( "Character " + entry.getKey() + " = " + entry.getValue());
        }
        for(Map.Entry entry : letterResult.entrySet()){
          System.out.println( "Letter " + entry.getKey() + " = " + entry.getValue());
        }
        
    
    }
    public static HashMap<Character, Integer > characterCount(String str ){
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        //traverse every character and count the Occurrences
        for(char c:arr){
          //filter out white spaces
          if(c != ' ' && Character.isLetter(c)) {
            if(count.containsKey(c)){
              //if character already traversed, increment it
              count.put(c, count.get(c) + 1);
            }else{
              //if character not traversed, add it to hashmap
              count.put(c,1);
            }
          }
          
        }
        return count;
    }
    public static HashMap<String, Integer > letterCount(String raw) {
        HashMap<String, Integer> count = new HashMap<>();
        Scanner scanner = new Scanner(raw);
        while (scanner.hasNext()) {
            String s = scanner.next();
            if(count.containsKey(s)){
              //if character already traversed, increment it
              count.put(s, count.get(s)+ 1);
            }else{
              //if character not traversed, add it to hashmap
              count.put(s,1);
            }
            
        }return count;
    }
    }
