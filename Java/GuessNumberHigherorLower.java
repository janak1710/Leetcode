/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumberHigherorLower extends GuessGame {
    public int guessNumber(int n) {
        int i =1;
        while(i<=n){
            int mid = i + (n-i)/2;
            int guessNum = guess(mid);
            if(guessNum == 0){
                return mid;
            } else if (guessNum == 1){
                i = mid + 1;
            } else {
                n = mid - 1;
            }
        }
        return -1;
    }
}