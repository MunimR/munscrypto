import java.util.Scanner;

public class encrypt_caesar {
	public static char addToChar(char c, int n) {
		int cVal = c;
		if (Character.isLowerCase(c)) {
			return (char) (97 + ((cVal - 97 + n) % 26));
		} else if (Character.isUpperCase(c)) {
			return (char) (65 + ((cVal - 65 + n) % 26));
		}
		return c;
	}

	public static String caesarShift(String m, int n) {
		String result = "";
		for (int i = 0; i < m.length(); i++) {
			char cur = m.charAt(i);
			result	+= addToChar(cur, n) + "";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter plain-text: "); 
		String encodedMsg = sc.nextLine();

		System.out.print("enter offset (1 - 25): "); 
		int offset = sc.nextInt() % 26;
		sc.close();

		System.out.println("cipher-text: " + caesarShift(encodedMsg, offset));

	}
}