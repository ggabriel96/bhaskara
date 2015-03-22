/*
 * This file is part of bhaskara.
 *
 *  bhaskara is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  binary_search_tree is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with bhaskara. If not, see <http://www.gnu.org/licenses/>.
 */

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
