public class ComplexNumber {

	float re;
	float im;
	
	ComplexNumber()
	{
		this.re = 0;
		this.im = 0;
	}
	public float getReal()
	{
		return this.re;
	}
	public float getIm()
	{
		return this.im;
	}
	public void showNumber(ComplexNumber a)
	{
		System.out.println(a.re + " -- " + a.im);
	}
	ComplexNumber(float re,float im)
	{
		this.re = re;
		this.im = im;
	}
	public static void main(String[] args)
	{
		ComplexNumber number1 = new ComplexNumber(1,4);
		ComplexNumber number2 = new ComplexNumber(5,2);
		ComplexNumber number3 = new ComplexNumber();
		Operations o = new Operations();
		number3 = o.add(number1,number2);
		number3.showNumber(number3);
	}
	
}