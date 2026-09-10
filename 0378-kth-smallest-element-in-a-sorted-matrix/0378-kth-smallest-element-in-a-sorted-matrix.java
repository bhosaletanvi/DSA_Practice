class Solution {
    public int kthSmallest(int[][] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     int c=1;
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i][0]);
    //         pq.offer(arr[i][0]);
            
    //     }
    //     for(int i=1;i<arr[0].length;i++){
    //         if(k==c){
    //             break;
    //         }
    //         pq.poll();
    //         c++;
    //         for(int j=0;j<arr.length;j++){
    //             pq.offer(arr[j][i]);
                
    //             if(k==c){
    //                 break;
    //             }
    //             pq.poll();
    //             c++;
    //         }
    //         // if(k==c){
    //         //     break;
    //         // }
    //     }
    //     System.out.print(pq.peek());
    //     return pq.peek();
    // }

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            pq.offer(arr[i][j]);
        }
    }
    for(int i=1;i<k;i++){
        pq.poll();
    }
    return pq.peek();
    }
}