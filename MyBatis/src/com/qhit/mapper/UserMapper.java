package com.qhit.mapper;

import java.util.List;

import com.qhit.model.Member;

public interface UserMapper {

	/**
	 * ��ѯ���л�Ա��Ϣ
	 * 
	 * @return
	 */
	public List<Member> selectAllUser();

	/**
	 * ���ݻ�Ա��Ų�ѯ��Ա��Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public Member selectUserById(int id);

	/**
	 * �����Ñ�
	 * 
	 * @param m
	 * @return
	 */
	public int insertUser(Member m);

	/**
	 * �޸Ļ�Ա
	 * 
	 * @param m
	 * @return
	 */
	public int updateUser(Member m);

	/**
	 * ���ݱ��ɾ����Ա
	 * 
	 * @param id
	 *            ���
	 * @return
	 */
	public int delUser(int id);
}