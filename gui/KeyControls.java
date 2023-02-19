package gui;

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
				manager.moveUp(selected);
				
				break;
			
			case 's':
				manager.moveDown(selected);
				
				break;
				
			case 'q':
				manager.moveLeft(selected);
				break;
		
			case 'd':
				manager.moveRight(selected);
				break;
			
			default:
				
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


		public Element getSelected() {
			return selected;
		}


		public void setSelected(Element selected) {
			this.selected = selected;
		}
		
		
	

}
