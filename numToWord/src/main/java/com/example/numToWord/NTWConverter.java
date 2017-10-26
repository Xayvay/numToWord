package com.example.numToWord;

public class NTWConverter {
	
	public NTWConverter(){
		
	}

	public String calculatePlace(int x){
		String rv = "";
		
		if(x >= 1000){
			rv = "Thousand";
		} else if(x < 1000 && x >= 100){
			rv = "Hundred";
		} else if (x < 100 && x >= 20) {
			rv = "Tenths";
		} else if (x < 20 && x >=10) {
			rv = "Teens";
		} else if (x < 10 && x >=1)  {
		 	rv = "Ones";
		} else {
			rv = "";
		}
		
		return rv;
	}
	
	public String calculateOnesPlace(int x){
		String rv = "";
		//Make this into a map BRO!
		x = (int) Math.floor(x);
		
		if(Math.floor(x) == 1){
			rv = "One";
		} else if(Math.floor(x) == 2){
			rv = "Two";
		}else if(Math.floor(x) == 3){
			rv = "Three";
		}else if(Math.floor(x) == 4){
			rv = "Four";
		}else if(Math.floor(x) == 5){
			rv = "Five";
		}else if(Math.floor(x) == 6){
			rv = "Six";
		}else if(Math.floor(x) == 7){
			rv = "Seven";
		}else if(Math.floor(x) == 8){
			rv = "Eight";
		}else if(Math.floor(x) == 9){
			rv = "Nine";
		}
		
		return rv;
	}

	
	public String calculateUnderAHundred(int x){
		String rv = "";
		if(x < 100 && x >= 90){
			rv = "Ninety";
		} else if(x < 90 && x >= 80){
			rv = "Eighty";
		}else if(x < 80 && x >= 70){
			rv = "Seventy";
		}else if(x < 70 && x >= 60){
			rv = "Sixty";
		}else if(x < 60 && x >= 50){
			rv = "Fifty";
		}else if(x < 50 && x >= 40){
			rv = "Fourty";
		}else if(x < 40 && x >= 30){
			rv = "Thirty";
		}else if(x < 30 && x >= 20){
			rv = "Twenty";
		}
		return rv;
	}
	
	public String calculateTeens(int x){
		String rv  = "";
		
		if(x == 19){
			rv = "Nineteen";
		} else if(x == 18){
			rv = "Eightteen";
		}else if(x == 17){
			rv = "Seventeen";
		}else if(x == 16){
			rv = "Sixteen";
		}else if(x == 15){
			rv = "Fifteen";
		}else if(x == 14){
			rv = "FourTeen";
		}else if(x == 13){
			rv = "Thirteen";
		}else if(x == 12){
			rv = "Twelve ";
		}else if(x == 11){
			rv = "Eleven";
		}else if(x == 10){
			rv = "Ten";
		}
		return rv;
	}
	
	
	public String numberToWord(int x){
		String rv = "";
		
		if(calculatePlace(x) == "Thousand"){
			rv = returnThousands(x);
		}else if (calculatePlace(x) == "Hundreds"){
			
		}else if (calculatePlace(x) == "Tenths"){
			
		}else if (calculatePlace(x) == "Teens"){
			
		}else{
			
		}
		
		return rv;
		
	}
	
	public String returnThousands(int x){
		String rv = "";
		String place = "";
		int t = (int) Math.floor(x/1000);
		int p =  x - (t*1000);
		int h = p - ((int)Math.floor(p/100) * 100);
		int r = h - ((int)Math.floor(h/10) * 10);
		
		if(calculatePlace(h) == "Tenths"){
			place = calculateUnderAHundred(h) + " " + calculateOnesPlace(r);
		}else if(calculatePlace(h) == "Teens"){
			place = calculateTeens(h);
		}else if(calculatePlace(h) == "Ones"){
			place = calculateOnesPlace(h);
		}
		rv = calculateOnesPlace(t) + " Thousand " + calculateOnesPlace(p/100) + " " + calculatePlace(x - ((int) Math.floor(x/1000)*1000)) + " " + place ;
		return rv.replaceAll("\\s+$", "");
	}
	}
