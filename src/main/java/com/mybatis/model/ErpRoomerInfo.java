package com.mybatis.model;

import java.util.Date;

/**
 * 客源基础信息表erp_roomer_info
 * ErpRoomerInfo
 * 数据库表：erp_roomer_info
 */
public class ErpRoomerInfo {

    /**
     * 主键
     * 表字段 : erp_roomer_info.id
     */
    private Long id;

    /**
     * 客源唯一编码
     * 表字段 : erp_roomer_info.roomer_key
     */
    private String roomerKey;

    /**
     * 客源编号(门店首字母+6位序列号)
     * 表字段 : erp_roomer_info.roomer_code
     */
    private String roomerCode;

    /**
     * 交易状态[详见erp_conf_param.type=TRADE_STATUS]
     * 表字段 : erp_roomer_info.trade_status
     */
    private Integer tradeStatus;

    /**
     * 来源[详见erp_conf_param.type=RESOURCE]
     * 表字段 : erp_roomer_info.resource
     */
    private Integer resource;

    /**
     * 交易类型[详见erp_conf_param.type=TRADE_TYPE]
     * 表字段 : erp_roomer_info.trade_type
     */
    private Integer tradeType;

    /**
     * 特性[详见erp_conf_param.type=PECULIARITY_TYPE]
     * 表字段 : erp_roomer_info.peculiarity
     */
    private Integer peculiarity;

    /**
     * 公私[1:公客，2私客]
     * 表字段 : erp_roomer_info.pub_private
     */
    private Integer pubPrivate;

    /**
     * 等级[详见erp_conf_param.type=GRADE]
     * 表字段 : erp_roomer_info.grade
     */
    private String grade;

    /**
     * 委托[详见erp_conf_param.type=ENTRUST]
     * 表字段 : erp_roomer_info.entrust
     */
    private Integer entrust;

    /**
     * 委托日期[精确到日期即可]
     * 表字段 : erp_roomer_info.entrust_date
     */
    private Date entrustDate;

    /**
     * 操作用户ID
     * 表字段 : erp_roomer_info.user_id
     */
    private Long userId;

    /**
     * 客服姓名
     * 表字段 : erp_roomer_info.roomer_name
     */
    private String roomerName;

    /**
     * 联系电话
     * 表字段 : erp_roomer_info.phone
     */
    private String phone;

    /**
     * 身份证号
     * 表字段 : erp_roomer_info.id_num
     */
    private String idNum;

    /**
     * 邮件
     * 表字段 : erp_roomer_info.email
     */
    private String email;

    /**
     * QQ
     * 表字段 : erp_roomer_info.qq
     */
    private String qq;

    /**
     * 现住地址
     * 表字段 : erp_roomer_info.current_address
     */
    private String currentAddress;

    /**
     * 性别[F:女,M:男]
     * 表字段 : erp_roomer_info.sex
     */
    private String sex;

    /**
     * 国籍[详见erp_conf_param.type=country]
     * 表字段 : erp_roomer_info.country
     */
    private String country;

    /**
     * 户籍
     * 表字段 : erp_roomer_info.family_register
     */
    private String familyRegister;

    /**
     * 意向[详见erp_conf_param.type=intention]
     * 表字段 : erp_roomer_info.intention
     */
    private Integer intention;

    /**
     * 期限(购)[详见erp_conf_param.type=buy_deadline]
     * 表字段 : erp_roomer_info.buy_deadline
     */
    private Integer buyDeadline;

    /**
     * 职业[详见erp_conf_param.type=profession]
     * 表字段 : erp_roomer_info.profession
     */
    private Integer profession;

    /**
     * 住房类型[详见erp_conf_param.type=house_type]
     * 表字段 : erp_roomer_info.house_type
     */
    private Integer houseType;

    /**
     * 住房目的[erp_conf_param.type=house_goal]
     * 表字段 : erp_roomer_info.house_goal
     */
    private Integer houseGoal;

    /**
     * 备注
     * 表字段 : erp_roomer_info.remark
     */
    private String remark;

    /**
     * 客源意向-用途[详见erp_conf_param.type=use_type]
     * 表字段 : erp_roomer_info.use_type
     */
    private Integer useType;

    /**
     * 客源意向-户型*室[详见erp_conf_param.type=room_type]
     * 表字段 : erp_roomer_info.room_type
     */
    private String roomType;

    /**
     * 客源意向-户型*厅[详见erp_conf_param.type=number_type]
     * 表字段 : erp_roomer_info.room_hall
     */
    private Integer roomHall;

