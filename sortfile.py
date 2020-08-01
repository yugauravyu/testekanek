
import sys 

def printCheapestFlights(delhi_to_mumbai, mumbai_to_delhi, k): 
    n1 = len(delhi_to_mumbai)
    n2 = len(mumbai_to_delhi)
    if (k > n1*n2): 
        print("k pairs don't exist") 
        return
  
    index2 = [0 for i in range(n1)] 
  
    while (k > 0): 
        min_sum = sys.maxsize 
        min_index = 0
        for i1 in range(0,n1,1): 
            if (index2[i1] < n2 and delhi_to_mumbai[i1] + mumbai_to_delhi[index2[i1]] < min_sum): 
                min_index = i1 
                min_sum = delhi_to_mumbai[i1] + mumbai_to_delhi[index2[i1]] 
        print(delhi_to_mumbai[min_index],mumbai_to_delhi[index2[min_index]]) 
  
        index2[min_index] += 1
        k -= 1
  
if __name__ == '__main__': 
    delhi_to_mumbai = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]

    mumbai_to_delhi = [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75]
    k = 10
    printCheapestFlights( delhi_to_mumbai, mumbai_to_delhi, k) 
    
    
// time complexity of function is k*len(delhi_to_mumbai) i.e k*n;
