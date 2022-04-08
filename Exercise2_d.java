import java.util.Scanner;

public class Exercise2_d {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfCases = scanner.nextInt();
		int[] output = new int[numberOfCases];
		scanner.nextLine();

		for (int j = 0; j < numberOfCases; j++) {

			String set = scanner.nextLine();
			String[] split = set.split(" ");

			int prog = Integer.valueOf(split[0]);
			int math = Integer.valueOf(split[1]);
			int resultado;

			if (prog == math) {
				resultado = (prog + math) / 4;
				output[j] = resultado;

			} else if (prog < math) {

				resultado = math - prog;
				math = (math - resultado);
				resultado = (resultado) / 2;

				if (prog < resultado) {
					resultado = prog;

				}

				prog = (prog - resultado);
				math = (math - resultado);
				resultado += (prog + math) / 4;

				output[j] = resultado;

			} else {

				resultado = (prog - math);
				prog = (prog - resultado);
				resultado = (resultado / 2);

				if (prog < resultado) {
					resultado = prog;
				}

				prog = (prog - resultado);
				math = (math - resultado);
				resultado += (prog + math) / 4;

				output[j] = resultado;

			}

		}

		scanner.close();

		for (int j = 0; j < numberOfCases; j++) {

			System.out.println(output[j]);

		}

	}
}
