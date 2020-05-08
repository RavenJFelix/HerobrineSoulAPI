package herobrinesoul.commands;

import herobrinesoul.collection.Named;

public interface Command extends Named
{
	public String getInvocation();
	public void execute(String rawArgs);
}
