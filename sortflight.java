import java.io.*; 
   
public class KSmallestPair 
{ 
    
    static void printCheapestFlights(int delhi_to_mumbai[],int mumbai_to_delhi[], int k) 
    { 
        int n1 = delhi_to_mumbai.length;
        int n2 = mumbai_to_delhi.length;
        if (k > n1*n2) 
        { 
            System.out.print("not present k pairs"); 
            return ; 
        } 
       
        int index2[] = new int[n1]; 
       
        while (k > 0) 
        { 
            int min_sum = Integer.MAX_VALUE; 
            int min_index = 0; 

            for (int i1 = 0; i1 < n1; i1++) 
            { 
                if (index2[i1] < n2 &&  
                    delhi_to_mumbai[i1] + mumbai_to_delhi[index2[i1]] < min_sum) 
                { 
                    min_index = i1; 
                    min_sum = delhi_to_mumbai[i1] + mumbai_to_delhi[index2[i1]]; 
                } 
            } 
       
            System.out.print("(" + delhi_to_mumbai[min_index] + ", " + 
                            mumbai_to_delhi[index2[min_index]]+ ") "); 
       
            index2[min_index]++; 
            k--; 
        } 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int delhi_to_mumbai[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
 

        int mumbai_to_delhi[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};
 
        int k = 10; 
        printCheapestFlights( delhi_to_mumbai, mumbai_to_delhi, k); 
    } 
} 



//time complexity of method is k*length of array i.e k*n
