package io.github.kimseunghyun_bg.Iterator;

public class ClassRoom implements Aggregate {
    private Student[] students;
    private int last;

    public ClassRoom() {
        students = new Student[25];
        last = 0;
    }

    public void setStudent(Student student) {
        students[last] = student;
        last++;
    }

    // 꼭! getStudentByName를 사용해주세요. 기존소스도 반드시 수정해주세요.
    @Deprecated
    public Student getStudentByIndex(int idx){
        return students[idx];
    }

    public Student getStudentByName(String name){
        for (int i=0; i < students.length; i++) {
            if(students[i].getName().equals(name)){
                return students[i];
            }
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return new ClassRoomIterator();
    }

    private class ClassRoomIterator implements Iterator{
        private int index;

        ClassRoomIterator(){
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return last > index;
        }

        @Override
        public Student next() {
            return students[index++];
        }
    }
}
