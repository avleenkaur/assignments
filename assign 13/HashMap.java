import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class HashMap_demo
{
	public static void main(String args[])
	{
	HashMap h1=new HashMap();
	h1.put("Avleen","8557832861");
	h1.put("swati","9876543215");
	h1.put("sumedha","9876543245");
	Set s=h1.keySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
	System.out.println(h1.get(i.next()));
	}
	}
}