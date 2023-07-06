class Infosys
{
	String founderName;
	String founderWifeName;
	int founded;
	int totalEmployees;
	
	Infosys(String founderName)
	{
		System.out.println("Running String in class");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName)
	{
		this(founderName);
		System.out.println("Running String in class");
		this.founderWifeName=founderWifeName;
	}
	Infosys(String founderName,String founderWifeName,int founded)
	{
		this(founderName,founderWifeName);
		System.out.println("Running String,String,int in class");
		this.founded=founded;
	}
	Infosys(String founderName,String founderWifeName,int founded,int totalEmployees)
	{
		this(founderName,founderWifeName,founded);
		System.out.println("Running String.String,int,int in class");
		this.totalEmployees=totalEmployees;
	}
}