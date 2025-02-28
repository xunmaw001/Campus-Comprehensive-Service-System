package com.entity.vo;

import com.entity.XunwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 寻物
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunwu")
public class XunwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 寻物名称
     */

    @TableField(value = "xunwu_name")
    private String xunwuName;


    /**
     * 寻物照片
     */

    @TableField(value = "xunwu_photo")
    private String xunwuPhoto;


    /**
     * 联系人
     */

    @TableField(value = "lianxiren_name")
    private String lianxirenName;


    /**
     * 联系人手机号
     */

    @TableField(value = "lianxiren_phone")
    private String lianxirenPhone;


    /**
     * 寻物类型
     */

    @TableField(value = "xunwu_types")
    private Integer xunwuTypes;


    /**
     * 寻物状态
     */

    @TableField(value = "xunwu_zhuangtai_types")
    private Integer xunwuZhuangtaiTypes;


    /**
     * 丢失时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "diushi_time")
    private Date diushiTime;


    /**
     * 丢失地点
     */

    @TableField(value = "diushi_address")
    private String diushiAddress;


    /**
     * 特征
     */

    @TableField(value = "diushi_tezheng")
    private String diushiTezheng;


    /**
     * 寻物详情
     */

    @TableField(value = "xunwu_content")
    private String xunwuContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "xunwu_delete")
    private Integer xunwuDelete;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：寻物名称
	 */
    public String getXunwuName() {
        return xunwuName;
    }


    /**
	 * 获取：寻物名称
	 */

    public void setXunwuName(String xunwuName) {
        this.xunwuName = xunwuName;
    }
    /**
	 * 设置：寻物照片
	 */
    public String getXunwuPhoto() {
        return xunwuPhoto;
    }


    /**
	 * 获取：寻物照片
	 */

    public void setXunwuPhoto(String xunwuPhoto) {
        this.xunwuPhoto = xunwuPhoto;
    }
    /**
	 * 设置：联系人
	 */
    public String getLianxirenName() {
        return lianxirenName;
    }


    /**
	 * 获取：联系人
	 */

    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }
    /**
	 * 设置：联系人手机号
	 */
    public String getLianxirenPhone() {
        return lianxirenPhone;
    }


    /**
	 * 获取：联系人手机号
	 */

    public void setLianxirenPhone(String lianxirenPhone) {
        this.lianxirenPhone = lianxirenPhone;
    }
    /**
	 * 设置：寻物类型
	 */
    public Integer getXunwuTypes() {
        return xunwuTypes;
    }


    /**
	 * 获取：寻物类型
	 */

    public void setXunwuTypes(Integer xunwuTypes) {
        this.xunwuTypes = xunwuTypes;
    }
    /**
	 * 设置：寻物状态
	 */
    public Integer getXunwuZhuangtaiTypes() {
        return xunwuZhuangtaiTypes;
    }


    /**
	 * 获取：寻物状态
	 */

    public void setXunwuZhuangtaiTypes(Integer xunwuZhuangtaiTypes) {
        this.xunwuZhuangtaiTypes = xunwuZhuangtaiTypes;
    }
    /**
	 * 设置：丢失时间
	 */
    public Date getDiushiTime() {
        return diushiTime;
    }


    /**
	 * 获取：丢失时间
	 */

    public void setDiushiTime(Date diushiTime) {
        this.diushiTime = diushiTime;
    }
    /**
	 * 设置：丢失地点
	 */
    public String getDiushiAddress() {
        return diushiAddress;
    }


    /**
	 * 获取：丢失地点
	 */

    public void setDiushiAddress(String diushiAddress) {
        this.diushiAddress = diushiAddress;
    }
    /**
	 * 设置：特征
	 */
    public String getDiushiTezheng() {
        return diushiTezheng;
    }


    /**
	 * 获取：特征
	 */

    public void setDiushiTezheng(String diushiTezheng) {
        this.diushiTezheng = diushiTezheng;
    }
    /**
	 * 设置：寻物详情
	 */
    public String getXunwuContent() {
        return xunwuContent;
    }


    /**
	 * 获取：寻物详情
	 */

    public void setXunwuContent(String xunwuContent) {
        this.xunwuContent = xunwuContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXunwuDelete() {
        return xunwuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXunwuDelete(Integer xunwuDelete) {
        this.xunwuDelete = xunwuDelete;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
