class DoublePair {
	public double x1, x2;

	public String toString() {
		return "{" + x1 + ", " + x2 + "}";
	}

	public void swap() {
		double aux = this.x2;
		this.x2 = this.x1;
		this.x1 = aux;
	}
}
