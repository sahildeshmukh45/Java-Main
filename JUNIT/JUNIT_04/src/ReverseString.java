
public class ReverseString {
	static String ReverseString(String str) {
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans=ans+str.charAt(i);
		}
		return ans;
	}

}

