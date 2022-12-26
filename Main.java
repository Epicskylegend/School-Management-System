import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

// Variables below track the count of students, teacher, and schools.
        int studentCount = 1;
        int teacherCount = 1;
        int schoolCount = 1;

// Min and max salary of teachers. A random number within this range is picked when we add teachers to our program.
        int salaryMin = 20000;
        int salaryMax = 100000;



// Min and max class cost of student attendance. A random number within this range is picked when we add students to our program.
        int classCostMin = 500;
        int classCostMax = 2000;



// Data structures to hold the information about students, teachers, and schools.
        HashMap<String, Integer> teachers = new HashMap<>();
        HashMap<String, Integer> students = new HashMap<>();
        ArrayList<String> schools = new ArrayList<>();

// All the commands we can enter in for our program.
        System.out.println("\n");
        System.out.println("Type '1' to add a student.\n");
        System.out.println("Type '2' to add a teacher.\n");
        System.out.println("Type '3' to add a school.\n");
        System.out.println("Type 'teachers' to view all the teachers as well as their salaries.\n");
        System.out.println("Type 'students' to view all the students as well as their class costs.\n");
        System.out.println("Type 'remove' followed by the number (with no spaces) to remove a school.\n");
        System.out.println("Type in the name of the teacher followed by the number (with no spaces) to update their salary.\n");
        System.out.println("Type in the name of the student followed by the number (with no spaces) to update their attendance cost.\n");
        System.out.println("Type 'expense' to view the total of all teacher salaries.\n");
        System.out.println("Type 'revenue' to view the total cost of student attendance.\n");
        System.out.println("Type '0' to end the program.\n");
        System.out.println("Type 'options' to display all the commands above again.\n");



// Below we have all the instructions to tell our program how to handle user input.
        String command = input.nextLine();

        while (!command.equals("0")) { // Condition to end the program. As long as condition isn't met, program will run forever.

            String action = input.nextLine();


            if (action.equals("1")) {
                    students.put("Student " + studentCount, (int) (Math.random()*(classCostMax-classCostMin+1)+classCostMin));
                System.out.println(students);
                studentCount += 1;
            }
             else if (action.equals("2")) {
                teachers.put("Teacher " + teacherCount, (int) (Math.random()*(salaryMax-salaryMin+1)+salaryMin));
                System.out.println(teachers);
                teacherCount += 1;
            }
             else if (action.equals("expense") || action.equals("Expense")) {
                 int expense = 0;
                 for (int i: teachers.values()) {
                     expense += i;
                }
                System.out.println("The total salary of all teachers is $" + expense + ".\n");

            }


             else if(action.equals("revenue") || action.equals("Revenue")) {
                int revenue = 0;
                for (int i: students.values()) {
                    revenue += i;
                }
                System.out.println("The total cost of student attendance is $" + revenue + ".\n");

            }


        // If the user enters the key of a teacher in the HashMap, the salary of that teacher will be updated and displayed.
            else if (action.equals("teacher" + teacherCount)) {
                teachers.replace("teacher" + teacherCount,  (int) (Math.random()*(salaryMax-salaryMin+1)+salaryMin));
                System.out.println("The new salary of teacher " + teacherCount + " is: $"+ teachers.get("teacher" + teacherCount) + ".\n");
            }

            // If the user enters the key of a student in the HashMap, the class cost of that student will be updated and displayed.
            else if (action.equals("student" + studentCount)) {
                students.replace("student" + studentCount,   (int) (Math.random()*(classCostMax-classCostMin+1)+classCostMin));
                System.out.println("The new class cost for student " + studentCount + " is: $"+ students.get("student" + studentCount) + ".\n");
            }
            else if (action.equals("3")) {
                schools.add("School" + schoolCount);
                System.out.println(schools);

            }
            else if (action.equals("remove" + schoolCount) || action.equals("Remove" + schoolCount)) {
                schools.remove("School" + schoolCount);
                System.out.println(schools);

            }

            else if (action.equals("teachers") || action.equals("Teachers")) {
                System.out.println("The names and salaries of the teachers are listed below:");
                System.out.println(teachers);
            }

            else if (action.equals("students") || action.equals("Students")) {
                System.out.println("The names and class costs of the students are listed below:");
                System.out.println(students);
            }
            else if (action.equals("0")) {
                System.out.println("You decided to stop the program.");
                return;
        }
            else if (action.equals("options") || action.equals("Options")) {
                System.out.println("\n");
                System.out.println("Type '1' to add a student.\n");
                System.out.println("Type '2' to add a teacher.\n");
                System.out.println("Type '3' to add a school.\n");
                System.out.println("Type 'teachers' to view all the teachers as well as their salaries.\n");
                System.out.println("Type 'students' to view all the students as well as their class costs.\n");
                System.out.println("Type 'remove' followed by the number (with no spaces) to remove a school.\n");
                System.out.println("Type in the name of the teacher followed by the number (with no spaces) to update their salary.\n");
                System.out.println("Type in the name of the student followed by the number (with no spaces) to update their attendance cost.\n");
                System.out.println("Type 'expense' to view the total of all teacher salaries.\n");
                System.out.println("Type 'revenue' to view the total cost of student attendance.\n");
                System.out.println("Type '0' to end the program.\n");
                System.out.println("Type 'options' to display all the commands above again.\n");


            }
            else {
                System.out.println("Invalid input. Please trying entering in one of the commands listed in the program.");
            }

        }



    }
}
