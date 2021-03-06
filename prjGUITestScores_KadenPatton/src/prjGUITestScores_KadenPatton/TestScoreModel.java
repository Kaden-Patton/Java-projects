// Kaden Patton November 29th 2019
package prjGUITestScores_KadenPatton;

public class TestScoreModel {
		
	private Student[] students;
	private int iCurStudent;
	private int studentCount;
	
	public TestScoreModel() 
	{
		iCurStudent = -1;
		studentCount = 0;
		students = new Student[10];
	}
	
	public String add(Student s)
	{
		if(studentCount == students.length)
			return "[Error] Student list is full";
		else
		{
			students[studentCount] = s;
			iCurStudent = studentCount;
			studentCount++;
			return null;
		}
		
	}
	

	
	public String replace(Student s)
	{
		if(iCurStudent == -1)
		{
			return "[Error] Must add a student first";
		}
		else
		{
			students[iCurStudent] = s;
			return null;
		}
	}
	
	public String delete() 
	{
		if(iCurStudent == -1)
		{
			return "[Error] Must add a student first";
		}
		else 
		{
			for(int i = iCurStudent; i < size() - 1; i++)
			{
				students[i] = students[i + 1];
			}
			studentCount--;
			if(iCurStudent == size())
			{
				iCurStudent--;
			}
			return null;
		}
	}
	
	public Student first()
	{
		Student s = null;
		if(studentCount == 0)
		{
			iCurStudent = -1;
		}
		else 
		{
			iCurStudent = 0;
			s = students[iCurStudent];
		}
		return s;
	}
	
	public Student previous()
	{
		Student s = null;
		if(studentCount == 0)
		{
			iCurStudent = -1;
		}
		else 
		{
			iCurStudent = Math.max(0, iCurStudent - 1);
			s = students[iCurStudent];
		}
		return s;
	}
	
	public Student next()
	{
		Student s = null;
		if(studentCount == 0)
		{
			iCurStudent = -1;
		}
		else 
		{
			iCurStudent = Math.min(studentCount - 1, iCurStudent + 1);
			s = students[iCurStudent];
		}
		return s;
	}
	
	public Student last()
	{
		Student s = null;
		if(studentCount == 0)
		{
			iCurStudent = -1;
		}
		else
		{
			iCurStudent = studentCount - 1;
			s = students[iCurStudent];
		}
		return s;
	}
	
	
	public Student currentStudent()
	{
		if(iCurStudent == -1)
		{
			return null;
		}
		else 
		{
			return students[iCurStudent];
		}
	}
	
	public int size()
	{
		return studentCount;
	}
	
	public int currentPosition()
	{
		return iCurStudent;
	}

	public int getClassAverage()
	{
		if(studentCount == 0)
			return 0;

		int sum = 0;
		for(int i = 0; i < studentCount; i++)
		{
			sum += students[i].getAverage();
		}
		
		return sum / studentCount;
	}
	
	public Student getHighScore()
	{
		if(studentCount == 0)
			return null;
		else
		{
			Student s = students[0];
			for(int i = 0; i < studentCount; i++)
			{
				if(s.getHighScore() < students[i].getHighScore())
					s = students[i];
			}
			return s;
		}		
	}
	
	public String toString()
	{
		String str = "";
		for (int i = 0; i < studentCount; i++)
		{
			str += students[i] + "\n";
		}
		return str;
	}
}