    /**
     * 客源意向-户型*卫[详见erp_conf_param.type=number_type]
     * 表字段 : erp_roomer_info.room_toilet
     */
    private Integer roomToilet;

    /**
     * 客源意向-户型*阳台[详见erp_conf_param.type=number_type]
     * 表字段 : erp_roomer_info.room_balcony
     */
    private Integer roomBalcony;

    /**
     * 客源意向-城区
     * 表字段 : erp_roomer_info.city_area
     */
    private String cityArea;

    /**
     * 客源意向-片区
     * 表字段 : erp_roomer_info.priece_area
     */
    private String prieceArea;

    /**
     * 客源意向-楼盘
     * 表字段 : erp_roomer_info.house_area
     */
    private String houseArea;

    /**
     * 客源意向-学校
     * 表字段 : erp_roomer_info.school
     */
    private String school;

    /**
     * 客源意向-位置
     * 表字段 : erp_roomer_info.location
     */
    private String location;

    /**
     * 客源意向-面积平方米-最小值
     * 表字段 : erp_roomer_info.square_min
     */
    private Float squareMin;

    /**
     * 客源意向-面积平方米-最大值
     * 表字段 : erp_roomer_info.square_max
     */
    private Float squareMax;

    /**
     * 客源意向-售价/租价-最小值(精确到小数点后4位)
     * 表字段 : erp_roomer_info.selling_min
     */
    private Float sellingMin;

    /**
     * 客源意向-售价/租价-最大值(精确到小数点后4位)
     * 表字段 : erp_roomer_info.selling_max
     */
    private Float sellingMax;

    /**
     * 客源意向-售价/租价单位：万元/元[1万元，2元-租价*元/月]
     * 表字段 : erp_roomer_info.unit
     */
    private Integer unit;

    /**
     * 客源意向-楼层-最小值
     * 表字段 : erp_roomer_info.floor_min
     */
    private Integer floorMin;

    /**
     * 客源意向-楼层-最大值
     * 表字段 : erp_roomer_info.floor_max
     */
    private Integer floorMax;

    /**
     * 客源意向-是否顶层[0空,1非顶层,2是顶层]
     * 表字段 : erp_roomer_info.floor_lase
     */
    private Integer floorLase;

    /**
     * 客源意向-是否是第一层[0空,1非第一层,2是第一层]
     * 表字段 : erp_roomer_info.floor_first
     */
    private Integer floorFirst;

    /**
     * 客源意向-购付款[详见erp_conf_param.type=pay_type]
     * 表字段 : erp_roomer_info.pay_type
     */
    private Integer payType;

    /**
     * 客源意向-朝向[详见erp_conf_param.type=towards_type]
     * 表字段 : erp_roomer_info.towards_type
     */
    private Integer towardsType;

    /**
     * 客源意向-装修[详见erp_conf_param.type=decorate_type]
     * 表字段 : erp_roomer_info.decorate_type
     */
    private Integer decorateType;

    /**
     * 客源第一归属人id
     * 表字段 : erp_roomer_info.belongto_user_id
     */
    private Long belongtoUserId;

    /**
     * 客源第一归属人部门id
     * 表字段 : erp_roomer_info.belongto_partment_id
     */
    private Long belongtoPartmentId;

    /**
     * 状态[1有效，2转客中,3回收站-删除客源进入回收站]
     * 表字段 : erp_roomer_info.STATUS
     */
    private Integer status;

    /**
     * 更新时间
     * 表字段 : erp_roomer_info.update_time
     */
    private Date updateTime;

    /**
     * 创建时间[精确到时分秒]
     * 表字段 : erp_roomer_info.creat_time
     */
    private Date creatTime;

    /**
     * 版本号
     * 表字段 : erp_roomer_info.version
     */
    private Long version;

    /**
     * 获取 主键 字段:erp_roomer_info.id
     *
     * @return erp_roomer_info.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:erp_roomer_info.id
     *
     * @param id the value for erp_roomer_info.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 客源唯一编码 字段:erp_roomer_info.roomer_key
     *
     * @return erp_roomer_info.roomer_key, 客源唯一编码
     */
    public String getRoomerKey() {
        return roomerKey;
    }

    /**
     * 设置 客源唯一编码 字段:erp_roomer_info.roomer_key
     *
     * @param roomerKey the value for erp_roomer_info.roomer_key, 客源唯一编码
     */
    public void setRoomerKey(String roomerKey) {
        this.roomerKey = roomerKey == null ? null : roomerKey.trim();
    }

