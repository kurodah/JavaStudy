
package Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MakeData {
    @SuppressWarnings("unused")
    public List<StudentDataEntity> makeStudentList() {

        // 使用するデータを宣言
        int ID;
        String studentName;
        String className;

        int ID2;
        String studentName2;
        String className2;

        // リストを準備
        List<StudentDataEntity> studentList = null;
        studentList = new ArrayList<StudentDataEntity>();

        // 使用するエンティティを準備
        StudentDataEntity studentDataEntity = new StudentDataEntity();

        // Ichiroのデータ
        ID = 1;
        studentName = "Ichiro";
        className = "A";
        studentDataEntity.setID(ID);
        studentDataEntity.setStudentName(studentName);
        studentDataEntity.setClassName(className);
        studentList.add(studentDataEntity);

        if (studentDataEntity != null) {
            studentDataEntity = new StudentDataEntity();
            System.out.println("通過点");
        }

        // Jiroのデータ
        ID2 = 2;
        studentName2 = "Jiro";
        className2 = "B";
        studentDataEntity.setID(ID2);
        studentDataEntity.setStudentName(studentName2);
        studentDataEntity.setClassName(className2);
        studentList.add(studentDataEntity);

        if (studentDataEntity != null) {
            studentDataEntity = new StudentDataEntity();
            System.out.println("通過点2");
        }

        // Saburoのデータ
        ID = 3;
        studentName = "Saburo";
        className = "C";
        studentDataEntity.setID(ID);
        studentDataEntity.setStudentName(studentName);
        studentDataEntity.setClassName(className);
        studentList.add(studentDataEntity);

        // データが入っているかコンソールに出力して確認する。
        System.out.println("0番目" + studentList.get(0).getID());
        System.out.println("0番目" + studentList.get(0).getStudentName());
        System.out.println("0番目" + studentList.get(0).getClassName());

        System.out.println("1番目" + studentList.get(1).getID());
        System.out.println("1番目" + studentList.get(1).getStudentName());
        System.out.println("1番目" + studentList.get(1).getClassName());

        System.out.println("2番目" + studentList.get(2).getID());
        System.out.println("2番目" + studentList.get(2).getStudentName());
        System.out.println("2番目" + studentList.get(2).getClassName());

        // for文で回す
        for (int i = 0, n = studentList.size(); i < n; i++) {
            System.out.println("for文" + studentList.get(i).getID());
            System.out.println("for文" + studentList.get(i).getStudentName());
            System.out.println("for文" + studentList.get(i).getClassName());
        }

        // 拡張for文で回す
        for (StudentDataEntity studentDataEntity2 :studentList) {
            System.out.println("拡張for文" + studentDataEntity2.getID());
            System.out.println("拡張for文" + studentDataEntity2.getStudentName());
            System.out.println("拡張for文" + studentDataEntity2.getClassName());
        }
        
        //iteratorで回す
        Iterator<StudentDataEntity> i = studentList.iterator();
        while(i.hasNext()){
            i.next();
         }

        

        return studentList;
    }
}
