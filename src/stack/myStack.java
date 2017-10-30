/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import static stack.myTestStack.stack;

/**
 *
 * @author bvance
 */
public class myStack {
            void Push(int pushedValue){
            stack.add(pushedValue);
        }
        
        Integer Pop(){
                

            if(!stack.isEmpty())
            {

                int value = stack.get(stack.size()-1);
                stack.remove(stack.size()-1);   
                return value;

            }
            else
            {
                return null;
            }
        }        
        

}
