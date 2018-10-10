
public class QuadraticEquation {

	public static void main(String[] args) {
		double a=3,b=4,c=1,firstPart,secondPart,root1,root2;
		
		firstPart = -(b/2);
		if((Math.pow(b, 2)-4*a*c)<0)
			System.out.println("Roots not real");
		else{
			secondPart=Math.sqrt(Math.pow(b, 2)-4*a*c)/2;
			root1 = firstPart+secondPart;
			root2=firstPart-secondPart;
			System.out.println("ROOT 1 : "+root1+" ROOT 2 : "+root2);
		}
	}

}
