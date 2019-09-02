package ch4;

class Pro2{
	public static void main(String[] args)
	{
		int [] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		System.out.println("최대값: "+max(null));
		System.out.println("최대값: "+max(new int[] {}));
		int value = 5;
		System.out.println(value+"의 절대값: "+abs(value));
		value = -10;
		System.out.println(value+"의 절대값: "+abs(value));
	}
	
	static int max(int[] data)
	{
		if(data != null && data.length != 0) {
			int max_data = 0;
			int i = 0;
			
			while(i<data.length) {
				if(max_data < data[i]) {
					max_data = data[i];
				}
				i++;
			}
			
			return max_data;			
		}
		else {			
			return -999999;
		}
		
	}
	
	static int abs(int value) {
		if(value < 0) {
			return -value;
		}
		else {
			return value;
		}		
	}
}


