package Assignment1;

public class Q13Loop {

	public void Loop() {

		boolean flip = true;

		for (int i = 0; i < 4; i++) { // Rows

			if (i < 2) {
				flip = true;
			} else {
				flip = false;
			}

			for (int j = 0; j <= i; j++) { // Columns

				if (flip == true) {

					if (((i + j) % 2) == 0) {
						System.out.print(0);
					} else {
						System.out.print(1);
					}
				} else {
					if (((i + j) % 2) == 1) {
						System.out.print(0);
					} else {
						System.out.print(1);
					}
				}

			}

			System.out.print("\n");

		}
	}
}