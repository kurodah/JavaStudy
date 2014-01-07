package practice.testcode;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import Entity.StudentDataEntity;

import practice.code.MakeListData;


public class MakeListDataTest {

    @Test
    public void makeDataTest() {
        MakeListData makeData = new MakeListData();
		List<StudentDataEntity> studentList = makeData.makeStudentList();
		int firstID = studentList.get(0).getID();
		assertEquals(1, firstID);
    }
}
