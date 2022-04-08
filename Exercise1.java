import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int numBooks = scanner.nextInt();
		scanner.nextLine();
		for (int p = 0; p < numBooks; p++) {
			int price = scanner.nextInt();
			array.add(price);
		}
		Collections.sort(array);
		int totalPrice = scanner.nextInt();
		if (array.size() > 2) {
			boolean exit = false;
			int midPrice = totalPrice / 2;
			int midPosition = binSearchNumeroCercano(array, midPrice);
			int MidPrice = array.get(midPosition);
			array.remove(midPosition);
			int counter = 0;
			while (!exit) {
				int secondPrice = totalPrice - MidPrice;
				int index = binSearch(array, secondPrice);
				if (index != -1) {
					System.out.println(
							"Peter should buy books whose prices are " + MidPrice + " and " + array.get(index) + ".");
					System.out.println();
					exit = true;
				} else {
					midPosition = binSearchNumeroCercano(array, MidPrice);
					MidPrice = array.get(midPosition);
					array.remove(midPosition);
				}
				if (counter == array.size()) {
					exit = true;
				}
				counter++;
			}

		} else {
			if (array.get(0) + array.get(1) == totalPrice) {
				System.out.println(
						"Peter should buy books whose prices are " + array.get(0) + " and " + array.get(1) + ".");
				System.out.println();
			}
		}
	}

	public static int binSearchNumeroCercano(ArrayList<Integer> array, int goal) {
		int throwback = -1;
		int re = 0;
		int na = array.size() - 1;
		int mid = 0;
		boolean i = false;
		while (re <= na && !i) {
			mid = (na + re) / 2;
			if (array.get(mid) == goal) {
				throwback = mid;
				i = true;
			} else if (array.get(mid) > goal) {
				na = mid - 1;
			} else if (array.get(mid) < goal) {
				re = mid + 1;
			}
		}
		if (throwback == -1) {
			throwback = na;
		}
		return throwback;
	}

	public static int binSearch(ArrayList<Integer> array, int goal) {
		int throwback = -1;
		int re = 0;
		int na = array.size() - 1;
		int mid = 0;
		boolean i = false;
		while (re <= na && !i) {
			mid = (na + re) / 2;
			if (array.get(mid) == goal) {
				throwback = mid;
				i = true;
			} else if (array.get(mid) > goal) {
				na = mid - 1;
			} else if (array.get(mid) < goal) {
				re = mid + 1;
			}
		}
		return throwback;
	}
}