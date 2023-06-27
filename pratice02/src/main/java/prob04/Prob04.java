package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result = str.toCharArray();
		char[] tluser = new char[result.length];
		
		for(int i = 0; i < result.length; i++) {
			tluser[(result.length-1) - i] = result[i];
		}
		return tluser;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}
}