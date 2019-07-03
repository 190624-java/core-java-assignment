package assignment;

public class Q11 {
	
	public static float[] AccessFloats() {
		// should get 1.9
		float[] fs = new float[2];
		fs[0] = q11_otherpackage.OtherClass.NUMFLOAT1; // 1.9
		fs[1] = q11_otherpackage.OtherClass.NUMFLOAT2; //  7.71
		return fs;
	}
}
