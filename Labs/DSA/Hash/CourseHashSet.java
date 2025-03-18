import java.util.HashSet;
import java.util.Iterator;

public class CourseHashSet {
    private int courseId;
    private String courseTitle;
    private String semester;

    public Course(int id, String title, String sem) {
        this.courseId = id;
        this.courseTitle = title;
        this.semester = sem;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Semester: " + semester;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course otherCourse = (Course) obj;
        return courseId == otherCourse.courseId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(courseId);
    }
}

