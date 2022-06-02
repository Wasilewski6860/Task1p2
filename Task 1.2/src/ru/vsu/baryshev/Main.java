package ru.vsu.baryshev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {





    public static void main(String[] args) {

        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        final LinesComponent comp = new LinesComponent();
        comp.setPreferredSize(new Dimension(500, 500));
        testFrame.getContentPane().add(comp, BorderLayout.CENTER);

        JPanel leftSideButtonPanel = new JPanel();

        JMenuBar menuBar = new JMenuBar();
        testFrame.setJMenuBar(menuBar);

        JMenu normalShareButtons = new JMenu("Normal Share Buttons");
        menuBar.add(normalShareButtons);
        JMenuItem shareFirstSideNormal = new JMenuItem("Share Upper Side Normal");
        JMenuItem shareSecondSideNormal = new JMenuItem("Share Right Side Normal");
        JMenuItem shareThirdSideNormal = new JMenuItem("Share Down Side Normal");
        JMenuItem shareForthSideNormal = new JMenuItem("Share Right Side Normal");
        JMenuItem shareFirstPointNormal = new JMenuItem("Share Top Left Point Normal");
        JMenuItem shareSecondPointNormal = new JMenuItem("Share Top Right Point Normal");
        JMenuItem shareThirdPointNormal = new JMenuItem("Share Bottom Right Point Normal");
        JMenuItem shareForthPointNormal = new JMenuItem("Share Bottom Left Point Normal");
        JMenuItem shareCenterNormal = new JMenuItem("Share Center Normal");
        normalShareButtons.add(shareFirstSideNormal);
        normalShareButtons.add(shareSecondSideNormal);
        normalShareButtons.add(shareThirdSideNormal);
        normalShareButtons.add(shareForthSideNormal);
        normalShareButtons.add(shareFirstPointNormal);
        normalShareButtons.add(shareSecondPointNormal);
        normalShareButtons.add(shareThirdPointNormal);
        normalShareButtons.add(shareForthPointNormal);
        normalShareButtons.add(shareCenterNormal);

        JMenu verticalShareButton = new JMenu("Vertical Share Buttons");
        menuBar.add(verticalShareButton);
        JMenuItem shareFirstSideVertical = new JMenuItem("Share Upper Side Vertical");
        JMenuItem shareSecondSideVertical = new JMenuItem("Share Right Side Vertical");
        JMenuItem shareThirdSideVertical = new JMenuItem("Share Down Side Vertical");
        JMenuItem shareForthSideVertical = new JMenuItem("Share Right Side Vertical");
        JMenuItem shareFirstPointVertical = new JMenuItem("Share Top Left Point Vertical");
        JMenuItem shareSecondPointVertical = new JMenuItem("Share Top Right Point Vertical");
        JMenuItem shareThirdPointVertical = new JMenuItem("Share Bottom Right Point Vertical");
        JMenuItem shareForthPointVertical = new JMenuItem("Share Bottom Left Point Vertical");
        JMenuItem shareCenterVertical = new JMenuItem("Share Center Vertical");
        verticalShareButton.add(shareFirstSideVertical);
        verticalShareButton.add(shareSecondSideVertical);
        verticalShareButton.add(shareThirdSideVertical);
        verticalShareButton.add(shareForthSideVertical);
        verticalShareButton.add(shareFirstPointVertical);
        verticalShareButton.add(shareSecondPointVertical);
        verticalShareButton.add(shareThirdPointVertical);
        verticalShareButton.add(shareForthPointVertical);
        verticalShareButton.add(shareCenterVertical);


        JMenu horizontalShareButton = new JMenu("Horizontal Share Buttons");
        menuBar.add(horizontalShareButton);
        JMenuItem shareFirstSideHorizontal = new JMenuItem("Share Upper Side Horizontal");
        JMenuItem shareSecondSideHorizontal = new JMenuItem("Share Right Side Horizontal");
        JMenuItem shareThirdSideHorizontal = new JMenuItem("Share Down Side Horizontal");
        JMenuItem shareForthSideHorizontal = new JMenuItem("Share Right Side Horizontal");
        JMenuItem shareFirstPointHorizontal = new JMenuItem("Share Top Left Point Horizontal");
        JMenuItem shareSecondPointHorizontal = new JMenuItem("Share Top Right Point Horizontal");
        JMenuItem shareThirdPointHorizontal = new JMenuItem("Share Bottom Right Point Horizontal");
        JMenuItem shareForthPointHorizontal = new JMenuItem("Share Bottom Left Point Horizontal");
        JMenuItem shareCenterHorizontal = new JMenuItem("Share Center Horizontal");
        horizontalShareButton.add(shareFirstSideHorizontal);
        horizontalShareButton.add(shareSecondSideHorizontal);
        horizontalShareButton.add(shareThirdSideHorizontal);
        horizontalShareButton.add(shareForthSideHorizontal);
        horizontalShareButton.add(shareFirstPointHorizontal);
        horizontalShareButton.add(shareSecondPointHorizontal);
        horizontalShareButton.add(shareThirdPointHorizontal);
        horizontalShareButton.add(shareForthPointHorizontal);
        horizontalShareButton.add(shareCenterHorizontal);

        JMenu mainButtons = new JMenu("Main Buttons");
        menuBar.add(mainButtons);
        JMenuItem drawButton = new JMenuItem("Draw");
        JMenuItem clearButton = new JMenuItem("Clear");
        JMenuItem circumscribed = new JMenuItem("Circumscribed");
        JMenuItem moving = new JMenuItem("Moving");
        mainButtons.add(drawButton);
        mainButtons.add(clearButton);
        mainButtons.add(circumscribed);
        mainButtons.add(moving);

        JTextArea textField = new JTextArea("You Params");

        textField.setVisible(true);
        textField.setBackground(Color.WHITE);
        textField.setSize(100,10);


        leftSideButtonPanel.add(textField);



        Rectangle rectangle = new Rectangle(new Point(40,10), new Point(80,50), new Point(60,70), new Point( 20,30));
        //40,0 140,80 100,130 0,50
        //100,100 200,100 200,200 100,200
        //-100,-100 100,-100 100,100 -100,100
        //20,30 40,10 80,50 60,70


        drawButton.addActionListener((ActionEvent e) -> {
            comp.draw(rectangle);

            textField.setText("S= " + rectangle.searchOfS()+ "P= " + rectangle.searchForP());

        });

        clearButton.addActionListener(e -> comp.clearLines());

        moving.addActionListener(e -> {

            String[] params = textField.getText().split(";");
            comp.draw(rectangle.moving(Integer.parseInt(params[0]),Integer.parseInt(params[1])));

        });

        circumscribed.addActionListener(e ->
                comp.draw(Rectangle.createACircumscribedRectangle(rectangle))
        );

        shareFirstSideNormal.addActionListener(e ->
                comp.draw(rectangle.sharing( Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.NORMAL,2))
        );

        shareSecondSideNormal.addActionListener(e ->
                comp.draw(rectangle.sharing( Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.NORMAL,2))
        );

        shareThirdSideNormal.addActionListener(e ->
                comp.draw(rectangle.sharing( Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.NORMAL,2))
        );

        shareForthSideNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.NORMAL,2))
        );

        shareFirstPointNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.NORMAL,2))
        );

        shareSecondPointNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.NORMAL,2))
        );

        shareThirdPointNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.NORMAL,2))
        );

        shareForthPointNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.NORMAL,2))
        );

        shareFirstSideHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareSecondSideHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareThirdSideHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareForthSideHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareFirstPointHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareSecondPointHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareThirdPointHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareForthPointHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareFirstSideVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.VERTICAL,2))
        );

        shareSecondSideVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.VERTICAL,2))
        );

        shareThirdSideVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.VERTICAL,2))
        );

        shareForthSideVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.SIDE, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.VERTICAL,2))
        );
        shareFirstPointVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FIRST, Rectangle.typeOfShape.VERTICAL,2))
        );
        shareSecondPointVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.SECOND, Rectangle.typeOfShape.VERTICAL,2))
        );
        shareThirdPointVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.THIRD, Rectangle.typeOfShape.VERTICAL,2))
        );
        shareForthPointVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.POINT, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.VERTICAL,2))
        );

        shareCenterNormal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.CENTER, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.NORMAL,2))
        );

        shareCenterHorizontal.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.CENTER, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.HORIZONTAL,2))
        );

        shareCenterVertical.addActionListener(e ->
                comp.draw(rectangle.sharing(  Rectangle.typeOfHolding.CENTER, Rectangle.numberOFSelected.FORTH, Rectangle.typeOfShape.VERTICAL,2))
        );


        testFrame.pack();
        testFrame.setVisible(true);





    }
}

