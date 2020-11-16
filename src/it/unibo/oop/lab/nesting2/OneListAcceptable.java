package it.unibo.oop.lab.nesting2;

import java.util.LinkedList;
import java.util.List;

public final class OneListAcceptable<T> implements Acceptable<T> {
	private final class OneListAcceptor<T> implements Acceptor<T> {
		
		private List<T> sequence;
		public OneListAcceptor(List<T> s) {
			this.sequence = new LinkedList<>(s);
		}

		public void end() throws EndNotAcceptedException {
			if(this.sequence.size() > 0) {
				throw new EndNotAcceptedException();
			}
		}

		public void accept(T newElement) throws ElementNotAcceptedException {
			if(this.sequence.size() == 0 && newElement != null) {
				throw new ElementNotAcceptedException(newElement);
			}
			else if(newElement == this.sequence.get(0)) {
				this.sequence.remove(0);
			} else {
				throw new ElementNotAcceptedException(newElement);
			}
		}
		
	}

	private OneListAcceptor<T> acceptor;
	public OneListAcceptable(List<T> list) {
		this.acceptor = new OneListAcceptor<>(list);
	}
	public Acceptor<T> acceptor() {
		return this.acceptor;
	}

}
