package io.github.kimseunghyun_bg.Iterator;

public class Main01 {
    public static void main(String[] args) {
        ClassRoom mathClass = new ClassRoom();
        mathClass.setStudent(new Student("one", 1));
        mathClass.setStudent(new Student("two", 2));

        // 1. Iterator 사용
        Iterator iterator = mathClass.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. For문 사용.
        // 문제점: 길이를 제공하는 함수가 없다.(=ClassRoom 클래스에 의존한다)
        for (int i = 0; i < 2; i++) {
            System.out.println(mathClass.getStudentByIndex(i));
        }
    }
}