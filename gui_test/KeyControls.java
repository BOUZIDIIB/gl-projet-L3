package gui_test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import generateur.game.ElementManager;
import stucture_base.Element;

public class KeyControls implements KeyListener {

	private ElementManager manager ;
	private Element selected ;
	public KeyControls(ElementManager manager , Element selected ) {
		this.manager=manager;
		this.selected = selected;
	}
	

		@Override
		public void keyTyped(KeyEvent e) {
			char code = e.getKeyChar();
			switch(code) {
			case 'z':
				// ajouter un gestionnaire de mouvement des element dans le element manager 
				//manager.getMapManager().moveElement(selected, );
				manager.moveFarmerUp();
				
				break;
			
			case 's':
				manager.moveFarmerDown();
				
				break;
				
			case 'q':
				manager.moveFarmerLeft();
				break;
		
			case 'd':
				manager.moveFarmerRight();
				break;
			
			default:
				System.out.println("aucune correspondance avec le clavier");
				break;
				
			}
				
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//manager.stop(e.getKeyCode());		
		}
		
	

}
