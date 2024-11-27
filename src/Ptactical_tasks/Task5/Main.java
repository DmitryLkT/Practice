package Ptactical_tasks.Task5;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Vova", 32, "Teacher", "Music");

        System.out.println(teacher.getProfession());
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.giveALesson());

    }
}
