package gamelang;

public interface Value {
	public String toString();
	static class NumVal implements Value {
		private double _val;
	    public NumVal(double v) { _val = v; } 
	    public double v() { return _val; }
	    public String toString() { 
	    	int tmp = (int) _val;
	    	if(tmp == _val) return "" + tmp;
	    	return "" + _val; 
	    }
	}
	static class UnitVal implements Value {
		public static final UnitVal v = new UnitVal();
	    public String toString() { return "unit"; }
	}
	static class StrVal implements Value {
		private final String _val;
	
		public StrVal(String v) {
			_val = v;
		}
	
		public String s() {
			return _val;
		}
	
		public String toString() {
			return _val;
		}
	}
}

