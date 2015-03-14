class Main {
	public static void main(String args[]) {
		Equation x = new Equation(2, 4, 2);
		System.out.println(x);
		System.out.println("S = " + x.roots());

		System.out.println();

		x = new Equation(1, -10, 24);
		System.out.println(x);
		System.out.println("S = " + x.roots());

		System.out.println();

		x = new Equation(1, 4, 0);
		System.out.println(x);
		System.out.println("S = " + x.roots());

		System.out.println();

		x = new Equation(1, 0, -4);
		System.out.println(x);
		System.out.println("S = " + x.roots());

		//System.out.println();
	}
}
