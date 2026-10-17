package lab6;

public class Teacher {
    private static final int MAX_COURSES = 5;
    private int numCourses = 0;
    private String[] courses = new String[MAX_COURSES];

    public Teacher(String name, String address) {
        super();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teacher: " + super.toString());
        for (int i = 0; i < numCourses; i++) {
            sb.append(courses[i]);
        }
        return sb.toString();
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
            if (numCourses == MAX_COURSES) return false;
            courses[numCourses++] = course;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--numCourses] = null;
                return true;
            }
        }
        return false;
    }
}