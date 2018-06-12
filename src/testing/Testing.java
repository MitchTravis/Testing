/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author MCV46316
 */

//imports awt package
import java.awt.Frame;

public class Testing extends Frame {
    public Testing(){
        Frame Screen = new Frame();
        Screen.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Im going to add helloworld
        System.out.println("Mitch Travis");
        new Testing();
    }

}
