	package gui.Farm;
	
	
	import java.awt.Container;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import javax.swing.JFrame;

import data.configuration.GameConfiguration;
import data.gestion.GestionnaireStructures;
import data.stucture_base.Element;
import gui.gestionnaire.Gestionnaire;
import process.game.ElementManager;
import process.game.GameBuilder;

	
	
	public class MainGuiTest  extends JFrame implements Runnable{
	
		private static final long serialVersionUID = 1L;
		
		private ElementManager manager ;
		private GestionnaireStructures gestionnaire = GestionnaireStructures.getInstance() ;
		private Board dashboard ;
		private Element selected ;
		private int x ;
		private int y ;
		
		
		public MainGuiTest(String title ) {
			super(title);
			init();
		}
		
		
		public void init() {
			
			Container contentPane= getContentPane();
			contentPane.setLayout(null);
			
			manager=GameBuilder.buildinElement();
			
			selected= manager.getMapManager().get("fermier");	
				
			gestionnaire.initializeGestionnaire(manager.getMapManager().getMap());
			
			dashboard = new Board(manager , selected ,gestionnaire);
			
			contentPane.add(dashboard);
			
			dashboard.addMouseListener(new MouseControls());
	
	
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack();
			setVisible(true);
			setSize(GameConfiguration.WINDOW_WIDTH , GameConfiguration.WINDOW_HEIGHT);
			setResizable(false);
		}
	
		@Override
		public void run() {
			while (true) {
					try {
						Thread.sleep(GameConfiguration.GAME_SPEED);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					dashboard.setSelected(selected);
					dashboard.repaint();
			}
		}
		
		
		private class MouseControls implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				Element element = manager.search(x, y);
				
				if(element!=null) {
					selected = element ;
				}
				else {
					if(dashboard.mouseIsOnAdd(x,y)) {
						dashboard.changeState();	
					}
					else {
						if(dashboard.mouseIsOnHome(x, y)) {
							dispose();
							new Gestionnaire("gestionnaire");		
						}
					}
				}
	
			}

			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX() ;
				y = e.getY() ;
					
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				int dx = e.getX() ;
				int dy = e.getY() ;
				
				manager.getMapManager().movingMap(dx - x, dy - y );
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		


		
	}
