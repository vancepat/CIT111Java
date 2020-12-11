/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Pat
 */
public class ProgrammingBooks {
    public static void main(String[] args){
        String[] books = new String[5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript";
        books[4] = "Java in a nutshell";
        
        String retrievedBook = books[2];
        
        System.out.println("***Listing books***");
        for(int i=0; i<5; i++){
            System.out.println(books[i]);
        }
        System.out.println("Retrieving stored book*******");
        System.out.println(retrievedBook);
    }
    
    
}
