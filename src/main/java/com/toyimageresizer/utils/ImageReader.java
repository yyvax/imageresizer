package com.toyimageresizer.utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import marvin.gui.*;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 * @author yyvax
 */
public class ImageReader extends JFrame implements ActionListener {
    private JPanel		panelBottom;
    private MarvinImagePanel imagePanel;
    private MarvinImage image, backupImage;

    private JButton             buttonGray,
            buttonEdgeDetector,
            buttonInvert,
            buttonReset;

    public ImageReader()
    {
        super("First Application");

        // Create Graphical Interface
        buttonGray = new JButton("Open");
        buttonGray.addActionListener(this);
        buttonEdgeDetector = new JButton("EdgeDetector");
        buttonEdgeDetector.addActionListener(this);
        buttonInvert = new JButton("Invert");
        buttonInvert.addActionListener(this);
        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(this);

        panelBottom = new JPanel();
        panelBottom.add(buttonGray);
        panelBottom.add(buttonEdgeDetector);
        panelBottom.add(buttonInvert);
        panelBottom.add(buttonReset);


        imagePanel = new MarvinImagePanel();

        Container lc = getContentPane();
        lc.setLayout(new BorderLayout());
        lc.add(panelBottom, BorderLayout.SOUTH);
        lc.add(imagePanel, BorderLayout.NORTH);

        image = MarvinImageIO.loadImage("1.png");
        imagePanel.setImage(image);

        setSize(340,430);
        setVisible(true);
    }

    public static void main(String args[]){
        ImageReader t = new ImageReader();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonGray){
        }
        else if(e.getSource() == buttonEdgeDetector){
        }
        else if(e.getSource() == buttonInvert){
        }
    }
}
