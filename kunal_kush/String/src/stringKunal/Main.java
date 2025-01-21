package stringKunal;

public class Main {
	public static void main(String[] args) {
		String a="sahil";
		String b="sahil";
		// it will save in string pool so a and b are referring to same object
		System.out.println(a==b);// both are referring to same object;
		a="saurabh"; // now a is referring to "saurabh" and "sahil" is collected by garbage collector;
		String aa=new String("sahil");
		String bb=new String("sahil");
		//now these will save outside the string-pool so it will create two different object with the name sahil;
		System.out.println(aa==bb);
		System.out.println('a'+'b'); // it will converted to asscai value
		System.out.println("a"+"b"); // it will concanted
		System.out.println((char)('a'+3)); // it will give d because a+3 = d;
		System.out.println("a"+1); // Integer will be converted to its wrapper class 
		StringBuilder builder =new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder);
		
	}
}

 