
public class Prime {
	public Boolean validate(Integer primeNumber)
	{
		for(int i=2;i<(primeNumber/2);i++)
		{
			if(primeNumber%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public Object Validate() {
		// TODO Auto-generated method stub
		return null;
	}
}
