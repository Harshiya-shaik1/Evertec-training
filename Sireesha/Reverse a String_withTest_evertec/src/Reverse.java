class Resverse{
	static String reverse(String S) {
		String s1="";
		for(int i=S.length()-1;i>=0;i-- ) {
			s1+=S.charAt(i);
		}
		return s1;
		
	}
	public static void main(String [] args) {
		System.out.println(reverse("Sireesha"));
	}
}

