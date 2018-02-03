package calculadoraJUnit;

/**
 * @author aortiz16 
 * @category Modificaciones adicionales
 * @author profesor
 * @version 2.0
 *
 */
	public class Calculadora {
		private int num1;
		private int num2;
		public Calculadora (int a , int b){
			num1=a;
			num2=b;
		}
		public int suma(){
			int res=num1+num2;
			return res;
		}
		public int resta(){
	// original:		int res=num1+num2;//error intencionado
			int res=num1-num2;//error modificado y corregido
					return res;
		}
		public int multiplica(){
			int res=num1*num2;
			return res;
		}
		public int divide(){
	//		int res=num1+num2;//error intencionado
			if (num2 == 0 ) { // dividor = 0 -> lanza 1 excepcion
				throw new java.lang.ArithmeticException("dividido por 0??");
			//   int  res = 0;
			}
			if (num1 == 0 ) // dividor = 0 -> lanza 1 excepcion
				throw new java.lang.ArithmeticException("dividir el  0??");
			else {
				int res=num1/num2;//error modificado y corregido
				return res;
			}

		}
}


