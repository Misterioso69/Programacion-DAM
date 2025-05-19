package Ej2;

public class Cojunto extends Lista{

	@Override
	public void insetnum_final(int num) {
		// TODO Auto-generated method stub
		if (obtenerposicion_num(num)==-1) {
			super.insetnum_final(num);
		}
	}

	@Override
	public void insertnum_principio(int num) {
		// TODO Auto-generated method stub
		if (obtenerposicion_num(num)==-1) {
			super.insertnum_principio(num);
		}
	}

	@Override
	public void insertnum_indice(int ind, int num) {
		// TODO Auto-generated method stub
		if(obtenerposicion_num(num) == -1) {
			super.insertnum_indice(ind, num);
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cojunto otroConjunto = (Cojunto) obj;
        if (this.num_elementos() != otroConjunto.num_elementos()) {
            return false;
        }
        for (int i = 0; i < this.num_elementos(); i++) {
            if (otroConjunto.obtenerposicion_num(this.obtenernum_indice(i)) == -1) {
                return false;
            }
        }
        return true;
    }
	
	public  boolean esNumero(Object a) {
        return a instanceof Integer || a instanceof Double || a instanceof Long || a instanceof Float;
    }
	
	public  boolean sumar(Object a ,Object b) {
		if ( a instanceof String && b instanceof String) {
			System.out.println((String)a+(String)b);
			return true;
		}else if (esNumero(a) && esNumero(b)) {
			double suma = (((Number)a).doubleValue() + ((Number)b).doubleValue());
			System.out.println(suma);
			return true;
		}else {
			System.out.println("No sumables");
			return false;
		}
	}
	
	
}
