import java.text.DateFormat;
import java.util.Date;

public class ClockSubstractionAlgorithm {
	
	public ClockSubstractionAlgorithm() {}
	//yyyy/MM/dd HH:mm:ss
	public String Subtract(String time1,String time2) {
//		Error Handling
		try {
				if(!(time1.length()==time2.length()))
			{
				throw new IllegalArgumentException("Invalid Date"); 
			}
		}
		
		catch(IllegalArgumentException e){
			return("Error occurred within system. Please contact administrator.");	
		}
		
		double cyr=Integer.parseInt(time1.substring(0,4)); double tyr=Integer.parseInt(time2.substring(0,4));
		double cmth = Integer.parseInt(time1.substring(5,7)); double tmth = Integer.parseInt(time2.substring(5,7));
		double cd = Integer.parseInt(time1.substring(8,10)); double td = Integer.parseInt(time2.substring(8,10));
		
		double ch = Integer.parseInt(time1.substring(11,13)); double th = Integer.parseInt(time2.substring(11,13));
		double cmin = Integer.parseInt(time1.substring(14,16)); double tmin = Integer.parseInt(time2.substring(14, 16));
		double cs= Integer.parseInt(time1.substring(17,19)); double ts = Integer.parseInt(time2.substring(17,19));
		
		try {
			if(cyr>tyr||cmth>tmth||th>24||ch>24||cmin>60||tmin>60)
				throw(new IllegalArgumentException("Error"));
		}
		catch(IllegalArgumentException a){
			return("Error");
		}
		
		int[] monthLength = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};		
							
		double Result=0;
		//Year Checker
		while((Math.abs(cyr-tyr)>=1)&&(tmth>=cmth)) {
			tyr--;
			Result+=(365*24);
		}
		//The Day Algorithm	
			while(cd!=monthLength[(int) cmth])
			{
				Result+=24;
				cd++;
			}
			if (cmth==12) {
				cmth=1;
			}
			else if(cd!=monthLength[(int) cmth]) {
				cmth++;
			}
			while(tmth!=cmth) {
				Result+= (24*monthLength[(int) cmth]);
				if (cmth==12) {
					cmth=1;
				}
				else {
					cmth++;
				}
			}
			if(cd>td)
			{
				Result-=24*(Math.abs(cd-td));
			}
			if(tmth!=cmth)
			Result+=(24*td);
		//Hour Calculator
			Result+=(th-ch);
		//Minute Calculator
			Result+=((tmin-cmin)/60);					
	return (Result+" hours");
}
	public static void main(String[] args) {
		String time1="2018/01/12 08:30:00";
		String time2="2018/01/12 16:45:00";

		ClockSubstractionAlgorithm csa = new ClockSubstractionAlgorithm();
		System.out.println(csa.Subtract(time1, time2));
	}

}
