package FilesOP;

import java.util.*;

public class SalaPool implements Pool<Sala> {

	private List<Sala> salas;

	public SalaPool() {
		this.salas = new ArrayList<Sala>();
		this.salas.add(new Sala(" Jantar "));
		this.salas.add(new Sala(" Varanda "));
		this.salas.add(new Sala(" Especial "));

	}

	public Sala acquire() {
		if (this.salas.size() > 0) {
			return this.salas.remove(0);
		} else {
			return null;
		}
	}

	public void release(Sala sala) {
		this.salas.add(sala);
	}

}
