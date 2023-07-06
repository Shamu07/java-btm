class Money
{
	String country;
	String currency;
	String denomication;
	String type;
	
	Money(String country)
	{
		System.out.println("Running class");
		this.country=country;
	}
	Money(String country,String currency)
	{
		this(country);
		System.out.println("Running class");
		this.currency=currency;
	}
	Money(String country,String currency,String denomication)
	{
		this(country,currency);
		System.out.println("Running class");
		this.denomication=denomication;
	}
	Money(String country,String currency,String denomication, String type)
	{
		this(country,currency,denomication);
		System.out.println("Running class");
		this.type=type;
	}
	
	
}