class InfosysRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main ");
		
		Infosys infosys=new Infosys("Narayana Murthy","Sudha Murthy",1981,335186);
		if(infosys!=null)
		{
			System.out.println("name of founder is :"+infosys.founderName);
		}
		else
		{
			System.out.println("running null");
		}
		System.out.println("name of founderwifename is :"+infosys.founderWifeName);
		System.out.println("name of founded is :"+infosys.founded);
		System.out.println("total empployees is :"+infosys.totalEmployees);
		
	}
}