
public class Age {

	void person(int prem, int om) {
		if (prem > om) {
			System.out.println("prem is older then om");
		}
		else if(om > prem)
		{
			System.out.println("om is younger  then prem");
		}
		else if(om==prem)
		{
			System.out.println("om and prem are both same age");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
