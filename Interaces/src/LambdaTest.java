
public class LambdaTest {

	public static void main(String[] args) {
		ILambdaInterface obj=(a,b)->
		{
		System.out.println(a+b);
		};
obj.run(1,9);
}
}
