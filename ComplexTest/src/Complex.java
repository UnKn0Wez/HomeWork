import java.util.Scanner;
public class Complex{
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.printf("�����븴��A��ʵ��=");
		float a=scan1.nextFloat();
		System.out.printf("�����븴��A������=");
		float b=scan1.nextFloat();
		System.out.printf("�����븴��B��ʵ��=");
		float c=scan1.nextFloat();
		System.out.printf("�����븴��B������=");
		float d=scan1.nextFloat();
		ComplexImpl c1=new ComplexImpl();
		System.out.println("A+B="+c1.add(a, b, c, d)+"i");
		ComplexImpl c2=new ComplexImpl();
		System.out.println("A-B="+c2.sub(a, b, c, d)+"i");
		ComplexImpl c3=new ComplexImpl();
		System.out.println("A*B="+c3.mul(a, b, c, d)+"i");
		ComplexImpl c4=new ComplexImpl();
		System.out.println("A/B="+c4.div(a, b, c, d)+"i");
	} 
} 