    /**
     * 获取 客源编号(门店首字母+6位序列号) 字段:erp_roomer_info.roomer_code
     *
     * @return erp_roomer_info.roomer_code, 客源编号(门店首字母+6位序列号)
     */
    public String getRoomerCode() {
        return roomerCode;
    }

    /**
     * 设置 客源编号(门店首字母+6位序列号) 字段:erp_roomer_info.roomer_code
     *
     * @param roomerCode the value for erp_roomer_info.roomer_code, 客源编号(门店首字母+6位序列号)
     */
    public void setRoomerCode(String roomerCode) {
        this.roomerCode = roomerCode == null ? null : roomerCode.trim();
    }

    /**
     * 获取 交易状态[详见erp_conf_param.type=TRADE_STATUS] 字段:erp_roomer_info.trade_status
     *
     * @return erp_roomer_info.trade_status, 交易状态[详见erp_conf_param.type=TRADE_STATUS]
     */
    public Integer getTradeStatus() {
        return tradeStatus;
    }

    /**
     * 设置 交易状态[详见erp_conf_param.type=TRADE_STATUS] 字段:erp_roomer_info.trade_status
     *
     * @param tradeStatus the value for erp_roomer_info.trade_status, 交易状态[详见erp_conf_param.type=TRADE_STATUS]
     */
    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * 获取 来源[详见erp_conf_param.type=RESOURCE] 字段:erp_roomer_info.resource
     *
     * @return erp_roomer_info.resource, 来源[详见erp_conf_param.type=RESOURCE]
     */
    public Integer getResource() {
        return resource;
    }

    /**
     * 设置 来源[详见erp_conf_param.type=RESOURCE] 字段:erp_roomer_info.resource
     *
     * @param resource the value for erp_roomer_info.resource, 来源[详见erp_conf_param.type=RESOURCE]
     */
    public void setResource(Integer resource) {
        this.resource = resource;
    }

    /**
     * 获取 交易类型[详见erp_conf_param.type=TRADE_TYPE] 字段:erp_roomer_info.trade_type
     *
     * @return erp_roomer_info.trade_type, 交易类型[详见erp_conf_param.type=TRADE_TYPE]
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * 设置 交易类型[详见erp_conf_param.type=TRADE_TYPE] 字段:erp_roomer_info.trade_type
     *
     * @param tradeType the value for erp_roomer_info.trade_type, 交易类型[详见erp_conf_param.type=TRADE_TYPE]
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 获取 特性[详见erp_conf_param.type=PECULIARITY_TYPE] 字段:erp_roomer_info.peculiarity
     *
     * @return erp_roomer_info.peculiarity, 特性[详见erp_conf_param.type=PECULIARITY_TYPE]
     */
    public Integer getPeculiarity() {
        return peculiarity;
    }

    /**
     * 设置 特性[详见erp_conf_param.type=PECULIARITY_TYPE] 字段:erp_roomer_info.peculiarity
     *
     * @param peculiarity the value for erp_roomer_info.peculiarity, 特性[详见erp_conf_param.type=PECULIARITY_TYPE]
     */
    public void setPeculiarity(Integer peculiarity) {
        this.peculiarity = peculiarity;
    }

    /**
     * 获取 公私[1:公客，2私客] 字段:erp_roomer_info.pub_private
     *
     * @return erp_roomer_info.pub_private, 公私[1:公客，2私客]
     */
    public Integer getPubPrivate() {
        return pubPrivate;
    }

    /**
     * 设置 公私[1:公客，2私客] 字段:erp_roomer_info.pub_private
     *
     * @param pubPrivate the value for erp_roomer_info.pub_private, 公私[1:公客，2私客]
     */
    public void setPubPrivate(Integer pubPrivate) {
        this.pubPrivate = pubPrivate;
    }

    /**
     * 获取 等级[详见erp_conf_param.type=GRADE] 字段:erp_roomer_info.grade
     *
     * @return erp_roomer_info.grade, 等级[详见erp_conf_param.type=GRADE]
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置 等级[详见erp_conf_param.type=GRADE] 字段:erp_roomer_info.grade
     *
     * @param grade the value for erp_roomer_info.grade, 等级[详见erp_conf_param.type=GRADE]
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * 获取 委托[详见erp_conf_param.type=ENTRUST] 字段:erp_roomer_info.entrust
     *
     * @return erp_roomer_info.entrust, 委托[详见erp_conf_param.type=ENTRUST]
     */
    public Integer getEntrust() {
        return entrust;
    }

