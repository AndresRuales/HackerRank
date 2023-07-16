package Test;

public class Time_Conversion {
	public static void main(String[] args) {
		
		String hora = "08:57:22PM";
		String horaAtrapada = "";
		String horaFinal = "";

		char letraAm = hora.charAt(8);

		
		if (letraAm == 'A') {
			for(int i =1; i>=0;i--) {
				horaAtrapada = hora.charAt(i)+horaAtrapada;
			}
			if(horaAtrapada.equals("12")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "00"+horaFinal;
			} else if(horaAtrapada.equals("01")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "01"+horaFinal;
			} else if (horaAtrapada.equals("02")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "02"+horaFinal;
			}else if (horaAtrapada.equals("03")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "03"+horaFinal;
			}else if (horaAtrapada.equals("04")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "04"+horaFinal;
			}else if (horaAtrapada.equals("05")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "05"+horaFinal;
			}else if (horaAtrapada.equals("06")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "06"+horaFinal;
			}else if (horaAtrapada.equals("07")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "07"+horaFinal;
			}else if (horaAtrapada.equals("08")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "08"+horaFinal;
			}else if (horaAtrapada.equals("09")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "09"+horaFinal;
			}else if (horaAtrapada.equals("10")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "10"+horaFinal;
			}else if (horaAtrapada.equals("11")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "11"+horaFinal;
			}
		}
			
		if (letraAm == 'P') {
			for(int i =1; i>=0;i--) {
				horaAtrapada = hora.charAt(i)+horaAtrapada;
			}
			if(horaAtrapada.equals("12")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "12"+horaFinal;
			} else if(horaAtrapada.equals("01")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "13"+horaFinal;
			} else if (horaAtrapada.equals("02")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "14"+horaFinal;
			}else if (horaAtrapada.equals("03")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "15"+horaFinal;
			}else if (horaAtrapada.equals("04")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "16"+horaFinal;
			}else if (horaAtrapada.equals("05")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "17"+horaFinal;
			}else if (horaAtrapada.equals("06")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "18"+horaFinal;
			}else if (horaAtrapada.equals("07")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "19"+horaFinal;
			}else if (horaAtrapada.equals("08")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "20"+horaFinal;
			}else if (horaAtrapada.equals("09")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "21"+horaFinal;
			}else if (horaAtrapada.equals("10")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "22"+horaFinal;
			}else if (horaAtrapada.equals("11")) {
				for(int i =2; i<hora.length()-2;i++) {
					horaFinal = horaFinal+hora.charAt(i);
				}
				horaFinal = "23"+horaFinal;
			}
		}
		
		
		System.out.println(horaFinal);
		
		
	}
		
}

