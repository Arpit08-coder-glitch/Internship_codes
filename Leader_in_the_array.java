import java.io.*; 
import java.util.*; 
class Leader_in_the_array
{ 
    public static void main(String[] args)throws IOException{ 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the length"); 
        int n= Integer.parseInt(br.readLine()); 
        int[] arr=new int[n]; 
        ArrayList<Integer> arrli = new ArrayList<Integer>(); 
        for(int i=0;i<n;i++) 
        { 
            arr[i]=Integer.parseInt(br.readLine()); 
        } 
        int max=arr[n-1]; 
        arrli.add(max); 
        for(int i=n-1;i>-1;i--){ 
            if(arr[i]>max){ 
                max=arr[i]; 
                arrli.add(max); 
            } 
        } 
        for(int a:arrli){ 
            System.out.println(a); 
        } 
    } 
     
}