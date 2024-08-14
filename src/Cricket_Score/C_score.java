package Cricket_Score;

public class C_score {
	int num_of_six;
	int num_of_four;
	int num_of_singles;
	int total_score;
	public void six(int nsix)
	{
		num_of_six=nsix;
	}
	public void four(int nfour)
	{
		num_of_four=nfour;
	}
	public void singles(int nsingles)
	{
		num_of_singles=nsingles;
	}
	public void total()
	{
		int tscore=num_of_six+num_of_four+num_of_singles;
		System.out.println("Total score is: "+ tscore);
	}
	public static void main(String args[])
	{
		C_score cs1=new C_score();
		cs1.six(6);
		cs1.four(5);
		cs1.singles(45);
		cs1.total();
	}
}