    /**
     * 设置 委托[详见erp_conf_param.type=ENTRUST] 字段:erp_roomer_info.entrust
     *
     * @param entrust the value for erp_roomer_info.entrust, 委托[详见erp_conf_param.type=ENTRUST]
     */
    public void setEntrust(Integer entrust) {
        this.entrust = entrust;
    }

    /**
     * 获取 委托日期[精确到日期即可] 字段:erp_roomer_info.entrust_date
     *
     * @return erp_roomer_info.entrust_date, 委托日期[精确到日期即可]
     */
    public Date getEntrustDate() {
        return entrustDate;
    }

    /**
     * 设置 委托日期[精确到日期即可] 字段:erp_roomer_info.entrust_date
     *
     * @param entrustDate the value for erp_roomer_info.entrust_date, 委托日期[精确到日期即可]
     */
    public void setEntrustDate(Date entrustDate) {
        this.entrustDate = entrustDate;
    }

    /**
     * 获取 操作用户ID 字段:erp_roomer_info.user_id
     *
     * @return erp_roomer_info.user_id, 操作用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 操作用户ID 字段:erp_roomer_info.user_id
     *
     * @param userId the value for erp_roomer_info.user_id, 操作用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 客服姓名 字段:erp_roomer_info.roomer_name
     *
     * @return erp_roomer_info.roomer_name, 客服姓名
     */
    public String getRoomerName() {
        return roomerName;
    }

    /**
     * 设置 客服姓名 字段:erp_roomer_info.roomer_name
     *
     * @param roomerName the value for erp_roomer_info.roomer_name, 客服姓名
     */
    public void setRoomerName(String roomerName) {
        this.roomerName = roomerName == null ? null : roomerName.trim();
    }

    /**
     * 获取 联系电话 字段:erp_roomer_info.phone
     *
     * @return erp_roomer_info.phone, 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 联系电话 字段:erp_roomer_info.phone
     *
     * @param phone the value for erp_roomer_info.phone, 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取 身份证号 字段:erp_roomer_info.id_num
     *
     * @return erp_roomer_info.id_num, 身份证号
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置 身份证号 字段:erp_roomer_info.id_num
     *
     * @param idNum the value for erp_roomer_info.id_num, 身份证号
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    /**
     * 获取 邮件 字段:erp_roomer_info.email
     *
     * @return erp_roomer_info.email, 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮件 字段:erp_roomer_info.email
     *
     * @param email the value for erp_roomer_info.email, 邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 QQ 字段:erp_roomer_info.qq
     *
     * @return erp_roomer_info.qq, QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置 QQ 字段:erp_roomer_info.qq
     *
     * @param qq the value for erp_roomer_info.qq, QQ
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 获取 现住地址 字段:erp_roomer_info.current_address
     *
     * @return erp_roomer_info.current_address, 现住地址
     */
    public String getCurrentAddress() {
        return currentAddress;
    }

    /**
     * 设置 现住地址 字段:erp_roomer_info.current_address
     *
     * @param currentAddress the value for erp_roomer_info.current_address, 现住地址
     */
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    /**
     * 获取 性别[F:女,M:男] 字段:erp_roomer_info.sex
     *
     * @return erp_roomer_info.sex, 性别[F:女,M:男]
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置 性别[F:女,M:男] 字段:erp_roomer_info.sex
     *
     * @param sex the value for erp_roomer_info.sex, 性别[F:女,M:男]
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取 国籍[详见erp_conf_param.type=country] 字段:erp_roomer_info.country
     *
     * @return erp_roomer_info.country, 国籍[详见erp_conf_param.type=country]
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置 国籍[详见erp_conf_param.type=country] 字段:erp_roomer_info.country
     *
     * @param country the value for erp_roomer_info.country, 国籍[详见erp_conf_param.type=country]
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取 户籍 字段:erp_roomer_info.family_register
     *
     * @return erp_roomer_info.family_register, 户籍
     */
    public String getFamilyRegister() {
        return familyRegister;
    }

    /**
     * 设置 户籍 字段:erp_roomer_info.family_register
     *
     * @param familyRegister the value for erp_roomer_info.family_register, 户籍
     */
    public void setFamilyRegister(String familyRegister) {
        this.familyRegister = familyRegister == null ? null : familyRegister.trim();
    }

    /**
     * 获取 意向[详见erp_conf_param.type=intention] 字段:erp_roomer_info.intention
     *
     * @return erp_roomer_info.intention, 意向[详见erp_conf_param.type=intention]
     */
    public Integer getIntention() {
        return intention;
    }

