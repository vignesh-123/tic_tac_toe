
public class Display {
	public void display(char arr[])
	{
		for(int index=0;index<arr.length;index+=3) {
			for(int i=index;i<index+3;i++)
			{
				System.out.print(arr[index]+"|");
			}
			System.out.println();
		}
	}
	
}
