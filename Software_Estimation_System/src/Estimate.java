import java.util.*;

public class Estimate 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double actor = 0,use_case = 0, ac, uc, uucp, total_Tfactor = 0, tf, tcf, total_Efactor = 0, efs, ucs, ef, ucp, mh, efr, mhr ;
		
		System.out.println("\nSOFTWARE ESTIMATION SYSTEM");
		System.out.println("--------------------------\n");
		System.out.println("\nNOTE : REUSABLE SOFTWARE COMPONENTS SHOULD NOT BE INCLUDED IN THIS ESTIMATE\n");

		ac = actor(actor);
		uc = use_case(use_case);
		uucp = UUCP(ac,uc);
		tf = tech_factor(total_Tfactor);
		tcf = TCF(tf);
		ucs = UCS(uucp,tcf);
		efs = EFS(total_Efactor);
		ef = EF(efs);
		ucp = UCP(ef,ucs);
		mh = MH(ucp);
		mhr = MHR(mh);
		efr = EFR();
		TMH(efr,mhr);
	}
	
	public static double actor(double total_actor)
	{
		System.out.println("\n>>>>>> Calculation for Actor <<<<<<\n");
		
		System.out.println("Simple actor is another system with a defined Application Programming Interface (API)");
		System.out.print("Insert quantity of simple actor (IF HAVE) : ");
		int quantity_insert_actor1 = scan.nextInt();
		
		System.out.println("\nAverage actor is either another system that interacts through a protocol such as TCP/IP or it is a person interacting through a text-based interface");
		System.out.print("Insert quantity of average actor (IF HAVE) : ");
		int quantity_insert_actor2 = scan.nextInt();
		
		System.out.println("\ncomplex actor is a person interacting through a graphical user interface (GUI)");
		System.out.print("Insert quantity of complex actor (IF HAVE) : ");
		int quantity_insert_actor3 = scan.nextInt();
		
		int simpleA = quantity_insert_actor1 * 1;
		int averageA = quantity_insert_actor2 * 2;
		int complexA= quantity_insert_actor3 * 3;

		total_actor = simpleA + averageA + complexA;
		
		System.out.print("\nTotal actor value = "+total_actor+"\n\n");
		
		return total_actor;
	}
	
	public static double use_case(double total_use_case)
	{
		System.out.println("\n>>>>>> Calculation for Use Case <<<<<<\n");
		
		System.out.println("Simple use case has 3 or fewer transactions");
		System.out.print("Insert quantity of simple use case (IF HAVE) : ");
		int quantity_insert_UC1 = scan.nextInt();
		
		System.out.println("\nAverage use case has 4 to 7 transactions");
		System.out.print("Insert quantity of average use case (IF HAVE) : ");
		int quantity_insert_UC2 = scan.nextInt();
		
		System.out.println("\nComplex use case has more than 7 transactions.");
		System.out.print("Insert quantity of complex use case (IF HAVE) : ");
		int quantity_insert_UC3 = scan.nextInt();

		int simpleUC = quantity_insert_UC1 * 5;
		int averageUC = quantity_insert_UC2 * 10;
		int complexUC = quantity_insert_UC3 * 15;

		total_use_case = simpleUC + averageUC + complexUC;
		
		System.out.print("\nTotal use case value = "+total_use_case+"\n\n");
		
		return total_use_case;
	}
	
	public static double UUCP(double total_use_case, double total_actor)
	{
		System.out.println("\n>>>>>> Calculation for Unadjusted Use Case Points (UUCP) <<<<<<\n");
		
		double UUCP = total_actor + total_use_case;
		
		System.out.print("Total use UUCP = "+UUCP+"\n\n");
		
		return UUCP;
	}
	
	public static double tech_factor(double total_Tfactor)
	{
		System.out.println("\n>>>>>> Calculation for Technical Factors <<<<<<");
		
		System.out.println("\nInsert numbers between 1 to 5");
		
		System.out.println("\nT1 : Must have a distributed solution");
		System.out.print("Insert weight factor of T1 (IF HAVE) : ");
		double T_insert1 = scan.nextDouble();
		double T1 = T_insert1 * 5;

		System.out.println("\nT2 : Must respond to specific performance objectives");
		System.out.print("Insert weight factor of T2 (IF HAVE) : ");
		double T_insert2 = scan.nextDouble();
		double T2 = T_insert2 * 3;

		System.out.println("\nT3 : Must meet end-user efficiency desires");
		System.out.print("Insert weight factor of T3 (IF HAVE) : ");
		double T_insert3 = scan.nextDouble();		
		double T3 = T_insert3 * 5;

		System.out.println("\nT4 : Complex internal processing");
		System.out.print("Insert weight factor of T4 (IF HAVE) : ");
		double T_insert4 = scan.nextDouble();	
		double T4 = T_insert4 * 5;

		System.out.println("\nT5 : Code must be reusable");
		System.out.print("Insert weight factor of T5 (IF HAVE) : ");
		double T_insert5 = scan.nextDouble();
		double T5 = T_insert5 * 3;

		System.out.println("\nT6 : Must be easy to install");
		System.out.print("Insert weight factor of T6 (IF HAVE) : ");
		double T_insert6 = scan.nextDouble();
		double T6 = T_insert6 * 3;

		System.out.println("\nT7 : Must be easy to use");
		System.out.print("Insert weight factor of T7 (IF HAVE) : ");
		double T_insert7 = scan.nextDouble();
		double T7 = T_insert7 * 3;

		System.out.println("\nT8 : Must be portable");
		System.out.print("Insert weight factor of T8 (IF HAVE) : ");
		double T_insert8 = scan.nextDouble();
		double T8 = T_insert8 * 0;

		System.out.println("\nT9 : Must be easy to change");
		System.out.print("Insert weight factor of T9 (IF HAVE) : ");
		double T_insert9 = scan.nextDouble();
		double T9 = T_insert9 * 5;

		System.out.println("\nT10 : Must allow concurrent users");
		System.out.print("Insert weight factor of T10 (IF HAVE) : ");
		double T_insert10 = scan.nextDouble();
		double T10 = T_insert10 * 0;

		System.out.println("\nT11 : Includes special security features");
		System.out.print("Insert weight factor of T11 (IF HAVE) : ");
		double T_insert11 = scan.nextDouble();
		double T11 = T_insert11 * 5;

		System.out.println("\nT12 : Must provide direct access for 3rd parties");
		System.out.print("Insert weight factor of T12 (IF HAVE) : ");
		double T_insert12 = scan.nextDouble();
		double T12 = T_insert12 * 0;

		System.out.println("\nT13 : Requires special user training facilities");
		System.out.print("Insert weight factor of T13 (IF HAVE) : ");
		double T_insert13 = scan.nextDouble();
		double T13 = T_insert13 * 3;

		total_Tfactor = T1 + T2 + T3 + T4 + T5 + T6 + T7 + T8 + T9 + T10 + T11 + T12 + T13;
		
		System.out.print("\nTotal technical factor = "+total_Tfactor+"\n\n");
		
		return total_Tfactor;
	}
	
	public static double TCF(double total_Tfactor)
	{
		System.out.println("\n>>>>>> Calculation for Technical Complexity Factor (TCF) <<<<<<\n");
		
		double tcf = (total_Tfactor * 0.01) + 0.6;
		
		System.out.print("Total technical complexity factor = "+tcf+"\n\n");
		
		return tcf;
	}
	
	public static double UCS(double UUCP, double TCF)
	{
		System.out.println("\n>>>>>> Calculation for Size of the Software (Use Case)) <<<<<<\n");
		
		double Use_Case_Size = UUCP * TCF;
		
		System.out.print("Total use case size = "+Use_Case_Size+"\n\n");
		
		return Use_Case_Size;
	}
	
	public static double EFS(double total_Efactor)
	{
		System.out.println("\n>>>>>> Calculation for Experience Factors <<<<<<\n");
		
		System.out.println("Insert numbers between 1 to 5");
		
		System.out.println("\nE1 : Familiar with FPT software process");
		System.out.print("Insert weight factor of E1 (IF HAVE) : ");
		double E_insert1 = scan.nextDouble();
		double E1 = E_insert1 * 4;

		System.out.println("\nE2 : Application experience");
		System.out.print("Insert weight factor of E2 (IF HAVE) : ");
		double E_insert2 = scan.nextDouble();
		double E2 = E_insert2 * 2;

		System.out.println("\nE3 : Paradigm experience (OO)");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert3 = scan.nextDouble();		
		double E3 = E_insert3 * 4;

		System.out.println("\nE4 : Lead analyst capability");
		System.out.print("Insert weight factor of E4 (IF HAVE) : ");
		double E_insert4 = scan.nextDouble();	
		double E4 = E_insert4 * 4;

		System.out.println("\nE5 : Motivation");
		System.out.print("Insert weight factor of E5 (IF HAVE) : ");
		double E_insert5 = scan.nextDouble();	
		double E5 = E_insert5* 4;

		System.out.println("\nE6 : Stable Requirements");
		System.out.print("Insert weight factor of E6 (IF HAVE) : ");
		double E_insert6 = scan.nextDouble();	
		double E6 = E_insert6 * 2;

		System.out.println("\nE7 : Part-time workers");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert7 = scan.nextDouble();	
		double E7 = E_insert7 * 0;

		System.out.println("\nE8 : Difficulty of programming language");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert8 = scan.nextDouble();	
		double E8 = E_insert8 * 3;

		total_Efactor = E1 + E2 + E3 + E4 + E5 + E6 + E7 + E8;
		
		System.out.print("\nTotal experience factors = "+total_Efactor+"\n\n");
			
		return total_Efactor;
		
	}
	
	public static double EF(double total_Efactor)
	{
		System.out.println("\n>>>>>> Calculation for Experience Factor <<<<<<\n");
		
		double EF = (total_Efactor * (-0.03)) + 1.4;
		
		System.out.print("Total experience factor = "+EF+"\n\n");
		
		return EF;
	}
	
	public static double UCP (double EF,double Use_Case_Size)
	{
		System.out.println("\n>>>>>> Calculation for Use Case Points <<<<<<\n");
		
		double UCP = EF * Use_Case_Size;
		
		System.out.print("Use Case Points = "+UCP+"\n\n");
		
		return UCP;
	}

	public static double MH(double UCP)
	{	
		System.out.println("\n>>>>>> Calculation for Man-Hours <<<<<<\n");
		
		/* int totalE,total1,total2,total3,total4,total5,total6,total7,total8;
		double total_man_hours = 0;
		
		if (E1 <3)	
			total1 = 1;
		else
			total1 = 0;
		if (E2 <3)	
			total2 = 1;
		else
			total2 = 0;
		if (E3 <3)	
			total3 = 1;
		else
			total3 = 0;
		if (E4 <3)	
			total4 = 1;
		else
			total4 = 0;
		if (E5 <3)	
			total5 = 1;
		else
			total5 = 0;
		if (E6 <3)	
			total6 = 1;
		else
			total6 = 0;
		if (E7 > 3)
			total7 = 1;
		else
			total7 = 0;
		if (E8 > 3)
			total8 = 1;
		else
			total8 = 0;
		totalE = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8;
		if  (totalE <=2)
		{
			total_man_hours = 20 * UCP;
			System.out.println("\nMan-hours : "+total_man_hours);
		}
		else if (totalE == 3 || totalE == 4)
		{
			total_man_hours = 28 * UCP;
			System.out.println("\nMan-hours : "+total_man_hours);
		}
		else if (totalE >= 5)
		{
			System.out.println("\nConsider restructuring the project team so that the numbers fall at least below 5");
		}*/
		
		System.out.print("Insert the effort rate, 20 or 28 : ");
		int er = scan.nextInt();
		double total_man_hours = er * UCP;
		
		System.out.println("\nTotal man-hours = "+total_man_hours+"\n");
			
		return total_man_hours;
	}
	
	public static double MHR(double total_man_hours)
	{
		System.out.println("\n>>>>>> Calculation for Adjusting Man-Hours for Risk <<<<<<\n");

		System.out.print("Enter the estimate risk percentage : ");
		double estimate_percentage = scan.nextDouble();
		double estimate = estimate_percentage * 0.01;
		double adjusted_man_hours = total_man_hours * (1.0 + estimate);

		double roundOff1 = Math.round(adjusted_man_hours * 100.0) / 100.0;
		
		System.out.println("\nTotal adjusted man-hours = "+roundOff1+"\n");
		
		return roundOff1;
	}
	
	public static double EFR()
	{
		System.out.println("\n>>>>>> Calculation for Estimating for Reports <<<<<<\n");
		
		System.out.print("Insert quantity of simple report (IF HAVE) : ");
		int quantity_report1 = scan.nextInt();
		int Simple_Report = quantity_report1 * 12;
				
		System.out.print("Insert quantity of average report (IF HAVE) : ");
		int quantity_report2 = scan.nextInt();		
		int Average_Report = quantity_report2 * 20;
						
		System.out.print("Insert quantity of complex report (IF HAVE) : ");
		int quantity_report3 = scan.nextInt();
		int Complex_Report = quantity_report3 * 40;

		int total_report = Simple_Report + Average_Report + Complex_Report;

		System.out.println("\nTotal man-hours report = "+total_report+"\n");
		
		return total_report;
	}
	
	public static double TMH(double total_report, double adjusted_man_hours)
	{
		System.out.println("\n>>>>>> Calculation for Final Total Man-Hours <<<<<<\n");
		
		double total_man_hours_all = total_report + adjusted_man_hours;
		
		double roundOff = Math.round( total_man_hours_all * 100.0) / 100.0;
		
		System.out.println("Final total man-hours = "+roundOff);
		
		return roundOff;
	}
}