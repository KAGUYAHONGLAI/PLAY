package dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import entiy.picture;

public interface pdao {
	/**
	 * 
	 * @param id	��Ʒ���id
	 * @return		����ͼƬ����
	 */
	@Select("select count(*) from dp where did=#{id}")
	public int check(int id );
	@Insert("insert into picture(id,what,path) values(#{id},#{what},#{path})")
	public void addPicture(picture p);
	@Delete("delete from picture where id=#{id}")
	public void delete(int id);
}
