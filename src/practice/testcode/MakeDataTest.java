package practice.testcode;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import Entity.MakeData;

public class MakeDataTest {

    @Test
    public void makeDataTest() {
        MakeData makeData = new MakeData();
        List list = makeData.makeStudentList();
        
        //Iteratorを練習で使ってみる
        for (Iterator i = list.iterator(); i.hasNext();) {
            
            System.out.println(i.next());
        }


        
        
    }
}
