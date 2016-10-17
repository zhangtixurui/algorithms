package algorithmtest;

public class Bsearch {
	public int bsearch(int[] R,int low,int high,int k){
		int mid;
		int count=0;
		while(low<=high){
			mid=(low+high)/2;
			if(R[mid]==k){
				System.out.println(R[mid]);
				return R[mid];
				
			}
			else if(k<R[mid]){
				high=mid-1;
			}
			else if(k>R[mid]){
				low=mid+1;
			}
		}		
		return 0;		
	}
	public static void main(String[] args) {
		int[] R={1,3,4,5,7,9};
		Bsearch b=new Bsearch();
		b.bsearch(R, 0, 5, 7);
		
	}

}
