import java.util.Random;

public class Jar{
      public static final int MAX_TRIES = 5;
      private String mItem;
      private int mLimit;
      private int mGuess;
      private static int mTries=MAX_TRIES;
      private int mActualNumber;
      private boolean mHit=false;
      
      
      public Jar(String item,int maxlimit){
        mItem=item; 
        mLimit=maxlimit;
        fill(maxlimit);
      }
  
      public int getLimit(){
        int limit=mLimit;
        return limit;
      }
  
      public String getItem(){
        String item=mItem;
        return item;
      }
  
      public int getActualNum(){
        int actualNum=mActualNumber;
        return actualNum;
      }
  
      public int getGuess(){
        int playerGuess=mGuess;
        return playerGuess;
      }
  
  //    public boolean getmHit(){
    //    hit =  mHit;
      //  return hit;
      //}
    
  
   public boolean isValidGuess(String guess){
     
        
       if (guess.equals("0")){
       throw new IllegalArgumentException("Guess cannot be 0");
       }
 
     int intGuess = Integer.parseInt(guess);
    
    if(intGuess > getLimit() ){
      throw new IllegalArgumentException("Error: Guess exceeds the limit");
    } else{
        mGuess = intGuess;
        return true;  
     }
   }
  
   public int isChance(){
   return mTries;
   }
  
   public int attempts(){
   int used =  MAX_TRIES - mTries;
    return used;
   }
  
   public boolean isHit(){
    
    if(mGuess != mActualNumber){
      mTries = mTries - 1;
      throw new IllegalArgumentException("Wrong Guess !"); 
    } else{
      
      return true;  
    }
   }
  
       public void fill(int upperlimit){
       Random random = new Random(); 
       int someNumber=random.nextInt(upperlimit) + 1;
       mActualNumber = someNumber;
       //System.out.printf("%d %s in the Jar.\n", someNumber, mItem);
      }
  
     
    
    
}