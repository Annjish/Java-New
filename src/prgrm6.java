import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prgrm6  extends JFrame implements ItemListener {
    private String selectedShape = "Rectangle";

    public prgrm6() {
        setTitle("Shape Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a Choice component to select shapes
        Choice shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addItemListener(this);

        // Add the Choice component to the frame
        add(shapeChoice, BorderLayout.NORTH);

        // Add a custom drawing panel
        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof Choice) {
            // Get the selected shape from the Choice component
            selectedShape = (String) e.getItem();
            // Repaint the drawing panel to update the shape
            repaint();
        }
    }

    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawShape(g);
        }

        private void drawShape(Graphics g) {
            int width = getWidth();
            int height = getHeight();

            g.setColor(Color.BLACK);

            // Draw the selected shape based on user's choice
            if (selectedShape.equals("Rectangle")) {
                g.drawRect(50, 50, width - 100, height - 100);
            } else if (selectedShape.equals("Triangle")) {
                int[] xPoints = {width / 2, 100, width - 100};
                int[] yPoints = {100, height - 100, height - 100};
                g.drawPolygon(xPoints, yPoints, 3);
            } else if (selectedShape.equals("Square")) {
                int side = Math.min(width, height) - 100;
                g.drawRect((width - side) / 2, (height - side) / 2, side, side);
            } else if (selectedShape.equals("Circle")) {
                int diameter = Math.min(width, height) - 100;
                g.drawOval((width - diameter) / 2, (height - diameter) / 2, diameter, diameter);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new prgrm6().setVisible(true));
    }
}