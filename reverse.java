import java.io.*;  
public class Reverse
{
  
  public static void main(String args[])throws IOException
  {
    
    String a;  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
    a=br.readLine();  
    char a1[]=a.toCharArray();  
    for(int i=a1.length-1;i>=0;i--)
    {            
      System.out.print(a1[i]); 
      }
      
      }
      }    
