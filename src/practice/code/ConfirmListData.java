package practice.code;

import java.util.Iterator;
import java.util.List;

import Entity.StudentDataEntity;

public class ConfirmListData {
	
	public void confirmStudentData(){
		MakeListData makeData = new MakeListData();
		List<StudentDataEntity> studentList = makeData.makeStudentList();
		
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
        for (Iterator<StudentDataEntity> i = studentList.iterator(); i.hasNext();){
        	//iteratorはオブジェクトで返ってくるのでStudentDataEntityのハコを用意してあげる。
        	StudentDataEntity studentDataEntity3 = i.next();
            System.out.println("Iterator" + studentDataEntity3.getID());
            System.out.println("Iterator" + studentDataEntity3.getStudentName());
            System.out.println("Iterator" + studentDataEntity3.getClassName());
        }
	}
}
