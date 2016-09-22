package cs2classprojects;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NestedPanels {

    public static void main(String[] args) {
        JFrame bilal = new JFrame();
        
        bilal.setDefaultCloseOperation(bilal.EXIT_ON_CLOSE);
        
        JPanel faruk = new JPanel();
        faruk.setBackground(Color.cyan);
        faruk.setPreferredSize(new Dimension(150, 100));
        
        JPanel onal = new JPanel();
        onal.setBackground(Color.orange);
        onal.setPreferredSize(new Dimension(150, 100));
        
        JPanel lazura = new JPanel();
        lazura.setPreferredSize(new Dimension(300, 100));
        lazura.setBackground(Color.yellow);
        
        JLabel label1 = new JLabel("Hello world");
        JLabel label2 = new JLabel("How u doin?");
        JLabel label3 = new JLabel("Woaaaa");
        faruk.add(label1);
        onal.add(label2);
        lazura.add(label3);
        
        JPanel primary = new JPanel();
        primary.setBackground(Color.black);
        primary.setPreferredSize(new Dimension(315, 215));
        primary.add(faruk);
        primary.add(onal);
        primary.add(lazura);
        
        bilal.getContentPane().add(primary);
        bilal.pack();
        bilal.setVisible(true);
        
    }
    
}
