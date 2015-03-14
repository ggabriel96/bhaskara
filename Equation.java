class Equation {
	public int a, b, c;

	public Equation (int a, int b, int c) {
		if (a != 0) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			System.out.println("# a cannot be 0!");
		}
	}

	public DoublePair roots() {
		DoublePair answ = new DoublePair();

		int delta = (b * b) - (4 * this.a * this.c);

		if (delta >= 0) {
			answ.x1 = (-this.b + Math.sqrt(delta)) / (2.0 * this.a);
			answ.x2 = (-this.b - Math.sqrt(delta)) / (2.0 * this.a);
		}
		else return null;

		if (Double.compare(answ.x1, answ.x2) > 0) answ.swap();

		return answ;
	}

	public String toString() {
		String eq = new String();

		if (this.a == 1) eq = "x²";
		else eq = this.a + "x²";

		if (this.b != 0) {
			if (this.b > 0) eq += "+";
			eq += this.b + "x";
		}

		if (this.c != 0) {
			if (this.c > 0) eq += "+";
			eq += this.c;
		}

		eq += " = 0";

		return eq;
	}
}
