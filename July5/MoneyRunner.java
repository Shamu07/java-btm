class MoneyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in MoneyRunner");
		Money money=new Money("India","Rupees","five hundread","note");
		System.out.println("ciuntry name is : "+money.country);
		
		if(money!=null)
		{
			System.out.println("currency name is : "+money.currency);
		}
		else
		{
			System.out.println("running null");
		}
		
		System.out.println("denomication name is : "+money.denomication);
		System.out.println("type name is : "+money.type);
	}
}