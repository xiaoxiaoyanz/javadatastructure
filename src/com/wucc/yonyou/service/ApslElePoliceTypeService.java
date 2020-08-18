package com.wucc.yonyou.service;

import com.wucc.yonyou.entity.ApslElePoliceType;

import java.util.List;

/**
 * 转移支付警种要素(ApslElePoliceType)表服务接口
 *
 * @author makejava
 * @since 2020-08-06 19:50:10
 */
public interface ApslElePoliceTypeService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	ApslElePoliceType queryById(String id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<ApslElePoliceType> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param apslElePoliceType 实例对象
	 * @return 实例对象
	 */
	ApslElePoliceType insert(ApslElePoliceType apslElePoliceType);

	/**
	 * 修改数据
	 *
	 * @param apslElePoliceType 实例对象
	 * @return 实例对象
	 */
	ApslElePoliceType update(ApslElePoliceType apslElePoliceType);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(String id);

}