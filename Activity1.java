import java.util.Scanner;


class Gradebook{
  String name; 
  String class_name;
  int [] grades;
  Scanner scan;
  
  int average(int[] grades){
    int sum = 0;
    int count = 0;
    for (int i = 0; i < grades.length; i++){
      grade += grades[i];
      count ++;
    }
    int avg = sum / count;
    return avg;
  }
  String get_name(){
    System.out.println("What is your name?");
    name = scan.next();
    return name;
  }
  String get_class(){
    System.out.println("What is the class?");
    class_name = scan.next();
    return class_name;
  }
  int [] get_grades(){
    for (int i = 0; i < 5; i++){
      System.out.println("Please enter your number grade value. ");
      int grade = scan.nextInt();
      while !(grade >= 0 || grade <= 100){
        System.out.println("Please enter your number grade value. ");
        int grade = scan.nextInt();
        grades.add(grade);
      }
    }
    return grades;
  }

  
  String get_letter(int avg){
    String letter;
    if (grade >= 90){
      letter = "A";
    } else if (grade <= 80){
      letter = "B";
    } else if (grade <= 70){
      letter = "C";
    } else if (grade <= 60) {
      letter = "D";
    } else {
      letter = "F";
    }
    return letter;
  }
  void output_grade(){
    System.out.println("Student name: " + name);
    System.out.println("Class: " + class_name);
    System.out.println("GPA: " + avg);
    System.out.println("Letter Grade: " + letter);
  }
}

public class Activity1 {
  public static void main(String[] args){
    Gradebook gradebook = new Gradebook;
    String name = get_name();
    String class_name = get_class();
    int [] grades = gradebook.get_grades();
    int avg = grade.book.get_avg(int [] grades);
    String letter = grade.book.get_letter(avg);
    output_grade();
  }
}
    
    
    
  
