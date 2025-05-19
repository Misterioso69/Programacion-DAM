package CoberturaDeCodigo;


public class BibliotecaDeFunciones {
	
	static boolean esCapicua(int numIntrodInt) throws Exception{
		String numIntrodString = String.valueOf(numIntrodInt), numVolteado = voltea(numIntrodInt);
		boolean esCapicuaONo = false;
		
		if (numIntrodInt < 0) {
			throw new Exception ("No puedes introducir numeros negativos");
		}
		if(numIntrodString.equals(numVolteado)) {
			esCapicuaONo = true;
		}
		
		return esCapicuaONo;
	}
	static boolean esPrimo(int numIntrod) {
		boolean esPrimoONo = true;
		int posDivI = numIntrod/2;
		while(esPrimoONo && posDivI>1) {
			if(numIntrod%posDivI==0) {
				esPrimoONo = false;
			}
			
		posDivI--;
		}

		return esPrimoONo;
	}
	
	static int siguientePrimo(int numIntrod) {
		int numPrimoSiguiente=0, posDivI;
		boolean esPrimoONo = false;
		
		for(int i=numIntrod+1; !esPrimoONo; i++) {
			posDivI = i/2;
			
			esPrimoONo = true;
		
			while(esPrimoONo && posDivI>1) {
			
				if(i%posDivI==0) {
					esPrimoONo = false;
				}
				
			posDivI--;
			}
			
			if(esPrimoONo) {
				numPrimoSiguiente = i;
			}
		}
		
		return numPrimoSiguiente;
	}

	static int digitos(int numIntrod) {
		int cantDigitos = (int)(Math.log10(numIntrod)+1);
		
		return cantDigitos;
	}
	
	static String voltea(int numIntrodInt) {
		String numIntrodString = String.valueOf(numIntrodInt), numVolteado = "";
		int longitudNumString = numIntrodString.length();
		
		for(int i=longitudNumString-1; i>=0; i--) {
			numVolteado += String.valueOf(numIntrodString.charAt(i));
		}
		
		return numVolteado;
	}
	
	
	static String digitoN(int numIntrodInt, int posNum) {
		String numIntrodString = String.valueOf(numIntrodInt), digitoPosN = String.valueOf(numIntrodString.charAt(posNum));		
		
		return digitoPosN;
	}
	
	
	static String quitaPorDetras(int numIntrodInt, int cantCifrasQuitadas) {
		String numIntrodString = String.valueOf(numIntrodInt);
		String numNuevo = numIntrodString.substring(0,(numIntrodString.length()-cantCifrasQuitadas));

		
		if(numNuevo.equals("")) {
			numNuevo = "0";
		}
		
		return numNuevo;
	}
	
	
	static String quitaPorDelante(int numIntrodInt, int cantCifrasQuitadas) {
		String numIntrodString = String.valueOf(numIntrodInt);
		String numNuevo = numIntrodString.substring(cantCifrasQuitadas,(numIntrodString.length()));
		
		if(numNuevo.equals("")) {
			numNuevo = "0";
		}
		
		return numNuevo;
	}
	

	static String pegaPorDetras(int numIntrodOrigInt, int numIntrodPegadoInt) {
		String numIntrodOrigString = String.valueOf(numIntrodOrigInt);
		String numIntrodPegadoString = String.valueOf(numIntrodPegadoInt);
		
		String numNuevo = numIntrodOrigString+numIntrodPegadoString;
		
		return numNuevo;
	}
	
	
	static String pegaPorDelante(int numIntrodOrigInt, int numIntrodPegadoInt) {
		String numIntrodOrigString = String.valueOf(numIntrodOrigInt);
		String numIntrodPegadoString = String.valueOf(numIntrodPegadoInt);
		
		String numNuevo = numIntrodPegadoString+numIntrodOrigString;
		
		return numNuevo;
	}
}