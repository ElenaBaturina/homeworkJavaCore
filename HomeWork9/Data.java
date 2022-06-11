package HomeWork9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        Course course1 = new Course("Основы ручного тестирования");
        Course course2 = new Course("Основы тест-аналитики");
        Course course3 = new Course("Linux. Рабочая станция");
        Course course4 = new Course("Тестирование веб-приложений");
        Course course5 = new Course("Java. Уровень 1");
        Course course6 = new Course("Java Core для тестировщиков");
        Course course7 = new Course("Автоматизация тестирования Web UI на Java");
        Course course8 = new Course("Компьютерные сети. ");
        Course course9 = new Course("HTML/CSS для тестировщиков");
        Course course10 = new Course("Безопасность веб");
        Course course11 = new Course("Системы сбора логов");
        Course course12 = new Course("Буткемп. Тестировщик");
        Course course13 = new Course("Буткемп. Программирование");


        Student student1 = new Student("Елена", Arrays.asList(course1, course3, course8, course7, course12, course13));
        Student student2 = new Student("Дмитрий", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Александр", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Анна", Arrays.asList(course1, course4, course8, course9, course3, course5));
        Student student5 = new Student("Наталья", Arrays.asList(course1, course7, course9, course6, course12));
        Student student6 = new Student("Алена", Arrays.asList(course1, course3, course9));
        Student student7 = new Student("Артур", Arrays.asList(course1, course6, course7, course5, course9));
        Student student8 = new Student("София", Arrays.asList(course1, course2, course4));
        Student student9 = new Student("Кирилл", Arrays.asList(course4, course7, course12));
        Student student10 = new Student("Юлия", Arrays.asList(course1, course1, course5));
        Student student11 = new Student("Мария", Arrays.asList(course6, course9, course13));
        Student student12 = new Student("Владимир", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Иван", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Станислав", Arrays.asList(course9, course2));
        Student student15 = new Student("Вероника", Arrays.asList(course1, course3, course10));
        Student student16 = new Student("Татьяна", Arrays.asList(course11, course9, course2, course10));
        Student student17 = new Student("Антон", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Ирина", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Марина", Arrays.asList(course6, course10, course13));
        Student student20 = new Student("Богдан", Arrays.asList(course3, course5, course7));
        Student student21 = new Student("Надежда", Arrays.asList(course8, course6, course9));
        Student student22 = new Student("Евгений", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Инна", Arrays.asList(course2, course1, course5));
        Student student24 = new Student("Илья", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Людмила", Arrays.asList(course1, course4, course12));
        Student student26 = new Student("Виталий", Arrays.asList(course7, course3, course9, course5));
        Student student27 = new Student("Олеся", Arrays.asList(course2, course7, course3));
        Student student28 = new Student("Ольга", Arrays.asList(course1, course2));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Основы ручного тестирования"),
        new Course("Основы тест-аналитики"),
        new Course("Linux. Рабочая станция"),
        new Course("Тестирование веб-приложений"),
        new Course("Java. Уровень 1"),
        new Course("Java Core для тестировщиков"),
        new Course("Автоматизация тестирования Web UI на Java"),
        new Course("Компьютерные сети. "),
        new Course("HTML/CSS для тестировщиков"),
        new Course("Безопасность веб"),
        new Course("Системы сбора логов"),
        new Course("Буткемп. Тестировщик"),
        new Course("Буткемп. Программирование"));

    }
}
