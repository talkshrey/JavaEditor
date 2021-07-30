/* package codechef; // don't place package name! */
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    
	    int n = sc.nextInt();
	   
	  /* int red [] = new int [n+1];
	   int blue [] = new int [m+1];
	   int redspeed [] = new int [n+1];
	   int bluespeed []= new int [m+1]; */
	   
	   Map <Long, Integer> map = new HashMap<>(); 
	    int ans = 0 ;
	   
	   for(int i=1;i<=n;i++){
	     int  red = sc.nextInt();
	       int redspeed  = sc.nextInt();
	       
	       long multi = red * redspeed;
	       
	      
	       
	       if(map.containsKey(multi)){
	           int value = map.get(multi);
	           value ++ ;
	           map.replace(multi,value);
	       }
	       else  map.put(multi,1); ;
	       
	       

	   }
	    for(int i=1;i<=n;i++){
	      int blue  = sc.nextInt();
	     int  bluespeed = sc.nextInt();
	   long multi = blue*bluespeed;
	   
	       if (map.containsKey(multi) && map.get(multi)>0){
	           ans++ ;
	           int value = map.get(multi) ;
	           map.replace(multi,value--);
           
	       }
	       
	   }
	   
	   System.out.println(ans);
	   sc.close();
	   
	}
}

  
