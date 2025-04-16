/*3. accept number from keyboard, display all odd numbers between 1
and the given number*/

class OddNumber
{
	public int oddNum(int num)
	{
		for(int i=1;i<=num;i++)
			{
				if(i % 2 !=0)
				{
					System.out.println(i);
				}
			}
			return num;
	}
	public static void main(String args[])
	{
		if(args.length>0)
		{
			int num=Integer.parseInt(args[0]);
			System.out.println("odd numbers between 1 and " + num);
			OddNumber od = new OddNumber();
			od.oddNum(num);
		}
		else 
		{
		System.out.println("Few parameters");
		}
	}
}



