//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing
//Date -2/3/21

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
	//Create a variable and set it equal to the last item of the array
  	int a = ray.get(ray.size() - 1);
    //Create a variable to track the current array value
    int b = 0;
    //Create a boolean = false
    boolean c = false;
    //Use a for loop to loop each but the last element of the array
    for(int x = 0; x < (ray.size()-1); x ++)
    {
      //Set the current array value variable to the current value of the array
      b = ray.get(x);
      //If the current array value variable is equal to the last item of the array variable
      if(a==b)
      {
        //Set the boolean true
        c = true;
        //End if statement
      }
      //End loop
    }
    //Return boolean
    return c;
	}
}