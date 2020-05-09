package herobrinesoul.routines;

import herobrinesoul.routines.Routine;

import java.util.HashMap;
import java.util.ArrayList;
public class RoutineRegistry
{
	private HashMap<String, Routine> nameRoutineMap = new HashMap<>();

	public RoutineRegistry()
	{
	}
	public RoutineRegistry(ArrayList<Routine> routines)
	{
		for(Routine routine : routines)
		{
			System.out.println("Adding routine: " + routine.getName());
			addRoutine(routine);
		}
	}
	public void addRoutine(Routine routine)
	{
		String name = routine.getName();
		nameRoutineMap.put(name, routine);
	}

	public Routine getRoutine(String name)
	{
		return nameRoutineMap.get(name);
	}

	public boolean hasRoutine(String name)
	{
		return nameRoutineMap.containsKey("name");
	}
}
