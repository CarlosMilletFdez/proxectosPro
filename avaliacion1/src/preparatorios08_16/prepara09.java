package preparatorios08_16;

public class prepara09 {

	public static void main(String[] args) {
		
		byte a, c, e;
		short b, d, f;
		double x, y, z;
		
		x=78678;
	    a=(byte)x;
		b=(short)x;
		System.out.print("\n a: " + a + " b: " + b);
		
		y=87988 ;
		c=(byte)y;
		d=(short)y;
		System.out.print("\n c: " + c + " d: " + d);
		
		z=98901;
		e=(byte)z;
		f=(short)z;
		System.out.print("\n e: " + e + " f: " + f);
		
		
		
		//13142+65536=78678
				//22452+ 65536=87988
				//65536+(-32171)=33365 + 65536=98901

	}

}