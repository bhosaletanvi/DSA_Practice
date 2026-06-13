import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count=1,max=0;
		HashMap <Integer , Integer> hm = new HashMap<>();
		System.out.println("Enter m : ");
		int m = sc.nextInt();
	
		System.out.println("Enter n : ");
		int n = sc.nextInt();

		int [][] arr= new int[m][n];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
			arr[i][j]=sc.nextInt();
			}
		}
				System.out.println();

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		boolean rowzero=false,colzero=false;			
		for(int i=0;i<arr[0].length;i++){
			if(arr[0][i]==0){
				rowzero=true;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==0){
				colzero=true;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
			   if(arr[i][j]==0){
				arr[i][0]=0;
				arr[0][j]=0;
			    }
			}

		}


		for(int i=0;i<arr[0].length;i++){
			if(arr[0][i]==0){
				for(int j=1;j<arr.length;j++){
					arr[j][i]=0;
				}
			}
		}


		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==0){
				for(int j=1;j<arr[0].length;j++){
					arr[i][j]=0;
				}
			}
		}
		if(rowzero){
			for(int i=0;i<arr[0].length;i++){
				arr[0][i]=0;
			}	
		}
		if(colzero){
			for(int i=0;i<arr.length;i++){
				arr[i][0]=0;
			}	
		}

					System.out.println();

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	
	}
}