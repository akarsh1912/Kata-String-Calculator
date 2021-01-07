import java.io.*;  

public class HelloWorld {
	public static int Add(String numbers)
	{
		int sum =0;
		String[] numberList = numbers.split("[,]", 0);
		for(String num: numberList)
		{
			sum+=Integer.parseInt(num);
		}
		return sum;
	}
	
	public static void main  (String args[]) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		System.out.println(Add(num));
         
    }

}
