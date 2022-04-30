public class Calculation
{
	static void cal(int point)
	{	
Details objdetail = new Details();

double charge;
double fix= objdetail.fixed;
double cat60 = objdetail.catgory60;
double cat6090 = objdetail.catgory6090;
double cat90120 = objdetail.catgory90120;
double cat120up = objdetail.catgory120up;

		if(point<1)	
		{
			charge= fix  ;
			System.out.println ( "Vat Charge is = 15% " +charge*0.15);
			System.out.println ( "This month charge = "+ (fix+charge*0.15 )  );	
		}	

		else if (point<=60)
		{
			charge= point*cat60 + fix ;
			System.out.println ( "Vat Charge is 15% = "+charge*0.15 );
			System.out.println ( "This month charge = "+ ( charge +charge*0.15) );	
		}
		else if (point<=90)
		{	point =point-60;
			charge=point*cat6090 + cat60*60 + fix  ;
			System.out.println ( "Vat Charge is 15% =" +charge*0.15 );
			System.out.println ( "This month charge = "+ (charge + charge*0.15 ) );	
		}

		else if (point<=120)
		{	point =point-90;
			charge=point*cat90120 + cat60*60  + cat6090*30 + fix  ;
			System.out.println ( "Vat Charge is 15% ="+charge*0.15  );
			System.out.println ( "This month charge = "+ (charge + charge*0.15 ) );	
		}
		
		else
		{	point =point-120;
			charge=point*cat120up + cat60*60  + cat6090*30 + cat90120*30 + fix ;
			System.out.println ( "Vat Charge is 15% =" +charge*0.15 );
			System.out.println ( "This month charge = "+ (charge + charge*0.15 ) );	
		}
	}
}