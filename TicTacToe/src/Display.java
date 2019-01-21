package src;

public class Display {
	public char[] display(char arr[])
    {
        char check[]=new char[15];
        int ind=0;
        for(int index=0;index<arr.length;index+=3) {
            for(int i=index;i<index+3;i++)
            {
                System.out.print(arr[i]);
                check[ind++]=arr[i];
                if(i!=index+2)
                {
                    System.out.print('|');
                    check[ind++]='|';
                }
            }
            System.out.println();
        }
        return check;
    }
}
