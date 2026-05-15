import java.util.*;
import java.io.*;

public class Redact{
   public static void main(String[] args){

      try(Scanner input = new Scanner(System.in)){

         System.out.println("Enter the name of the text file:");
         String filename = input.nextLine();

         try(BufferedReader file = new BufferedReader(new FileReader(filename))){
            String line = file.readLine();
            System.out.println("REDACTED CONTENTS:");
            while (line != null){
               String result = solution(line);
               System.out.println(result);

               line = file.readLine();
            }
         }
         catch(IOException e){
            System.out.println("File not found!!");
         }
      }
   }

   public static String solution(String line){

      StringBuilder result = new StringBuilder();

      for (int i = 0; i < line.length() - 1; i++){
         char c = line.charAt(i);
         char c2 = line.charAt(i+1);

         if (Character.isDigit(c) && Character.isDigit(c2)){
            result.append("#");
         }
         else if (Character.isDigit(c) && !Character.isDigit(c2)){
            result.append(c);
         }
         else{
            result.append(c);
         }
      }
      result.append(line.charAt(line.length()-1));

      return result.toString();
   }
}