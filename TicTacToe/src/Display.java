
public class Display {
	public void display(String arr[][])
	{
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+"|");
			}
			System.out.println();
		}
	}
	
}
