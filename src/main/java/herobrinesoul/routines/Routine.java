package herobrinesoul.routines;

public interface Routine
{
	public void activate();
	public void activate(String[] args);
	public void deactivate();
	public String getName();
}
