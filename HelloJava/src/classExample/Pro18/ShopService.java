package classExample.Pro18;

public class ShopService
{
	private static ShopService ss = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return ss;
	}
	
}


