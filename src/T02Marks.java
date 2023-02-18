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
public abstract class T02Marks {
    public double maths;
    public double science;
    public double history;
    public double english;
    abstract double getPercentage();

}
class StudentA extends T02Marks {
    StudentA(double maths, double science,double history){
        this.maths= maths;
        this.science= science;
        this.history= history;
    }

    @Override
    double getPercentage() {
        double totalMarks= maths+science+history;
        double totalPercentage= (totalMarks/300)* 100;
        return totalPercentage;
    }
}

class StudentB extends T02Marks{
    StudentB(double maths, double science,double history,double english){
        this.maths= maths;
        this.science= science;
        this.history= history;
        this.english= english;
    }

    @Override
    double getPercentage() {
        double totalMarks= maths+science+history+english;
        double totalPercentage= (totalMarks/400)* 100;
        return totalPercentage;
    }
}