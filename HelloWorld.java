import java.io.*;  

public class HelloWorld {
	public static int Add(String numbers)
	{
		String[] numberList = numbers.split("[,]", 0);
		int local_Sum = 0;
		
		for(String num: numberList)
		{
			local_Sum+=Integer.parseInt(num);
		}
		
		return local_Sum;
	}
	
	public static void main  (String args[]) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        int sum =0;
        while ((num = br.readLine()) != null) {
        	sum = sum + Add(num);
        	System.out.println(sum);
        }
         
    }

}
