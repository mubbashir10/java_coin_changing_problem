//importing required packages
import java.util.*;


public class CoinChanging{

    //references 
    private int ticks;
    private int coinsGreedy;
    private int coinsDynamicPro;
    private int[] set;

    //greed algorithm implementation
    public int greedyAlgorithm(int maxAmount, int ticks){
        
        //base case for recursion
        if(maxAmount==0)               
            return ticks;
        
        //highest number
        else if(maxAmount>=25){
            ticks = ticks + 1;                          
            ticks = greedyAlgorithm(maxAmount-25, ticks);
        }     
        
        //greater than 10
        else if(maxAmount>=10){
            ticks = ticks + 1;
            ticks = greedyAlgorithm(maxAmount-10, ticks);
        }     
        
        //greater than 5
        else if(maxAmount>=5){
            ticks = ticks + 1;
            ticks = greedyAlgorithm(maxAmount-5, ticks);
        }      
        
        //greater than 1
        else if(maxAmount>=1){
            ticks = ticks + 1;
            ticks = greedyAlgorithm(maxAmount-1, ticks);
        }      
    
        //returning final count
        return ticks;                  
    }
  
    
    //dynamic programming algorithm
    public int dynamicProgram(int maxAmount, int[] set){

       //temp set
       int[] tmpSet = new int[maxAmount+1];
       
       //for maxAmount 0
       tmpSet[0]= 0;
       
       //filling array with max value
       for(int i = 1; i <= maxAmount; i++)
           tmpSet[i] = Integer.MAX_VALUE;
       
       
       for(int i = 1; i <= maxAmount; i++)
           for(int j = 0; j < set.length; j++)
               //if tick value is less than maxAmount
               if((i >= set[j])&& (tmpSet[i-set[j]]+1 < tmpSet[i])) 
                   //save smaller value
                   tmpSet[i] = tmpSet[i-set[j]]+1;                 
        
       //returning ticks
       return tmpSet[maxAmount];

    }

    public static void main(String[] args) {
        
        //making objects
        Scanner input = new Scanner(System.in);
        CoinChanging cc = new CoinChanging();
        
        //user input
        System.out.println("Enter max amount:");
        int maxAmount = input.nextInt();

        //initializing variables
        cc.ticks = 0;
        cc.coinsGreedy = 0;
        cc. coinsDynamicPro = 0;
        cc.set = new int[4];
        
        //filling set
        cc.set[0] = 1;
        cc.set[1] = 5;
        cc.set[2] = 10;
        cc.set[3] = 25;

        //calling greedy algorithm        
        cc.coinsGreedy = cc.greedyAlgorithm(maxAmount,cc.ticks);                             
        System.out.println("\nCoins Used (Greedy):\t\t"+cc.coinsGreedy);
        
        //calling dynamic programming algorithm
        cc.coinsDynamicPro = cc.dynamicProgram(maxAmount,cc.set);                                 
        System.out.println("Coins Used (Dynamic Pro):\t"+cc.coinsDynamicPro+"\n");
        
    }
    
}
