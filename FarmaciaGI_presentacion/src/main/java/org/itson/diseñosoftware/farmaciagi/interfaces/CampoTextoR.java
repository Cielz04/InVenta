package org.itson.diseñosoftware.farmaciagi.interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Campo de texto redondeado y con placeholder
 * @author adria
 */
public class CampoTextoR extends JTextField {

    private String placeholder;

    public CampoTextoR(int columns) {
        super(columns);
        setOpaque(false);
        setBorder(new EmptyBorder(5, 10, 5, 10));
        initListener();
    }

    public CampoTextoR(String placeholder) {
        this(20); 
        this.placeholder = placeholder;
    }

    public CampoTextoR(int columns, String placeholder) {
        this(columns); 
        this.placeholder = placeholder;
    }

    private void initListener() {
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                repaint();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                repaint();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo redondeado
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 10, 10));

        super.paintComponent(g);

        // Dibujar placeholder si no hay texto
        if (getText().isEmpty() && placeholder != null) {
            g2.setColor(Color.GRAY);
            FontMetrics fm = g2.getFontMetrics();
            int textY = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(placeholder, getInsets().left, textY);
        }

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 5, 5));
        g2.dispose();
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }
}
