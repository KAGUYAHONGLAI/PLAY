package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entiy.design;

public interface slDao {
	/**
	 * @param page	ҳ����ʾ����
	 * @param offset	ƫ����
	 * @return	��ҳ��ѯ��designList
	 */
	@Select("select * from design  limit #{0} offset #{1}")
	public List<design> getdesignList(int page,int offset);
}
