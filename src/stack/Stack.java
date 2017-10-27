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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Push(1);
        Push(2);
        Push(3);
        Pop();
        Pop();
        Pop();
        Pop();
    }
    
    static void Push(int pushedValue){
        stack.add(stack.size(), pushedValue);
    }
    
    static void Pop(){
        if(!stack.isEmpty())
        {
            System.out.println(stack.get(stack.size()-1) + " was removed.");            
            stack.remove(stack.size()-1);   

        }
        

    }
}
