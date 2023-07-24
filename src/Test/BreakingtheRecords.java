package Test;

import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {
	public static void main(String[] args) {
		
		
		List<Integer> scores = new ArrayList<>();
		
		scores.add(10);
		scores.add(5);
		scores.add(20);
		scores.add(20);
		scores.add(4);
		scores.add(5);
		scores.add(2);
		scores.add(25);
		scores.add(1);

		
		int longitud = scores.size();
		List<Integer> scoresResultado = new ArrayList<>();

		Integer sumaMax =0;
		Integer sumaMin = 0;
		Integer numeroMax = scores.get(0);
		Integer numeroMin = scores.get(0);
		
		for(int i =0;i<longitud-1;i++) {
			
			if(scores.get(i)<scores.get(i+1)) {
				if(scores.get(i)<numeroMin) {
					sumaMin++;
					numeroMin= scores.get(i);
				} else if (scores.get(i+1)>numeroMax) {
					sumaMax++;
					numeroMax=scores.get(i+1);
				}
			}
			if(scores.get(i)>scores.get(i+1)) {
				if(scores.get(i+1)<numeroMin) {
					sumaMin++;
					numeroMin= scores.get(i+1);
				} else if (scores.get(i)>numeroMax) {
					numeroMax++;
					numeroMax=scores.get(i);
				}
			}
		}
		
		scoresResultado.add(sumaMax);
		scoresResultado.add(sumaMin);
	

		
		
		
	}

}
