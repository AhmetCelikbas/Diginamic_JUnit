package junit_tp2;

import java.util.ArrayList;
import java.util.List;

import exceptions.PeekException;
import exceptions.TailleException;

public class Pile <T> {

	private int taille = 0;
	private List<T> pile = new ArrayList<T>();
	
	public Pile() {
	}

	public Pile(int taille) {
		this.taille = taille;
	}
	
	public void push(T newItem) throws TailleException {
		if(taille == 0) {
			pile.add(newItem);
		}
		
		if(taille != 0 && (pile.size() < taille)) {
			pile.add(newItem);
		} else {
			throw new TailleException(TailleException.EXCEP_TAILLE_MAX);
		}
	}
	
	public void pop() {
		pile.remove(pile.size() - 1);
	}
	
	public void popAll() {
		pile = new ArrayList<T>();
	}
	
	public T peek() throws PeekException {
		if(pile.size() > 0) {
			return pile.get(0);
		} else {
			throw new PeekException(PeekException.EXCEP_PILE_VIDE);
		}
	}
	
	public int getSize() {
		return pile.size();
	}
}
