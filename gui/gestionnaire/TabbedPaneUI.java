package gui.gestionnaire;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TabbedPaneUI extends BasicTabbedPaneUI {
    private FontMetrics boldFontMetrics;
    private Font boldFont;
 
    @Override
    public void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        g.setColor(Gestionnaire.LIGHT_BROWN);
        g.fillRect(x, y, w, h);
        if (isSelected) {
            g.setColor(Gestionnaire.MEDIUM_BROWN);
            g.fillRect(x, y, w, h);
        }
    }

    @Override
    public int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return super.calculateTabWidth(tabPlacement, tabIndex, metrics) + metrics.getHeight() + 15;
    }
 
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return (3*fontHeight/2);
    }
    
    @Override
    public int getTabLabelShiftY(int tabPlacement, int tabIndex, boolean isSelected) {
        return 0;
    }
 
    @Override
    public Insets getContentBorderInsets(int tabPlacement) {
        return new Insets(1,1,1,1);
    }
 
    @Override
    public void installDefaults() {
        super.installDefaults();
        tabAreaInsets.left = 0;
        selectedTabPadInsets = new Insets(1,1,1,1);
        tabInsets = selectedTabPadInsets;
        boldFont = tabPane.getFont().deriveFont(Font.BOLD);
        boldFontMetrics = tabPane.getFontMetrics(boldFont);
    }
 
    @Override
    public void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected){
        if (isSelected) {
            int vDifference = (int) (boldFontMetrics.getStringBounds(title, g).getWidth()) - textRect.width;
            textRect.x -= (vDifference / 2);
            super.paintText(g, tabPlacement, boldFont, boldFontMetrics, tabIndex, title, textRect, isSelected);
        } else {
        	super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);
        }
    }
    
    
    // Pour enlever le focus pointillé
    @Override 
    protected void paintFocusIndicator(Graphics g, int tabPlacement,
            Rectangle[] rects, int tabIndex,
            Rectangle iconRect, Rectangle textRect,
            boolean isSelected) {}
}
