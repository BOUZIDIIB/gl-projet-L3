	package gui_test;
	
	import java.awt.BorderLayout;
	import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
	
	import configuration.GameConfiguration;
	import generateur.game.ElementManager;
	import generateur.game.GameBuilder;
import stucture_base.Element;
	
	
	public class MainGuiTest  extends JFrame implements Runnable{
	
		private static final long serialVersionUID = 1L;
		
		private ElementManager manager ;
		private Board dashboard ;
		private Element selected ;
		
		public MainGuiTest(String title ) {
			super(title);
			init();
		}
		
		
		
		public void init() {
			
			Container contentPane= getContentPane();
			contentPane.setLayout(new BorderLayout());
			
			
			manager=GameBuilder.buildinElement();
			selected= manager.getFermier();			
			dashboard = new Board(manager , selected );
			contentPane.add(dashboard,BorderLayout.CENTER);
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
					System.out.println(element.getReference());
				}
			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
