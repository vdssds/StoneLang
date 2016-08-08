package stone;

import stone.ast.ASTree;

public class StoneExpection extends RuntimeException {
	
	private static final long serialVersionUID = -7347948305907401745L;

	public StoneExpection(String m) {
		super(m);
	}
	
	public StoneExpection(String m, ASTree t) {
		super(m + " " + t.location());
	}
}
