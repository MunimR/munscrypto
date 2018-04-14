import java.util.Scanner;

public class decrypt_caesar {
	public static char addToChar(char c, int n) {
		int cVal = c;
		if (Character.isLowerCase(c)) {
			return (char) (97 + ((cVal - 97 + n) % 26));
		} else if (Character.isUpperCase(c)) {
			return (char) (65 + ((cVal - 65 + n) % 26));
		}
		return c;
	}

	public static String decCaesarShift(String m, int n) {
		String result = "";
		for (int i = 0; i < m.length(); i++) {
			char cur = m.charAt(i);
			result	+= addToChar(cur, n) + "";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter cipher-text: "); 
		String encodedMsg = sc.nextLine();
		sc.close();

		for (int i = 1; i < 26; i++) {
			System.out.println(i + "\t" + decCaesarShift(encodedMsg, i));
		}

	}
}