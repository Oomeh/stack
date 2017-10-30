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
public class myTestStack {
    static ArrayList<Integer> stack = new ArrayList<Integer>();     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myStack stack1 = new myStack();
        stack1.Push(1);
        stack1.Push(2);
        stack1.Push(3);
        System.out.println(stack1.Pop() + " was removed");
        System.out.println(stack1.Pop() + " was removed");
        System.out.println(stack1.Pop() + " was removed");
        System.out.println(stack1.Pop() + " was removed");

    }
    
    

}
