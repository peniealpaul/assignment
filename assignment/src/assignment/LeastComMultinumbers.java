package assignment;

public class LeastComMultinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			// TODO Auto-generated method stub
			int a = 100;
			int b =125;
			int c = 0;
			int d = 0;
			
			boolean t = true;
			for (int i = 2; i <=b; i++) {

				if ((b % i == 0) && (t)) {
					c = i;

					for (int j = 2; j <=a; j++) {
						if (a % j == 0) {
							d = j;
							if (d == c) {
								System.out.println(j);
								t = false;
								break;
							}
						}
					}
				}

			}
		}
	}

		

	}

