/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block_chain;

import java.util.Arrays;

/**
 *
 * @author Donfack
 */
public class Block_Chain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Transaction transaction1 = new Transaction("Peter", "Sam", 10000L);
        Transaction transaction2 = new Transaction("Sam", "Ryan", 1000L);
        Transaction transaction3 = new Transaction("Sam", "Ryan", 1000L);
        Transaction transaction4 = new Transaction("Ryan", "Peter", 150L);        

        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println("Premier hashCode: " + firstBlock.hashCode() + "  " + transaction1.getSourceName());
  
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
        System.out.println("Deuxieme HashCode : " + secondBlock.hashCode());
        
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println("Dernier HashCode  : " + thirdBlock.hashCode());
    }
    
}
