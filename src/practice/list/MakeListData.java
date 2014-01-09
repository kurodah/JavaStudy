package practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Entity.StudentDataEntity;

/**
 * 
 * @author kurodah Listを使用した生徒データの作成
 * 
 */

public class MakeListData {
	public List<StudentDataEntity> makeStudentList() {

		// 使用するデータを宣言
		int ID;
		String studentName;
		String className;

		// 生徒データを格納吸うためのリストを準備
		List<StudentDataEntity> studentList = null;
		studentList = new ArrayList<StudentDataEntity>();

		// 使用するエンティティ
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
		}

		// Jiroのデータ
		ID = 2;
		studentName = "Jiro";
		className = "B";
		studentDataEntity.setID(ID);
		studentDataEntity.setStudentName(studentName);
		studentDataEntity.setClassName(className);
		studentList.add(studentDataEntity);

		if (studentDataEntity != null) {
			studentDataEntity = new StudentDataEntity();
		}

		// Saburoのデータ
		ID = 3;
		studentName = "Saburo";
		className = "C";
		studentDataEntity.setID(ID);
		studentDataEntity.setStudentName(studentName);
		studentDataEntity.setClassName(className);
		studentList.add(studentDataEntity);

		return studentList;
	}
}
