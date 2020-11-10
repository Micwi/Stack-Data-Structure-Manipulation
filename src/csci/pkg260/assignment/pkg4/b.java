/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg4;

import java.util.*;

/**
 *
 * @author louiejr.
 */
public class b extends CSCI260Assignment4 {

    public void peek() {
        Stack st = new Stack();

        st.push("Ford");
        st.push("Chevy");
        st.push("Honda");

        //Checking the top object
        System.out.println("Top object is: " + st.peek());
        System.out.println("Elements after peek: " + st);
    }

}
