package net.thisisdave.ch1;

import com.sun.deploy.ui.ProgressDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 11-4-2016.
 */
public class AnonymousInnerExample {

    public void init(){
        JButton button = new JButton();
        JButton button2 = new JButton();
        JLabel label = new JLabel();

//        Anonymous class implements Interface
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Derp");
            }
        });

//        Anonymous class extends provided class
        button2.addActionListener(new AIESomething(button2){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("NoWay");
            }
        });

    }

    public static void main(String[] args) {
        AnonymousInnerExample a = new AnonymousInnerExample();
        a.init();
    }

}

class AIESomething implements ActionListener{

    JButton button;

    AIESomething(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Herp");
    }
}