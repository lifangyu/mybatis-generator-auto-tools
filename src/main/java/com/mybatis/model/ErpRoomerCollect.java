package com.mybatis.model;

import java.util.Date;

/**
 * 客源收藏表collect
 * ErpRoomerCollect
 * 数据库表：erp_roomer_collect
 */
public class ErpRoomerCollect {

    /**
     * 主键
     * 表字段 : erp_roomer_collect.id
     */
    private Long id;

    /**
     * 客源唯一编号
     * 表字段 : erp_roomer_collect.roomer_key
     */
    private Long roomerKey;

    /**
     * 收藏人ID
     * 表字段 : erp_roomer_collect.user_id
     */
    private Long userId;

    /**
     * 收藏人名称
     * 表字段 : erp_roomer_collect.user_name
     */
    private String userName;

    /**
     * 收藏时间
     * 表字段 : erp_roomer_collect.create_time
     */
    private Date createTime;

    /**
     * 获取 主键 字段:erp_roomer_collect.id
     *
     * @return erp_roomer_collect.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:erp_roomer_collect.id
     *
     * @param id the value for erp_roomer_collect.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 客源唯一编号 字段:erp_roomer_collect.roomer_key
     *
     * @return erp_roomer_collect.roomer_key, 客源唯一编号
     */
    public Long getRoomerKey() {
        return roomerKey;
    }

    /**
     * 设置 客源唯一编号 字段:erp_roomer_collect.roomer_key
     *
     * @param roomerKey the value for erp_roomer_collect.roomer_key, 客源唯一编号
     */
    public void setRoomerKey(Long roomerKey) {
        this.roomerKey = roomerKey;
    }

    /**
     * 获取 收藏人ID 字段:erp_roomer_collect.user_id
     *
     * @return erp_roomer_collect.user_id, 收藏人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 收藏人ID 字段:erp_roomer_collect.user_id
     *
     * @param userId the value for erp_roomer_collect.user_id, 收藏人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 收藏人名称 字段:erp_roomer_collect.user_name
     *
     * @return erp_roomer_collect.user_name, 收藏人名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 收藏人名称 字段:erp_roomer_collect.user_name
     *
     * @param userName the value for erp_roomer_collect.user_name, 收藏人名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 收藏时间 字段:erp_roomer_collect.create_time
     *
     * @return erp_roomer_collect.create_time, 收藏时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 收藏时间 字段:erp_roomer_collect.create_time
     *
     * @param createTime the value for erp_roomer_collect.create_time, 收藏时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}