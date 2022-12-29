
public class Pallindrame {
	static String isPallindrame(String S) {
		int i=0; int j=S.length()-1;
		while(i<j) {
			if(S.charAt(i)!=S.charAt(j)) return "not a pallindrame";
			i++;
			j--;
		}
		return S;
	}
	public static void main(String [] args) {
		System.out.println(isPallindrame("madam"));
		System.out.println(isPallindrame("java"));
	}

}
