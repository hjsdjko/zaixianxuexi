package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 作业
 *
 * @author 
 * @email
 */
@TableName("zuoye")
public class ZuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuoyeEntity() {

	}

	public ZuoyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 老师
     */
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 作业唯一编号
     */
    @TableField(value = "zuoye_uuid_number")

    private String zuoyeUuidNumber;


    /**
     * 作业名称
     */
    @TableField(value = "zuoye_name")

    private String zuoyeName;


    /**
     * 作业类型
     */
    @TableField(value = "zuoye_types")

    private Integer zuoyeTypes;


    /**
     * 班级类型
     */
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 作业发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 作业文件
     */
    @TableField(value = "zuoye_file")

    private String zuoyeFile;


    /**
     * 作业详情
     */
    @TableField(value = "zuoye_content")

    private String zuoyeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：作业唯一编号
	 */
    public String getZuoyeUuidNumber() {
        return zuoyeUuidNumber;
    }


    /**
	 * 获取：作业唯一编号
	 */

    public void setZuoyeUuidNumber(String zuoyeUuidNumber) {
        this.zuoyeUuidNumber = zuoyeUuidNumber;
    }
    /**
	 * 设置：作业名称
	 */
    public String getZuoyeName() {
        return zuoyeName;
    }


    /**
	 * 获取：作业名称
	 */

    public void setZuoyeName(String zuoyeName) {
        this.zuoyeName = zuoyeName;
    }
    /**
	 * 设置：作业类型
	 */
    public Integer getZuoyeTypes() {
        return zuoyeTypes;
    }


    /**
	 * 获取：作业类型
	 */

    public void setZuoyeTypes(Integer zuoyeTypes) {
        this.zuoyeTypes = zuoyeTypes;
    }
    /**
	 * 设置：班级类型
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级类型
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：作业发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：作业发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：作业文件
	 */
    public String getZuoyeFile() {
        return zuoyeFile;
    }


    /**
	 * 获取：作业文件
	 */

    public void setZuoyeFile(String zuoyeFile) {
        this.zuoyeFile = zuoyeFile;
    }
    /**
	 * 设置：作业详情
	 */
    public String getZuoyeContent() {
        return zuoyeContent;
    }


    /**
	 * 获取：作业详情
	 */

    public void setZuoyeContent(String zuoyeContent) {
        this.zuoyeContent = zuoyeContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zuoye{" +
            "id=" + id +
            ", laoshiId=" + laoshiId +
            ", zuoyeUuidNumber=" + zuoyeUuidNumber +
            ", zuoyeName=" + zuoyeName +
            ", zuoyeTypes=" + zuoyeTypes +
            ", banjiTypes=" + banjiTypes +
            ", insertTime=" + insertTime +
            ", zuoyeFile=" + zuoyeFile +
            ", zuoyeContent=" + zuoyeContent +
            ", createTime=" + createTime +
        "}";
    }
}
