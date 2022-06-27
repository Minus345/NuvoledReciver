package com.nuvoled;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage {

    public static int width = 200;
    public static int height = 200;

    public static void main(String avg[]) throws IOException {
        DisplayImage abc = new DisplayImage();
    }

    public DisplayImage() throws IOException {
        //BufferedImage image= ImageIO.read(new File("C:\\Users\\max\\Documents\\a.png"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        image.setRGB();
        ImageIcon icon = new ImageIcon(image);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(width, height);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
