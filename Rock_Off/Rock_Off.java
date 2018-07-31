public class Solution
{
    public static String solveRockOff(final int[] alice, final int[] bob)
    {
    	int scoreAlice = 0;
    	int scoreBob = 0;
      String aliceWon = ": Alice made \"Kurt\" proud!";
      String bobWon = ": Bob made \"Jeff\" proud!";
      String scoreDraw = ": that looks like a \"draw\"! Rock on!";

    	for(int i = 0; i < alice.length;i++){
    		if(alice[i] > bob[i]){
          scoreAlice += 1;
        }else if(alice[i] < bob[i]){
          scoreBob += 1;
        }
    	}
        return (scoreAlice > scoreBob) ? scoreAlice + ", " + scoreBob + aliceWon : (scoreBob > scoreAlice) ? scoreAlice + ", " + scoreBob + bobWon : scoreAlice + ", " + scoreBob + scoreDraw;
    }
}
