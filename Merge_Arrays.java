class Merge_Arrays {
	public static int[] mergeArrays(int[] a1, int[] a2) {
		int i, j, k;
		i=j=k=0;
		int len_a1=a1.length;
		int len_a2=a2.length;
		int[] a = new int[len_a1 + len_a2];
		if(len_a1==0) return a2;
		if(len_a2==0) return a1;
		while(i<len_a1 && j<len_a2) {
			if(a1[i]<=a2[j]) {
				a[k]=a1[i];
				k++;
				i++;
			}
			else {
				a[k]=a2[j];
				k++;
				j++;
			}
		}
		if(i==len_a1) {
			while(j<len_a2) {
				a[k]=a2[j];
				k++;
				j++;
			}
			return a;
		}
		else {
			while(i<len_a1) {
				a[k]=a1[i];
				k++;
				i++;
			}
		return a;
		}
	}
	public static void main (String[] args) {
		int[] arr1 =  {1,3,5,7};
		int[] arr2 =  {2,4,6,8,9,9};
		int[] arr3 = (mergeArrays(arr1, arr2));
		for (int x: arr3) {
			System.out.println(x);
		}
	}
}