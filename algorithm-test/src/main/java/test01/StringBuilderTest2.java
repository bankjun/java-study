package test01;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("lee");
	    
    	sb.append(true);
    	char[] c = {'a','b'};
    	sb.append(c);
    	
    	sb.append(123.1f);
    	sb.append(123.1);
    	sb.append(sb);
    	System.out.println(sb);
    	
    	sb.reverse();
    	System.out.println(sb.capacity());
    	sb.replace(2,4, "juno");
    	System.out.println(sb.substring(2,5));
    	
    	System.out.println(sb);
    	
    	StringBuffer sf = new StringBuffer("lee");
        
    	sf.append("lee");
    	
    	sf.reverse();
    	System.out.println(sf.capacity());
    	sf.replace(2,4, "juno");
    	System.out.println(sf.substring(2,5));
    	
    	System.out.println(sf);
    	
    	StringBuilder sb2 = new StringBuilder("leebabo");

    	sb2.replace(3,7, "juno");
    	
    	System.out.println(sb2);

	}

}
