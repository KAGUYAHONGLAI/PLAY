import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.DAO;
import dao.entiy;

@RunWith(SpringJUnit4ClassRunner.class) //ʹ��junit4���в���
@ContextConfiguration(locations={"classpath:spring-context.xml"}) //���������ļ�
public class test {
@Autowired
DAO D;
@Test
public void test1() {
	List<entiy>rs=null;
	
	rs= D.prior("����");
	rs.addAll(D.match("����"));
	
	for(entiy e:rs)
	{
		System.out.println(e.getTitle());
		System.out.println(e.getURL());
		System.out.println(e.getText());
	}
	
	}
}
