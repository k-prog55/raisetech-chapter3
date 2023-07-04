import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("田中");
        names.add("鈴木");
        names.add("山田");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        //リストの中に山田,村上という文字列の要素が含まれているかどうかを判定する
        System.out.println(names.contains("山田"));
        System.out.println(names.contains("村上"));

        //リストの中身をカンマで1つにつなげた文字列として表示する
        List<String> namesAll = Arrays.asList("佐藤", "田中", "島田");
        System.out.println(namesAll);

        //学生クラスのリストを作り、2年生の学生だけを表示する
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("佐藤",2));
        studentList.add(new Student("山田",1));
        studentList.add(new Student("後藤",3));

        for (Student student : studentList){
            if(student.getGrade() == 2){
                System.out.println(student.getName());
            }
        }
    }
}