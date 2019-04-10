import java.util.Arrays;

public class Course
{
    private String courseName;

    private String[] students;

    public void addStudent(String studentName)
    {
        //String[] tempStudents = new String[students.length + 1];

        students = Arrays.copyOf(students,students.length + 1);

        students[students.length - 1] = studentName;

    }

    public void removeStudent(String studentName)
    {
        for(int i = 0; i < students.length; i++)
        {
            if (students[i].equals(studentName))
            {
                String[] tempStudents = new String[students.length - 1];

                for(int copyIdx = 0; copyIdx < students.length; copyIdx++)
                {
                    if (copyIdx < i)
                    {
                        tempStudents[copyIdx] = students[copyIdx]
                    }
                    else if (copyIdx >= i)
                    {
                        tempStudents[copyIdx] = students[copyIdx + 1]
                    }
                }

                students = tempStudents;
                break;
            }
        }
    }
}
