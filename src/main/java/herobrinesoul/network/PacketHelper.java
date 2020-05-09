package herobrinesoul.network;

public class PacketHelper
{
	private static long nextID = 0;

	public static long generateID()
	{
		return nextID++;
	}
}
