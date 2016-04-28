import java.util.Scanner;

public class StringedInstrument extends Instrument {
	
	int numberofStrings;
	
	public void play(String instrument){
		
		System.out.println ("Playing the instrument: "+ instrument);		
	}
	
	public void electricguitar(int String){
		
		System.out.println ("Number of String in ElectricGuitar is: "+String);
		
	};	
	
	
public void electricbassguitar(int String){
		
		System.out.println ("Number of String in ElectricBassGuitar is: "+String);
		
	};	
	
	public static void main (String args[]){
		
	StringedInstrument SI = new StringedInstrument();
	Scanner scnr = new Scanner(System.in);
	System.out.println ("Enter the instrument playing");
	SI.play=scnr.nextLine();
	 SI.play(SI.play);
	 System.out.println ("Enter the number of string in Electric Guitar instrument");
	 SI.numberofStrings = scnr.nextInt();
	 SI.electricguitar(SI.numberofStrings);
	 System.out.println ("Enter the number of string in Electric Bass Guitar instrument");
	 SI.numberofStrings = scnr.nextInt();
	 SI.electricbassguitar(SI.numberofStrings);
	scnr.close()
;	}
	
}