    /**
     * 设置 意向[详见erp_conf_param.type=intention] 字段:erp_roomer_info.intention
     *
     * @param intention the value for erp_roomer_info.intention, 意向[详见erp_conf_param.type=intention]
     */
    public void setIntention(Integer intention) {
        this.intention = intention;
    }

    /**
     * 获取 期限(购)[详见erp_conf_param.type=buy_deadline] 字段:erp_roomer_info.buy_deadline
     *
     * @return erp_roomer_info.buy_deadline, 期限(购)[详见erp_conf_param.type=buy_deadline]
     */
    public Integer getBuyDeadline() {
        return buyDeadline;
    }

    /**
     * 设置 期限(购)[详见erp_conf_param.type=buy_deadline] 字段:erp_roomer_info.buy_deadline
     *
     * @param buyDeadline the value for erp_roomer_info.buy_deadline, 期限(购)[详见erp_conf_param.type=buy_deadline]
     */
    public void setBuyDeadline(Integer buyDeadline) {
        this.buyDeadline = buyDeadline;
    }

    /**
     * 获取 职业[详见erp_conf_param.type=profession] 字段:erp_roomer_info.profession
     *
     * @return erp_roomer_info.profession, 职业[详见erp_conf_param.type=profession]
     */
    public Integer getProfession() {
        return profession;
    }

    /**
     * 设置 职业[详见erp_conf_param.type=profession] 字段:erp_roomer_info.profession
     *
     * @param profession the value for erp_roomer_info.profession, 职业[详见erp_conf_param.type=profession]
     */
    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    /**
     * 获取 住房类型[详见erp_conf_param.type=house_type] 字段:erp_roomer_info.house_type
     *
     * @return erp_roomer_info.house_type, 住房类型[详见erp_conf_param.type=house_type]
     */
    public Integer getHouseType() {
        return houseType;
    }

    /**
     * 设置 住房类型[详见erp_conf_param.type=house_type] 字段:erp_roomer_info.house_type
     *
     * @param houseType the value for erp_roomer_info.house_type, 住房类型[详见erp_conf_param.type=house_type]
     */
    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    /**
     * 获取 住房目的[erp_conf_param.type=house_goal] 字段:erp_roomer_info.house_goal
     *
     * @return erp_roomer_info.house_goal, 住房目的[erp_conf_param.type=house_goal]
     */
    public Integer getHouseGoal() {
        return houseGoal;
    }

    /**
     * 设置 住房目的[erp_conf_param.type=house_goal] 字段:erp_roomer_info.house_goal
     *
     * @param houseGoal the value for erp_roomer_info.house_goal, 住房目的[erp_conf_param.type=house_goal]
     */
    public void setHouseGoal(Integer houseGoal) {
        this.houseGoal = houseGoal;
    }

    /**
     * 获取 备注 字段:erp_roomer_info.remark
     *
     * @return erp_roomer_info.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:erp_roomer_info.remark
     *
     * @param remark the value for erp_roomer_info.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 客源意向-用途[详见erp_conf_param.type=use_type] 字段:erp_roomer_info.use_type
     *
     * @return erp_roomer_info.use_type, 客源意向-用途[详见erp_conf_param.type=use_type]
     */
    public Integer getUseType() {
        return useType;
    }

    /**
     * 设置 客源意向-用途[详见erp_conf_param.type=use_type] 字段:erp_roomer_info.use_type
     *
     * @param useType the value for erp_roomer_info.use_type, 客源意向-用途[详见erp_conf_param.type=use_type]
     */
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    /**
     * 获取 客源意向-户型*室[详见erp_conf_param.type=room_type] 字段:erp_roomer_info.room_type
     *
     * @return erp_roomer_info.room_type, 客源意向-户型*室[详见erp_conf_param.type=room_type]
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置 客源意向-户型*室[详见erp_conf_param.type=room_type] 字段:erp_roomer_info.room_type
     *
     * @param roomType the value for erp_roomer_info.room_type, 客源意向-户型*室[详见erp_conf_param.type=room_type]
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    /**
     * 获取 客源意向-户型*厅[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_hall
     *
     * @return erp_roomer_info.room_hall, 客源意向-户型*厅[详见erp_conf_param.type=number_type]
     */
    public Integer getRoomHall() {
        return roomHall;
    }

    /**
     * 设置 客源意向-户型*厅[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_hall
     *
     * @param roomHall the value for erp_roomer_info.room_hall, 客源意向-户型*厅[详见erp_conf_param.type=number_type]
     */
    public void setRoomHall(Integer roomHall) {
        this.roomHall = roomHall;
    }

