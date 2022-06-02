package ru.vsu.baryshev;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinesComponent extends JComponent{

    private static class Line{
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        private Color color;

        public Line(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
        }
    }

    private final List<Line> lines = new ArrayList<Line>();

    public  LinesComponent draw(Rectangle rec){
        this.addLine(rec.getP1().getX(), rec.getP1().getY(), rec.getP2().getX(), rec.getP2().getY(), Color.BLACK);
        this.addLine(rec.getP2().getX(), rec.getP2().getY(), rec.getP3().getX(), rec.getP3().getY(), Color.BLACK);
        this.addLine(rec.getP3().getX(), rec.getP3().getY(), rec.getP4().getX(), rec.getP4().getY(), Color.BLACK);
        this.addLine(rec.getP4().getX(), rec.getP4().getY(), rec.getP1().getX(), rec.getP1().getY(), Color.BLACK);
        return this;
    }


    protected void addLine(int x1, int x2, int x3, int x4, Color color) {
        lines.add(new Line(x1,x2,x3,x4, color));
        repaint();
    }


    protected void clearLines() {
        lines.clear();
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        for (Line line : lines) {
            g.setColor(line.color);
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }
}
