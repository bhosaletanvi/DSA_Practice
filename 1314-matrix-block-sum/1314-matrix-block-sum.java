class Solution {
    public int[][] matrixBlockSum(int[][] arr, int k) {
        int sum=0;
		int[][] ans = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				int top=i-k,bottom=i+k,left=j-k,right=j+k;
				//System.out.println(left+" "+top+" "+right+" "+bottom);

				if(top<=0){
					top=0;
				}
				if(left<=0){
					left=0;
				}
				if(bottom>=arr.length-1){
					bottom=arr.length-1;
				}
				if(right>=arr[0].length-1){
					right=arr[0].length-1;
				}
				//System.out.println(left+" "+top+" "+right+" "+bottom);

				for(int m=top;m<=bottom;m++){
					for(int n=left;n<=right;n++){
						sum+=arr[m][n];
					}
				}
				//System.out.println(i+" "+j+" "+sum);

				ans[i][j]=sum;
				sum=0;
			}
		}
		return ans;
    }
}