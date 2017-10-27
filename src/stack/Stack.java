/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.ArrayList;

/**
 *
 * @author bvance
 */
public class Stack {
    static ArrayList<Integer> stack = new ArrayList<Integer>();     
    static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
            
        
    }
    
    static void Push(int pushedValue){
        stack.add(0, pushedValue);
        i++;

    }
    
    static void Pop(){
        stack.remove(i-1);
    }
}
