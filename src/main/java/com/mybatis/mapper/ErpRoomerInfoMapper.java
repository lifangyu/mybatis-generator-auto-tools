package com.mybatis.mapper;

import com.mybatis.model.ErpRoomerInfo;

public interface ErpRoomerInfoMapper {
    /**
     *  根据主键删除数据库的记录,erp_roomer_info
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,erp_roomer_info
     *
     * @param record
     */
    int insert(ErpRoomerInfo record);

    /**
     *  动态字段,写入数据库记录,erp_roomer_info
     *
     * @param record
     */
    int insertSelective(ErpRoomerInfo record);

    /**
     *  根据指定主键获取一条数据库记录,erp_roomer_info
     *
     * @param id
     */
    ErpRoomerInfo selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,erp_roomer_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ErpRoomerInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,erp_roomer_info
     *
     * @param record
     */
    int updateByPrimaryKey(ErpRoomerInfo record);
}