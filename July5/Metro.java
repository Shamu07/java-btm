class Metro{
	
	String line;
	int distance;
	String start;
	String destination;
	int capacity;

	Metro(String line)
	{
		System.out.println("Running String in class");
		this.line=line;
	}
	
	Metro(String line, int distance){
		this(line);
		System.out.println("Running class");
		this.distance=distance;
	}
	
	Metro(String line, int distance, String start){
		this(line,distance);
		System.out.println("Running class");
		this.start=start;
	}
	Metro(String line, int distance, String start,String destination, int capacity){
		this(line,distance,start);
		System.out.println("Running class");
		this.destination=destination;
		this.capacity=capacity;
	}
	
}