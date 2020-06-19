package hw_10;


// Class name Big changed to the Q29
public class Q29 {


		/*A*/ public Q29(boolean stillIn) {
			super();
		}
	}

		
		public class Trouble extends Q29 {
		/*B*/ public Trouble()  {}
		/*C*/ public Trouble(int deep) {
			super(false);
			this();
		}
		
		/*D*/ public Trouble(String now, int... deep) {
			this(3);
		}
		/*E*/public Trouble (long deep) {
			this("check",deep);
		}
		/*F*/public Trouble (double test) {
			super(test>5 ? true : false);
		}
	}// B, C ,E givinig errors.
}
