package com.mybatis.mapper;

import com.mybatis.model.ErpRoomerCollect;

public interface ErpRoomerCollectMapper {
    /**
     *  根据主键删除数据库的记录,erp_roomer_collect
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,erp_roomer_collect
     *
     * @param record
     */
    int insert(ErpRoomerCollect record);

    /**
     *  动态字段,写入数据库记录,erp_roomer_collect
     *
     * @param record
     */
    int insertSelective(ErpRoomerCollect record);

    /**
     *  根据指定主键获取一条数据库记录,erp_roomer_collect
     *
     * @param id
     */
    ErpRoomerCollect selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,erp_roomer_collect
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ErpRoomerCollect record);

    /**
     *  根据主键来更新符合条件的数据库记录,erp_roomer_collect
     *
     * @param record
     */
    int updateByPrimaryKey(ErpRoomerCollect record);
}