package gui.gestionnaire;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import process.transaction.Buyable;

public class PaintStrategy {
	
	public static Color DARK_BROWN = new Color(68,40,24);
	public static Color MEDIUM_BROWN = new Color(188,149,88);
	public static Color LIGHT_BROWN = new Color(255,231,171);
	public static Color DARK_GREEN = new Color(82,121,112);
	public static Color RED = new Color(158,36,19);
	public static Color MEDIUM_GREEN = new Color(103,148,76);
	public static int MIN_SPACE_BETWEEN = 10;
	public static int MARKET_ROW_COUNT = 2;
	public static int MARKET_COLUMN_COUNT = 3;
	public static int MANAGER_ROW_COUNT = 1;
	public static int MANAGER_COLUMN_COUNT = 4;
	public static int MARKET_CARD_WIDTH = 182;
	public static int MARKET_CARD_HEIGHT = 222;
	public static Color MARKET_CARD_COLOR = LIGHT_BROWN;
	public static int RADIUS = 20;
	
	//ok
	public JPanel paintNormalPanel(int x, int y, int w, int h, Color color) {
		JPanel panel = new JPanel();
		panel.setBounds(x,y,w,h);
		panel.setBackground(color);
		panel.setLayout(null);
		return panel;
	}
	
	//ok
	public JPanel paintNormalPanel(int x, int y, int w, int h, LayoutManager layout, Color color) {
		JPanel panel = new JPanel();
		panel.setBounds(x,y,w,h);
		panel.setBackground(color);
		panel.setLayout(layout);
		return panel;
	}
	
	//ok
	public JPanel paintNormalPanel(LayoutManager layout, Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color);
		panel.setLayout(layout);
		return panel;
	}
	
	//ok
	public JPanel paintRoundedPanel(int x, int y, int w, int h,LayoutManager layout, int radius, Color color) {
		RoundedPanel roundedPanel = new RoundedPanel(layout, radius);
		roundedPanel.setOpaque(false);
		roundedPanel.setBackground(color);
		roundedPanel.setBounds(x,y,w,h);
		return roundedPanel;
	}
	
	//ok
	public JTabbedPane paintTabbedPane(int x, int y, int w, int h,Color backgroundColor, Color foregroundColor) {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setUI(new TabbedPaneUI());
		tabbedPane.setBackground(backgroundColor);
		tabbedPane.setForeground(foregroundColor);
		tabbedPane.setBounds(x,y,w,h);
		return tabbedPane;
	}
	
	//ok
	public JTabbedPane paintTabs(JTabbedPane tabbedPane, HashMap<String,JPanel> composants) {
		for (String title : composants.keySet()) {
			tabbedPane.addTab(title, composants.get(title));
		}
		return tabbedPane;
	}
	
	//ok
	public JPanel paintMarketCardsContainer(int x, int y, int w, int h, CardLayout cardLayout, int radius, Color color, int cardCount) {
		JPanel cardContainer = paintNormalPanel(x, y, w, h, null);
		JPanel innerContainer = paintNormalPanel(MIN_SPACE_BETWEEN, MIN_SPACE_BETWEEN, w - MIN_SPACE_BETWEEN, h - MANAGER_COLUMN_COUNT, null);
		if(cardCount <= (MARKET_ROW_COUNT * MANAGER_COLUMN_COUNT)) {
			innerContainer = fillMarketCardContainer(innerContainer, cardCount);
			cardContainer.add(innerContainer);
		} else {
			int count = cardCount / (MARKET_ROW_COUNT * MARKET_COLUMN_COUNT);
			if ( count == 0) { // ou le résultat modulo le nbr de cartes différent de 0
				count++;
			}
			cardCount /= count;
			for ( int i = 0; i < count; i++) {
				innerContainer = paintNormalPanel(MIN_SPACE_BETWEEN, MIN_SPACE_BETWEEN, w - MIN_SPACE_BETWEEN, h - MARKET_COLUMN_COUNT, null);
				innerContainer = fillMarketCardContainer(innerContainer, cardCount);
				cardContainer.add(innerContainer);
			}
		}
		return cardContainer;
	}
	
	
	// Pas encore fonctionnelle 
	public JPanel paintBill(JPanel panier,HashMap<String, Buyable> articles) {
		JPanel bill = paintNormalPanel(0, 0, 230, 460, new GridLayout(0,1), MEDIUM_BROWN);
		JScrollPane billScrollPane = new JScrollPane(bill);
		billScrollPane.setViewportView(bill);
		billScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		billScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panier.add(billScrollPane);
		for (Buyable article : articles.values()) {
			JPanel parentPanel = new JPanel();
			parentPanel.setBackground(MEDIUM_BROWN);
			parentPanel.setLayout(null);
			JPanel articleBill = paintRoundedPanel(10, 10, 200, 50, null, 20, MARKET_CARD_COLOR);
			parentPanel.add(articleBill);
			bill.add(parentPanel);
		}
		return bill;
	}
	
	// ok
	public JPanel fillMarketCardContainer(JPanel innerContainer, int cardCount) {
		int cpt = 0;
		int posX = 0;
		int posY = 0;
		for (int i = 0; i < cardCount; i++) {
			JPanel card = paintRoundedPanel(posX, posY, MARKET_CARD_WIDTH, MARKET_CARD_HEIGHT, null, RADIUS, MARKET_CARD_COLOR);
			innerContainer.add(card);
			cpt++;
			posX += MIN_SPACE_BETWEEN + MARKET_CARD_WIDTH;
			if ( cpt == MARKET_COLUMN_COUNT) {
				cpt = posX = 0;
				posY += MIN_SPACE_BETWEEN + MARKET_CARD_HEIGHT;
			}
		}
		return innerContainer;			
	}
		
}







