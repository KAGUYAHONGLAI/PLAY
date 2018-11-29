package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entiy.design;
import entiy.picture;

public interface ddao {
public List<design> getdesigns(design d);
public List<design> getdesigns2();
public List<design> getdesigns3();
public picture s1(int id);
@Insert("insert into design(name,style,cid,area,cost,word) values (#{name},#{style},#{cid},#{area},#{cost},#{word})")
public void saveDesign(design d);
@Select("select * from design order by id desc limit 1")
public design newDesign();
@Insert("insert into picture(what,path,did) values (#{what},#{path},#{did})")
public void savePicture(picture p);
@Select("select * from picture order by id desc limit 1")
public picture newpicture();

/**
 * @param did	��Ʒ���id
 * @param pid	ͼƬid
 */

/**
 * @param page	ҳ����ʾ����
 * @param offset	ƫ����
 * @return	��ҳ��ѯ��designList
 */
@Select("select * from design limit #{0} offset #{1}")
public List<design> getdesignList(int page,int offset);
@Select("select count(*) from design")
public int count();
/**
 * 
 * @param cid	װ�޹�˾id
 * @param page
 * @param offset
 * @return
 */
@Select("select * from design where cid=#{0} limit #{1} offset #{2}")
public List<design> getDesignList(int cid,int page,int offset);
/**
 * 
 * @param id	design.id
 * @return		design
 */
@Select("select * from design where id= #{0}")
public design getDesign(int id);


}
