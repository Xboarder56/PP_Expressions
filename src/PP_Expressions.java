/**
 * PP_Expressions.java
 * @author Garrett J. Beasley
 * 10/20/2014
 */


public class PP_Expressions
{
	public static void main(String[] args) 
	{
		int a=1, b=2, c=3, d=5;
		boolean answerTF;
		int answerInt;
		
		System.out.println("");
		System.out.println("Section 1");
		answerTF = (b > c);
		System.out.println("#1 " + answerTF);
		answerTF = b*c<=5;
		System.out.println("#2 " + answerTF);
		answerTF = d!=d;
		System.out.println("#3 " + answerTF);
		answerInt = d / c;
		System.out.println("#4 " + answerInt);
		answerInt = c /d;
		System.out.println("#5 " + answerInt);
		answerTF = a *c >= 3;
		System.out.println("#6 " + answerTF);
		answerTF =  a / b == 0;
		System.out.println("#7 " + answerTF);
		answerInt = d%c;
		System.out.println("#8 " + answerInt);
		answerInt = d%3/b;
		System.out.println("#9 " + answerInt);
		answerInt = d*4%c;
		System.out.println("#10 " + answerInt);
		answerInt = (c*b)%(2+b);
		System.out.println("#11 " + answerInt);
		answerTF = (a - b * d) <= (-d * 2);
		System.out.println("#12 " + answerTF);
		answerTF = b + c == d || b - a == c;
		System.out.println("#13 " + answerTF);
		answerTF = a < b && d < b + c;
		System.out.println("#14 " + answerTF);
		answerTF = a != b && !(a > b) || a == b;
		System.out.println("#15 " + answerTF);
		
		System.out.println("");
		System.out.println("Section 2");	
		boolean e = true, f = true, g = false;
		answerTF= g||g;
		System.out.println("#1 " + answerTF);
		answerTF= e&&!e;
		System.out.println("#2 " + answerTF);
		answerTF=  e||!e;
		System.out.println("#3 " + answerTF);
		answerTF=  (e==f)&&!(f==g);
		System.out.println("#4 " + answerTF);
		answerTF=  g || !(e || g && f);
		System.out.println("#5 " + answerTF);
		
		System.out.println("");
		System.out.println("Section 3");
		String s = "Java", t ="Rocks"; int one = 33, two = 44;
		System.out.println("#1 " + s + t);
		System.out.println("#2 " + s+s+t);
		System.out.println("#3 " + s + t + one + two);
		System.out.println("#4 " + s + (one + two));
		System.out.println("#5 " + (t + one) + s + (one + two) + two);
		
	}
}