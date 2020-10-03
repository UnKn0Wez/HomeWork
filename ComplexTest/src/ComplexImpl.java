
public class ComplexImpl{
	public String add(float a,float b,float c,float d) {
		float jia1=a+c;
		float jia2=b+d;
		String jia3=""+jia1+" + "+""+jia2;
		return ""+jia3;
	}
	public String sub(float a,float b,float c,float d) {
		float jian1=a-c;
		float jian2=b-d;
		String jian3=""+jian1+" + "+""+jian2;
		return ""+jian3;
	}
	public String mul(float a,float b,float c,float d) {
		float cheng1=a*c-b*d;
		float cheng2=b*c+a*d;
		String cheng3=""+cheng1+" + "+""+cheng2;
		return ""+cheng3;
	}
	public String div(float a,float b,float c,float d) {
		float chu1=(a*c+b*d)/(c*c+d*d);
		float chu2=(b*c-a*d)/(c*c+d*d);
		String chu3=""+chu1+" + "+""+chu2;
		return ""+chu3;
	}




	

}
