package Test;

import java.util.ArrayList;
import java.util.List;

public class test1 {
	
	//ENTRADA --> LISTA DE TIPO Integer, sumar los positivos, negativos y ceros,
		//dividirlos en la longitud del arreglo.
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(4);
		
		Integer sumNegative =0;
		Integer sumPositive =0;
		Integer sumCero =0;
		
		
        arr.add(4);
        arr.add(5);
        arr.add(-1);
        arr.add(0);

        Integer longitud = arr.size();
        
        //For each
        
        for (Integer elemento: arr) {
   
        	
        	if (elemento<0) {
				sumNegative ++;
			} else if (elemento==0) {
				sumCero++;
			} else if (elemento>0) {
				sumPositive++;
			}
        }
        
        
        Double resultadoNegativos=sumNegative.doubleValue()/longitud.byteValue();
        Double resultadoPositivos=sumPositive.doubleValue()/longitud.byteValue();
        Double resultadoCeros=sumCero.doubleValue()/longitud.byteValue();

        String resultadoPositivo = String.format("%.6f", resultadoPositivos);
        String resultadoNegativo = String.format("%.6f", resultadoNegativos);
        String resultadoCero = String.format("%.6f", resultadoCeros);
        

        System.out.println(resultadoPositivo);
        System.out.println(resultadoNegativo);
        System.out.println(resultadoCero);
	}

}
