package cs2classprojects;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Scanner;

public class extra {

    public static void main(String[] args) {
        JFrame bilal = new JFrame();
        Scanner sc = new Scanner(System.in);

        bilal.setDefaultCloseOperation(bilal.EXIT_ON_CLOSE);

        JPanel faruk = new JPanel();
        faruk.setBackground(Color.cyan);
        faruk.setPreferredSize(new Dimension(150, 100));
        
        JPanel onal = new JPanel();
        onal.setBackground(Color.red);
        onal.setPreferredSize(new Dimension(150,100));
        
        JPanel prea = new JPanel();
        prea.setBackground(Color.gray);
        prea.add(faruk);
        prea.add(onal);
        
        
        
        System.out.println("Content1: ");
        String content1 = sc.nextLine();
        System.out.println("Content2: ");
        String content2 = sc.nextLine();

        JLabel label1 = new JLabel(content1);
        JLabel label2 = new JLabel(content2);

        faruk.add(label1);
        onal.add(label2);

        bilal.getContentPane().add(prea);
        bilal.pack();
        bilal.setVisible(true);

    }

}
