//Name:ASMA ABID KARIM
//ERP ID:19685S

public class A1_Q4
{
	public static void main(String[] args)
	{
		String mon=args[0];
		int y=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[1]);
		int y0;
		int d0;
		int m0;
		int x;
		int m=1;
		String day="SU";
		
		switch (mon)
		{
			case"january":m=1;break;
			case"february":m=2;break;
			case"march":m=3;break;
			case"april":m=4;break;
			case"may":m=5;break;
			case"june":m=6;break;
			case"july":m=7;break;
			case"august":m=8;break;
			case"september":m=9;break;
			case"october":m=10;break;
			case"november":m=11;break;
			case"december":m=12;break;
			default:m=13;
		}
		
		if(m<1||m>12)
			System.out.println("INVALID MONTH");
		if(y>9999||y<1000)
			System.out.println("INVALID YEAR");
		if(d<1||d>31)
			System.out.println("INVALID DATE");
		System.out.println("On which day of the week did "+ mon+ " "+d+ ", "+y+ " fall?");
		System.out.print("   mm/dd/yy"+" " + "= ");
		System.out.print(m+"/"+d+"/"+y);
		System.out.println();
		y0 = y - (14 - m) / 12;
		x  = y0 +( y0 / 4) - (y0 / 100) + (y0 / 400);
		m0 = m + (12 * ((14 - m) / 12)) - 2;
		d0 = (d + x +((31 * m0) / 12)) % 7;
		
		if(d0==0)
			day="SUNDAY";
		else if(d0==1)
			day="MONDAY";
		else if(d0==2)
			day="TUESDAY";
		else if(d0==3)
			day="WEDNESDAY";
		else if(d0==4)
			day="THURSDAY";
		else if(d0==5)
			day="FRIDAY";
		else if(d0==6)
			day="SATURDAY";
	        System.out.println();
		System.out.println("  THE DAY WILL BE "+ day);
	}
}