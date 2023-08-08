class kadanesAlgo {
	private static int maxSubArraySum(int a[]) {
		int size = a.length;
		int MaxSum = Integer.MIN_VALUE, CurrSum = 0;

		for (int i = 0; i < size; i++) {
			CurrSum = CurrSum + a[i];
			if (MaxSum < CurrSum)
				MaxSum = CurrSum;
			if (CurrSum < 0)
				CurrSum = 0;
		}
		return MaxSum;
	}

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Max sum in subarrays :  " + maxSubArraySum(a));
	}
}