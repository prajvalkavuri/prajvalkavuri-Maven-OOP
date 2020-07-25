package tnewyear.newyear;
import java.lang.*;
import java.util.Scanner;
interface oper {
	void operationToPerform();
}
class ArraySorting implements oper
{
    public void operationToPerform()
    {
        int i,j;
        int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sie of array:");
	    int n = sc.nextInt();
	    System.out.println("Enter Array:");
	    int array[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        array[i] = sc.nextInt();
	    }
	    for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++) {
                if (array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
    	    System.out.println(array[i]);
        int max=array[0];
        for(i=0;i<n;i++)
            if(array[i]>max)
                max=array[i];
        System.out.println("Maximum Element"+" "+max);
    }
    void yearPrinting()
    {
    	System.out.println("NEW YEAR");
    }

}
class overriding extends ArraySorting
{
	void yearPrinting()
	{
		System.out.println("HAPPY NEW YEAR");
	}
}
class Maven-OOP {
    public static void main (String[] args) {
        ArraySorting s=new ArraySorting();
        s.operationToPerform();
        overriding r=new overriding();
        r.yearPrinting();
    }
}
