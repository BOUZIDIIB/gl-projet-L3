package gui.gestionnaire;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import data.gestion.RessourcesManager;
import process.game.Game;
import process.game.GameBuilder;
import process.game.MapManager;
import process.transaction.Achat;

public class Gestionnaire extends JFrame {
	
	public static Achat achat = new Achat();
	
	public static Color DARK_BROWN = new Color(68,40,24);
	public static Color MEDIUM_BROWN = new Color(188,149,88);
	public static Color LIGHT_BROWN = new Color(255,231,171);
	public static Color DARK_GREEN = new Color(82,121,112);
	public static Color RED = new Color(158,36,19);
	public static Color MEDIUM_GREEN = new Color(103,148,76);
	
	private GestionnairePaintStrategy paintStrategy = new GestionnairePaintStrategy();
	private HashMap<String, JPanel> toBuy = new HashMap<>();
	
	private RessourcesManager ressourcesManager = new RessourcesManager();
	
	private static final long serialVersionUID = 1L;
	//private static final Color WHITE = new Color(255,255,255);
	
	public Gestionnaire(String title ) {
		super(title);
		init();
		setVisible(true);
		setResizable(false);
	}
	
	
	public void init() {
		
		setBackground(LIGHT_BROWN);
		
		JPanel animalsPanel = paintStrategy.paintNormalPanel(10, 10, WIDTH, HEIGHT, MEDIUM_BROWN);
		JPanel plantsPanel = paintStrategy.paintNormalPanel(10, 10, WIDTH, HEIGHT, MEDIUM_BROWN);
		JPanel outilsPanel = paintStrategy.paintNormalPanel(10, 10, WIDTH, HEIGHT, MEDIUM_BROWN);
		JPanel enginsPanel = paintStrategy.paintNormalPanel(10, 10, WIDTH, HEIGHT, MEDIUM_BROWN);
		JPanel structuresPanel = paintStrategy.paintNormalPanel(10, 10, WIDTH, HEIGHT, MEDIUM_BROWN);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		JPanel principalPanel = paintStrategy.paintNormalPanel(10, 10, 900, 620, LIGHT_BROWN);
		contentPane.add(principalPanel);
		getContentPane().add(principalPanel);
		
		
		
		JTabbedPane tabbedPane = paintStrategy.paintTabbedPane(10, 89, 610, 520, LIGHT_BROWN, DARK_BROWN);
		JPanel panier = paintStrategy.paintRoundedPanel(630, 115, 260, 495, new BorderLayout(), 40, MEDIUM_BROWN);
		JLabel panierHeaderLabel = new JLabel("Panier");
		panierHeaderLabel.setHorizontalAlignment(JLabel.CENTER);
		panier.add(panierHeaderLabel, BorderLayout.NORTH);
		panier.add(paintStrategy.paintBill(panier, achat.getCart()), BorderLayout.CENTER);

		toBuy.put("Animaux", animalsPanel);
		toBuy.put("Plantes", plantsPanel);
		toBuy.put("Outils", outilsPanel);
		toBuy.put("Engins", enginsPanel);
		toBuy.put("Structures", structuresPanel);
		
		tabbedPane = paintStrategy.paintTabs(tabbedPane, toBuy);
		
		JPanel animalsCards = paintStrategy.paintMarketCardsContainer(10, 10, 599, 512, new CardLayout(), 20, MEDIUM_BROWN, ressourcesManager.getGestionnaireStocks().getGestionnaireAnimaux().size());
		animalsPanel.add(animalsCards);
		JPanel plantsCards = paintStrategy.paintMarketCardsContainer(10, 10, 599, 512, new CardLayout(), 20, MEDIUM_BROWN, ressourcesManager.getGestionnaireStocks().getGestionnaireCulture().size());
		plantsPanel.add(plantsCards);
		JPanel outilsCards = paintStrategy.paintMarketCardsContainer(10, 10, 599, 512, new CardLayout(), 20, MEDIUM_BROWN, ressourcesManager.getGestionnaireMateriel().getGestionnaireOutils().size());
		outilsPanel.add(outilsCards);
		JPanel enginsCards = paintStrategy.paintMarketCardsContainer(10, 10, 599, 512, new CardLayout(), 20, MEDIUM_BROWN, ressourcesManager.getGestionnaireMateriel().getGestionnaireEngins().size());
		enginsPanel.add(enginsCards);
		JPanel structuresCards = paintStrategy.paintMarketCardsContainer(10, 10, 599, 512, new CardLayout(), 20, MEDIUM_BROWN, ressourcesManager.getGestionnaireStructure().getStructures().size());
		structuresPanel.add(structuresCards);
		
		
//		// just don't set v t in run 
//		Button ventes = new Button("Vente");
//		ventes.setBounds(25, 25, 66, 21);
//		principalPanel.add(ventes);
//		
//		Button achats = new Button("Achat");
//		achats.setBounds(120, 25, 66, 21);
//		principalPanel.add(achats);
		
		
		principalPanel.add(tabbedPane);
		principalPanel.add(panier);
		setSize(930,678);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
						
	}
	
	public static void main(String[] args) {
		
		Game game = new Game();
		MapManager manager = GameBuilder.MapBuilder();
		game.acheter(manager.getMap());
		Gestionnaire.achat = game.getAchat();
		
		Gestionnaire gestionnaire = new Gestionnaire("Gestionnaire");
	}
}