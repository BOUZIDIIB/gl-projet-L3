package gui.Farm;



import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


import data.configuration.GameConfiguration;
import data.gestion.GestionnaireStructures;
import data.structure.Structure;
import gui.gestionnaire.Gestionnaire;


public class ChoixPanel extends JLayeredPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GestionnaireStructures gestionnaire ;
	
	
	public ChoixPanel(GestionnaireStructures gestionnaire) {
		super();
		this.gestionnaire = gestionnaire;
		init();
	}
	
	
	public void init() {
		setOpaque(true);
		setBackground( Gestionnaire.LIGHT_BROWN);
		setBounds(50, GameConfiguration.WINDOW_HEIGHT-150, GameConfiguration.WINDOW_WIDTH-170, 100);
		int x = 100 ; 
		int y = 10;
		for(Structure structure : gestionnaire.getStructures().values()) {
			JLabel struct = new JLabel();
			struct.setBounds(x , y ,100,100);
			ImageIcon icon = new ImageIcon("src"+File.separator+"ressources"+File.separator+"home.png");
			struct.setIcon(icon);
			add(struct, JLayeredPane.DRAG_LAYER);
			x += 150 ;		
		}	
	}
	
	
//	
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		
//		Etable etable = new Etable(5,5,"ref",GameBuilder.MapBuilder().getMap());
//		paint(etable , g);
//		
//	}
//
//	public void paint( Element element , Graphics graphics) {
//		ImageIcon icone = new ImageIcon("src"+File.separator+"ressources"+File.separator+"grange.png");
//		Position position = element.getPosition();
//		int x = GameConfiguration.WINDOW_WIDTH - 500;
//		int y =GameConfiguration.WINDOW_HEIGHT - 200 ;
//		graphics.drawImage(icone.getImage(), x, y,80 , 80, null);	
//	}
}
