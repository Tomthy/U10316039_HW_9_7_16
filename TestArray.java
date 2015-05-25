public class TestArray{
	public static void main(String[] args){
		
		//Create an array and initialize it
		int[][] originArr = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		//Use a method to sort
		sort(originArr);
		
		//Print the whole array
		for(int i = 0;i < 6;i++){
			for(int j = 0 ;j < 2 ; j++){
				System.out.print(originArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//A sort method with the select sort
	public static void sort(int m[][]){
		
		//for loop
		for(int row = 0 ;row < m.length - 1;row++){
				
				//Use an one dimension array to store one row 
				int[] currentMin = m[row];
				//A variable to store the index of the array
				int currentRowIndex = row;
			
				//Use the for loop to find the smallest value
				for(int j = row+1;j < m.length;j++){
					
					//To determine the smallest value and store it 
					if(currentMin[0] > m[j][0]){
						currentMin = m[j];
						currentRowIndex = j;
					}
					//If the same column has the same value, compare the next column
					else if(currentMin[0] == m[j][0]){
						//If the former is greater,store the latter 
						if (currentMin[1] > m[j][1]){
							currentMin = m[j];
							currentRowIndex = j;
						}
					}
				}
				
				//If the index change,means there is a smaller one,then switch their location
				if(currentRowIndex != row){
					m[currentRowIndex] = m[row];
					m[row] = currentMin;
				}
		}
	}
}