    /**
     * 获取 客源意向-户型*卫[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_toilet
     *
     * @return erp_roomer_info.room_toilet, 客源意向-户型*卫[详见erp_conf_param.type=number_type]
     */
    public Integer getRoomToilet() {
        return roomToilet;
    }

    /**
     * 设置 客源意向-户型*卫[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_toilet
     *
     * @param roomToilet the value for erp_roomer_info.room_toilet, 客源意向-户型*卫[详见erp_conf_param.type=number_type]
     */
    public void setRoomToilet(Integer roomToilet) {
        this.roomToilet = roomToilet;
    }

    /**
     * 获取 客源意向-户型*阳台[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_balcony
     *
     * @return erp_roomer_info.room_balcony, 客源意向-户型*阳台[详见erp_conf_param.type=number_type]
     */
    public Integer getRoomBalcony() {
        return roomBalcony;
    }

    /**
     * 设置 客源意向-户型*阳台[详见erp_conf_param.type=number_type] 字段:erp_roomer_info.room_balcony
     *
     * @param roomBalcony the value for erp_roomer_info.room_balcony, 客源意向-户型*阳台[详见erp_conf_param.type=number_type]
     */
    public void setRoomBalcony(Integer roomBalcony) {
        this.roomBalcony = roomBalcony;
    }

    /**
     * 获取 客源意向-城区 字段:erp_roomer_info.city_area
     *
     * @return erp_roomer_info.city_area, 客源意向-城区
     */
    public String getCityArea() {
        return cityArea;
    }

    /**
     * 设置 客源意向-城区 字段:erp_roomer_info.city_area
     *
     * @param cityArea the value for erp_roomer_info.city_area, 客源意向-城区
     */
    public void setCityArea(String cityArea) {
        this.cityArea = cityArea == null ? null : cityArea.trim();
    }

    /**
     * 获取 客源意向-片区 字段:erp_roomer_info.priece_area
     *
     * @return erp_roomer_info.priece_area, 客源意向-片区
     */
    public String getPrieceArea() {
        return prieceArea;
    }

    /**
     * 设置 客源意向-片区 字段:erp_roomer_info.priece_area
     *
     * @param prieceArea the value for erp_roomer_info.priece_area, 客源意向-片区
     */
    public void setPrieceArea(String prieceArea) {
        this.prieceArea = prieceArea == null ? null : prieceArea.trim();
    }

    /**
     * 获取 客源意向-楼盘 字段:erp_roomer_info.house_area
     *
     * @return erp_roomer_info.house_area, 客源意向-楼盘
     */
    public String getHouseArea() {
        return houseArea;
    }

