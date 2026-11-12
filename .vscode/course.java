public class course {
    private String courseID;
    private String courseName;
    private double fee;
    private int maxStudent;
    private int currentStudent;

    public course(String courseID, String courseName, double fee, int maxStudent, int currentStudent) {
        this.courseID = courseID;
        this.courseName = courseName;
        if (fee > 0) {
            this.fee = fee;
        } else {
            System.out.println("Invalid fee.");
        }

        if (maxStudent > 0) {
            this.maxStudent = maxStudent;
        } else {
            System.out.println("Invalid maximum students");
        }

        if (currentStudent > 0 && currentStudent < maxStudent) {
            this.currentStudent = currentStudent;
        } else {
            System.out.println("Invalid current number of students");
        }
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getFee() {
        return fee;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public int getCurrentStudent() {
        return currentStudent;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setFee(double fee) {
        if (fee > 0) {
            this.fee = fee;
        } else {
            System.out.println("Invalid fee.");
        }
    }

    public void setMaxStudent(int maxStudent) {
        if (maxStudent > 0) {
            this.maxStudent = maxStudent;
        } else {
            System.out.println("Invalid maximum number of student.");
        }
    }

    public void setCurrentStudent(int currentStudent) {
        if (currentStudent > 0 && currentStudent < maxStudent) {
            this.currentStudent = currentStudent;
        } else {
            System.out.println("Invalid current number of student.");
        }
    }

    void registerStudent() {
        if (currentStudent < maxStudent) {
            currentStudent += 1;
            System.out.println("Student registered successfully.");
        } else {
            System.out.println("Course if full.");
        }
    }

    void cancelRegistration() {
        if (currentStudent > 0) {
            currentStudent -= 1;
            System.out.println("Registration cancelled.");
        } else {
            System.out.println("No student to cancel.");
        }
    }

    double calculateRevenue() {
        return currentStudent * fee;
    }

    void displayInfo() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Fee: " + fee);
        System.out.println("Maximum number Students: " + maxStudent);
        System.out.println("Current numbers of Student: " + currentStudent);
    }
}

class Main {
    public static void main(String[] args) {
    course course_1 = new course("C001", "Java OOP", 2000000, 3, 1);
    course_1.displayInfo();
    course_1.registerStudent();
    course_1.registerStudent();
    course_1.registerStudent();
    course_1.cancelRegistration();
    course_1.setFee(-500000);
    System.out.println("Revenue: " + course_1.calculateRevenue());
    }
}
