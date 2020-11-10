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
public class a extends CSCI260Assignment4 {

    public void stackDemo() {

        Scanner keyboard = new Scanner(System.in);
        Stack CSCI260st = new Stack();
        CSCI260st.push("alabama");

        CSCI260st.push("vermont");
        CSCI260st.push("utah");
        CSCI260st.push("arkansas");

        System.out.println(CSCI260st);

        System.out.println("Elements after remove: " + CSCI260st);
        System.out.println("Enter 4 places: ");
        for (int i = 0; i < 4; i++) {
            CSCI260st.pop();
        }
        for (int x = 0; x < 4; x++) {
            CSCI260st.push(keyboard.nextLine());
        }
        System.out.println(CSCI260st);
    }
}