    /**
     * 设置 客源意向-楼盘 字段:erp_roomer_info.house_area
     *
     * @param houseArea the value for erp_roomer_info.house_area, 客源意向-楼盘
     */
    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea == null ? null : houseArea.trim();
    }

    /**
     * 获取 客源意向-学校 字段:erp_roomer_info.school
     *
     * @return erp_roomer_info.school, 客源意向-学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置 客源意向-学校 字段:erp_roomer_info.school
     *
     * @param school the value for erp_roomer_info.school, 客源意向-学校
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * 获取 客源意向-位置 字段:erp_roomer_info.location
     *
     * @return erp_roomer_info.location, 客源意向-位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置 客源意向-位置 字段:erp_roomer_info.location
     *
     * @param location the value for erp_roomer_info.location, 客源意向-位置
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取 客源意向-面积平方米-最小值 字段:erp_roomer_info.square_min
     *
     * @return erp_roomer_info.square_min, 客源意向-面积平方米-最小值
     */
    public Float getSquareMin() {
        return squareMin;
    }

    /**
     * 设置 客源意向-面积平方米-最小值 字段:erp_roomer_info.square_min
     *
     * @param squareMin the value for erp_roomer_info.square_min, 客源意向-面积平方米-最小值
     */
    public void setSquareMin(Float squareMin) {
        this.squareMin = squareMin;
    }

    /**
     * 获取 客源意向-面积平方米-最大值 字段:erp_roomer_info.square_max
     *
     * @return erp_roomer_info.square_max, 客源意向-面积平方米-最大值
     */
    public Float getSquareMax() {
        return squareMax;
    }

    /**
     * 设置 客源意向-面积平方米-最大值 字段:erp_roomer_info.square_max
     *
     * @param squareMax the value for erp_roomer_info.square_max, 客源意向-面积平方米-最大值
     */
    public void setSquareMax(Float squareMax) {
        this.squareMax = squareMax;
    }

    /**
     * 获取 客源意向-售价/租价-最小值(精确到小数点后4位) 字段:erp_roomer_info.selling_min
     *
     * @return erp_roomer_info.selling_min, 客源意向-售价/租价-最小值(精确到小数点后4位)
     */
    public Float getSellingMin() {
        return sellingMin;
    }

    /**
     * 设置 客源意向-售价/租价-最小值(精确到小数点后4位) 字段:erp_roomer_info.selling_min
     *
     * @param sellingMin the value for erp_roomer_info.selling_min, 客源意向-售价/租价-最小值(精确到小数点后4位)
     */
    public void setSellingMin(Float sellingMin) {
        this.sellingMin = sellingMin;
    }

    /**
     * 获取 客源意向-售价/租价-最大值(精确到小数点后4位) 字段:erp_roomer_info.selling_max
     *
     * @return erp_roomer_info.selling_max, 客源意向-售价/租价-最大值(精确到小数点后4位)
     */
    public Float getSellingMax() {
        return sellingMax;
    }

    /**
     * 设置 客源意向-售价/租价-最大值(精确到小数点后4位) 字段:erp_roomer_info.selling_max
     *
     * @param sellingMax the value for erp_roomer_info.selling_max, 客源意向-售价/租价-最大值(精确到小数点后4位)
     */
    public void setSellingMax(Float sellingMax) {
        this.sellingMax = sellingMax;
    }

    /**
     * 获取 客源意向-售价/租价单位：万元/元[1万元，2元-租价*元/月] 字段:erp_roomer_info.unit
     *
     * @return erp_roomer_info.unit, 客源意向-售价/租价单位：万元/元[1万元，2元-租价*元/月]
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * 设置 客源意向-售价/租价单位：万元/元[1万元，2元-租价*元/月] 字段:erp_roomer_info.unit
     *
     * @param unit the value for erp_roomer_info.unit, 客源意向-售价/租价单位：万元/元[1万元，2元-租价*元/月]
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 获取 客源意向-楼层-最小值 字段:erp_roomer_info.floor_min
     *
     * @return erp_roomer_info.floor_min, 客源意向-楼层-最小值
     */
    public Integer getFloorMin() {
        return floorMin;
    }

    /**
     * 设置 客源意向-楼层-最小值 字段:erp_roomer_info.floor_min
     *
     * @param floorMin the value for erp_roomer_info.floor_min, 客源意向-楼层-最小值
     */
    public void setFloorMin(Integer floorMin) {
        this.floorMin = floorMin;
    }

    /**
     * 获取 客源意向-楼层-最大值 字段:erp_roomer_info.floor_max
     *
     * @return erp_roomer_info.floor_max, 客源意向-楼层-最大值
     */
    public Integer getFloorMax() {
        return floorMax;
    }

    /**
     * 设置 客源意向-楼层-最大值 字段:erp_roomer_info.floor_max
     *
     * @param floorMax the value for erp_roomer_info.floor_max, 客源意向-楼层-最大值
     */
    public void setFloorMax(Integer floorMax) {
        this.floorMax = floorMax;
    }

    /**
     * 获取 客源意向-是否顶层[0空,1非顶层,2是顶层] 字段:erp_roomer_info.floor_lase
     *
     * @return erp_roomer_info.floor_lase, 客源意向-是否顶层[0空,1非顶层,2是顶层]
     */
    public Integer getFloorLase() {
        return floorLase;
    }

    /**
     * 设置 客源意向-是否顶层[0空,1非顶层,2是顶层] 字段:erp_roomer_info.floor_lase
     *
     * @param floorLase the value for erp_roomer_info.floor_lase, 客源意向-是否顶层[0空,1非顶层,2是顶层]
     */
    public void setFloorLase(Integer floorLase) {
        this.floorLase = floorLase;
    }

    /**
     * 获取 客源意向-是否是第一层[0空,1非第一层,2是第一层] 字段:erp_roomer_info.floor_first
     *
     * @return erp_roomer_info.floor_first, 客源意向-是否是第一层[0空,1非第一层,2是第一层]
     */
    public Integer getFloorFirst() {
        return floorFirst;
    }

    /**
     * 设置 客源意向-是否是第一层[0空,1非第一层,2是第一层] 字段:erp_roomer_info.floor_first
     *
     * @param floorFirst the value for erp_roomer_info.floor_first, 客源意向-是否是第一层[0空,1非第一层,2是第一层]
     */
    public void setFloorFirst(Integer floorFirst) {
        this.floorFirst = floorFirst;
    }

    /**
     * 获取 客源意向-购付款[详见erp_conf_param.type=pay_type] 字段:erp_roomer_info.pay_type
     *
     * @return erp_roomer_info.pay_type, 客源意向-购付款[详见erp_conf_param.type=pay_type]
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置 客源意向-购付款[详见erp_conf_param.type=pay_type] 字段:erp_roomer_info.pay_type
     *
     * @param payType the value for erp_roomer_info.pay_type, 客源意向-购付款[详见erp_conf_param.type=pay_type]
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取 客源意向-朝向[详见erp_conf_param.type=towards_type] 字段:erp_roomer_info.towards_type
     *
     * @return erp_roomer_info.towards_type, 客源意向-朝向[详见erp_conf_param.type=towards_type]
     */
    public Integer getTowardsType() {
        return towardsType;
    }

    /**
     * 设置 客源意向-朝向[详见erp_conf_param.type=towards_type] 字段:erp_roomer_info.towards_type
     *
     * @param towardsType the value for erp_roomer_info.towards_type, 客源意向-朝向[详见erp_conf_param.type=towards_type]
     */
    public void setTowardsType(Integer towardsType) {
        this.towardsType = towardsType;
    }

    /**
     * 获取 客源意向-装修[详见erp_conf_param.type=decorate_type] 字段:erp_roomer_info.decorate_type
     *
     * @return erp_roomer_info.decorate_type, 客源意向-装修[详见erp_conf_param.type=decorate_type]
     */
    public Integer getDecorateType() {
        return decorateType;
    }

    /**
     * 设置 客源意向-装修[详见erp_conf_param.type=decorate_type] 字段:erp_roomer_info.decorate_type
     *
     * @param decorateType the value for erp_roomer_info.decorate_type, 客源意向-装修[详见erp_conf_param.type=decorate_type]
     */
    public void setDecorateType(Integer decorateType) {
        this.decorateType = decorateType;
    }

    /**
     * 获取 客源第一归属人id 字段:erp_roomer_info.belongto_user_id
     *
     * @return erp_roomer_info.belongto_user_id, 客源第一归属人id
     */
    public Long getBelongtoUserId() {
        return belongtoUserId;
    }

    /**
     * 设置 客源第一归属人id 字段:erp_roomer_info.belongto_user_id
     *
     * @param belongtoUserId the value for erp_roomer_info.belongto_user_id, 客源第一归属人id
     */
    public void setBelongtoUserId(Long belongtoUserId) {
        this.belongtoUserId = belongtoUserId;
    }

    /**
     * 获取 客源第一归属人部门id 字段:erp_roomer_info.belongto_partment_id
     *
     * @return erp_roomer_info.belongto_partment_id, 客源第一归属人部门id
     */
    public Long getBelongtoPartmentId() {
        return belongtoPartmentId;
    }

    /**
     * 设置 客源第一归属人部门id 字段:erp_roomer_info.belongto_partment_id
     *
     * @param belongtoPartmentId the value for erp_roomer_info.belongto_partment_id, 客源第一归属人部门id
     */
    public void setBelongtoPartmentId(Long belongtoPartmentId) {
        this.belongtoPartmentId = belongtoPartmentId;
    }

    /**
     * 获取 状态[1有效，2转客中,3回收站-删除客源进入回收站] 字段:erp_roomer_info.STATUS
     *
     * @return erp_roomer_info.STATUS, 状态[1有效，2转客中,3回收站-删除客源进入回收站]
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态[1有效，2转客中,3回收站-删除客源进入回收站] 字段:erp_roomer_info.STATUS
     *
     * @param status the value for erp_roomer_info.STATUS, 状态[1有效，2转客中,3回收站-删除客源进入回收站]
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 更新时间 字段:erp_roomer_info.update_time
     *
     * @return erp_roomer_info.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:erp_roomer_info.update_time
     *
     * @param updateTime the value for erp_roomer_info.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间[精确到时分秒] 字段:erp_roomer_info.creat_time
     *
     * @return erp_roomer_info.creat_time, 创建时间[精确到时分秒]
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置 创建时间[精确到时分秒] 字段:erp_roomer_info.creat_time
     *
     * @param creatTime the value for erp_roomer_info.creat_time, 创建时间[精确到时分秒]
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取 版本号 字段:erp_roomer_info.version
     *
     * @return erp_roomer_info.version, 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置 版本号 字段:erp_roomer_info.version
     *
     * @param version the value for erp_roomer_info.version, 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}