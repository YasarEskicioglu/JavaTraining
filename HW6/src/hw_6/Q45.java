package hw_6;

public class Q45  extends Forest {
	public Q45(long treeCount) {
		this.treeCount = treeCount+1;
	}
	
	public static void main(String[] birds) {
		System.out.print(new Q45(5).treeCount);
	}
}

class Forest {
	public long treeCount;
	public Forest(long treeCount) {
		this.treeCount = treeCount+2;
	}
}
