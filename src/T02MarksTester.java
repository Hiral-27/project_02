/*
2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
 */
public class T02MarksTester {
    public static void main(String[] args) {
        T02Marks[] marks={new StudentA(56,76,45), new StudentB(78,67,64,72)};
        for (int i = 0; i < marks.length; i++) {
            T02Marks marks1= marks[i];
            if(i==0) {
                System.out.println("Student A Percentage: " + marks1.getPercentage()+"%");
            }else {
                System.out.println("Student B Percentage: " + marks1.getPercentage()+"%");
            }
        }
    }
}
