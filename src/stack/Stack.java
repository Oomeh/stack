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
    
        Pop();
        Push(1);
        Push(2);
        Pop();
        Push(3);
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
    }
    
    static void Push(int pushedValue){
        stack.add(stack.size(), pushedValue);
    }
    
    static void Pop(){
        if(!stack.isEmpty())
        {
            stack.remove(stack.size()-1);            
        }
        

    }
}
