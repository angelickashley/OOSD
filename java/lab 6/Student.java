package lab6;
public class Student extends Person{
    private static int MAX_COURSES = 30;

    private int numCourses = 0;
    private String[] courses = new String[MAX_COURSES];
    private int[] grades = new int[MAX_COURSES];

    public Student(String name, String address){
        super(name, address);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Student: " + super.toString() + "\n");
        for (int i = 0; i < numCourses; i++){
            sb.append(courses[i]).append(":").append(grades[i]);
        }
        return sb.toString();
    }
    public void addCourseGrade(String course, int grade) {
        if (numCourses < MAX_COURSES){
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }
    public void printGrades(){
        for (int i = 0; i < numCourses; i++){
            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }
    public double getAverageGrade(){
        if (numCourses == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        return (double)sum / numCourses;
    }
}
