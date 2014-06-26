package karatmult;
import java.util.*;
import java.lang.Math;
import java.math.*;
public class karatimp {
	private int a;
	private int b;
	private int c;
	private int d;
	private int slena;
	private int slenb;
	private int la;
	private int lb;

	public karatimp()
	{
		
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public void setC(int c)
	{
		this.c=c;
	}
	public void setD(int d)
	{
		this.d=d;
	}
	public int getA()
	{
		return(this.a);
	}
	public int getB()
	{
		return(this.b);
	}
	public int getC()
	{
		return(this.c);
	}
	public int getD()
	{
		return(this.d);
	}
	public int getLen()
	{
		return(this.la);
	}

	public void splitInt(int num1,int num2)
	{
		int lena=String.valueOf(num1).length();
		int lenb=String.valueOf(num2).length();
		int na=(int)(lena/2);
		int nb=(int)(lenb/2);
		this.a=(int)(num1/Math.pow(10, na));
		this.b=num1%(int)Math.pow(10, na);
		this.c=(int)(num2/Math.pow(10, nb));
		this.d=num2%(int)Math.pow(10, nb);
		this.slena=na;
		this.slenb=nb;
		this.la=lena;
		this.lb=lenb;
	}
	public String multiply()
	{

	   BigInteger bigsumformer= new BigInteger(String.valueOf(this.a+this.b));
	   BigInteger bigsumlater= new BigInteger(String.valueOf(this.c+this.d));
	   BigInteger inter=bigsumformer.multiply(bigsumlater);
	   BigInteger former=(new BigInteger(String.valueOf(this.a))).multiply(new BigInteger(String.valueOf(this.c)));
	   BigInteger later=(new BigInteger(String.valueOf(this.b))).multiply(new BigInteger(String.valueOf(this.d)));
	   BigInteger first = new BigInteger((new BigInteger(String.valueOf((int)Math.pow(10,2*this.slena))).multiply(former)).toString());
	   BigInteger second=inter.subtract(former.add(later)).multiply(new BigInteger(String.valueOf((int)Math.pow(10, this.slena))));
	   BigInteger result=first.add(second.add(later));
	   return(result.toString());
	}
}
