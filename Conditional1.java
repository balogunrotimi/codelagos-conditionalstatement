/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional1;
import java.util.Scanner;
/**
 *
 * @author ONIKAN YOUTHCENTRE8
 */
public class Conditional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("tell me your name");
        String name = input.nextLine();
        String x = "ROTIMI";
        
        switch (name) {
        case "olu": 
            System.out.println("olu + name");
          break;
        case "tope":
            System.out.println("tope + name");
          break;
        case "Rahim":
            System.out.println("Rahim + name");
          break;
        default:
            System.out.println("nothing + name");
          break;  
    } 
    }
    
}
