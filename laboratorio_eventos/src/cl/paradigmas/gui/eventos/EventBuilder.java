package cl.paradigmas.gui.eventos;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import cl.paradigmas.gui.Canvas;
import cl.paradigmas.modelo.Circulo;
import cl.paradigmas.modelo.Linea;

final public class EventBuilder implements MouseListener{
	
	Canvas canvas = new Canvas();
	private EventBuilder(){
		
	}
	public void mouseClicked(MouseEvent e) {
		if(seleccionado == 1){
			Point p = e.getPoint();
			Circulo c = new Circulo(p,50);
			canvas.addDibujable(c);
			canvas.repaint();
		}
	}

	public void mousePressed (MouseEvent e) {
		if(seleccionado == 2){
			inicio = e.getPoint();
			Linea l = new Linea(inicio,inicio);
			canvas.setDibujableTmp(l);
			canvas.setDibujandoTmp(true);
			canvas.repaint();
		}
	}

	public void mouseDragged (MouseEvent e) {
		if(seleccionado == 2 && canvas.isDibujandoTmp()){
			l.setFin(e.getPoint());
			canvas.repaint();
		}
	}

	public void mouseReleased (MouseEvent e) {
		if(seleccionado == 2 && canvas.isDibujandoTmp()){
			l.setFin(e.getPoint());
			canvas.addDibujable(l);
			l = null;
			canvas.setDibujandoTmp(false);;
			canvas.repaint();
		}
	}
}
