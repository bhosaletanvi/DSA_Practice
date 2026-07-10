class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
		int temp[] = new int [arr1.length+arr2.length];
        int first=0,second=0,pointer=0;
        while(first<=arr1.length-1 && second <=arr2.length-1){
            if(arr1[first]<arr2[second]){
                temp[pointer]=arr1[first];
                first++;
                pointer++;
            }else{
                temp[pointer]=arr2[second];
                second++;
                pointer++;
            }
        }
        while(first<=arr1.length-1){
            temp[pointer]=arr1[first];
            first++;
            pointer++;
        }
        while(second<=arr2.length-1){
            temp[pointer]=arr2[second];
            second++;
            pointer++;
        }

		if(temp.length%2==0){
			return ((double)(temp[temp.length/2]+temp[temp.length/2-1])/2);
		} else{
			return (double)(temp[(temp.length-1)/2]);
		}

    }
}