

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class CaculateTotalPriceTest {
    List list = new LinkedList();
    @Before
    public void setUp()throws Exception{

        list.add(new Book(10.0,0.8,3));
        list.add(new Book(20.0,1.0,2));
        list.add(new Book(30.0,1.1,1));

    }
    @Test
    public void testValue()throws Exception{
        assertEquals(97,new CaculateTotalPrice(list).Caculate(),0.01);

    }

}
