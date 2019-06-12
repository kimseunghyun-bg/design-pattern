package io.github.kimseunghyun_bg.Iterator;

public class Main02 {
    public static void main(String[] args) {
        ClassRoom mathClass = new ClassRoom();
        mathClass.setStudent(new Student("one", 1));
        mathClass.setStudent(new Student("two", 2));
        mathClass.setStudent(new Student("three", 3));

        // 1. Iterator 사용
        Iterator iterator = mathClass.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. 기존 For문 사용금지. 폐기처분
        /*
        for (int i = 0; i < 2; i++) {
          System.out.println(mathClass.getStudentByIndex(i));
        }
        */

        // 3. getStudentByName 메소드로 For문 사용은 불가능함.
    }
}
