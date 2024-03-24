public class Classroom {

    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        double[] mathScoress = new double[4];

        mathScoress[0] = 94.5;
        mathScoress[2] = 76.8;

        System.out.println("The number of students in the class is " + students.length);
        System.out.println(students[0] + " got score " + mathScoress[0] + " in math");
    }
}
