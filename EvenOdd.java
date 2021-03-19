/*Name- Rahul Dey
  Sec-B
  Roll-63*/
class EvenOdd
{
	public static void main(String rahul[])
	{
		int i,count1=0,count2=0,m=0,n=0;
		float avg1,avg2;
		for(i=0;i<rahul.length;i++)
		{
			if(Integer.parseInt(rahul[i])%2==0)
			{
				m=m+Integer.parseInt(rahul[i]);
				count1++;
			}
			else
			{
				n=n+Integer.parseInt(rahul[i]);
				count2++;
			}
		}
		avg1=m/count1;
		avg2=n/count2;
		System.out.println("Sum of even number is "+m);
		System.out.println("Average of even number is "+avg1);
		System.out.println("Sum of odd number is "+n);
		System.out.println("Average of odd number is "+avg1);
	}
}