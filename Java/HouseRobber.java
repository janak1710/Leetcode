public class HouseRobber {
	public int rob(int[] num) {
		// max money can get if rob current house
		int rob = 0;
		// max money can get if not rob current house
		int notrob = 0;
		for (int i = 0; i < num.length; i++) {
			// if rob current value, previous house must not be robbed
			int currob = notrob + num[i];
			// if not rob ith house, take the max value of robbed (i-1)th house
			// and not rob (i-1)th house
			notrob = Math.max(notrob, rob);
			rob = currob;
		}
		return Math.max(rob, notrob);
	}
}