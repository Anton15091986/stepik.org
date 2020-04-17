class Merge_Arrays {
	public static int[] mergeArrays(int[] a1, int[] a2) {
		int[] a = new int[a1.length+a2.length];
		int count_a = 0;
		if(a1.length==0) return a2;
		if(a2.length==0) return a1;
		for(int i=0; i<a1.length; i++) {
			a[i]=a1[i];
			count_a=i;
		}
		if (a2[0]>=a[count_a]){
		 	for(int i=0; i<a2.length; i++){
				count_a++;
				a[count_a]=a2[i];
			}
		return a;
		}
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<count_a+1; j++) {
				if(a2[i]<=a[j]) {
					for(int k=count_a+1; k>j; k--) {
					a[k]=a[k-1];
					}
					count_a++;
					a[j]=a2[i];
					break;
				}
				if (j==count_a) {
					count_a++;
					a[count_a]=a2[i];
					break;
				}
			}
		}
		return a;
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