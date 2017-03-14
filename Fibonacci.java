
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8,x=0,y=0,z=1;
for(int l=0;l<n;l++)
{
	
switch (l)
{
	case 0:
		x=0;
	//	System.out.print(l+",");
		break;
		
	case 1:
		x=1;
	//	System.out.print(l+",");
		break;
		
	default:
		x=y+z;
	//	System.out.print(x+",");
		y=z;
		z=x;
			
	}
}
System.out.print(x);
}
}
