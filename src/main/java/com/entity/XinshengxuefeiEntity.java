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
 * 新生学费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
@TableName("xinshengxuefei")
public class XinshengxuefeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinshengxuefeiEntity() {
		
	}
	
	public XinshengxuefeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 收费标题
	 */
					
	private String shoufeibiaoti;
	
	/**
	 * 学费
	 */
					
	private Float xuefei;
	
	/**
	 * 住宿费
	 */
					
	private Float zhusufei;
	
	/**
	 * 书本费
	 */
					
	private Float shubenfei;
	
	/**
	 * 体检费
	 */
					
	private Float tijianfei;
	
	/**
	 * 总金额
	 */
					
	private Float zongjine;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 院系
	 */
					
	private String yuanxi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：收费标题
	 */
	public void setShoufeibiaoti(String shoufeibiaoti) {
		this.shoufeibiaoti = shoufeibiaoti;
	}
	/**
	 * 获取：收费标题
	 */
	public String getShoufeibiaoti() {
		return shoufeibiaoti;
	}
	/**
	 * 设置：学费
	 */
	public void setXuefei(Float xuefei) {
		this.xuefei = xuefei;
	}
	/**
	 * 获取：学费
	 */
	public Float getXuefei() {
		return xuefei;
	}
	/**
	 * 设置：住宿费
	 */
	public void setZhusufei(Float zhusufei) {
		this.zhusufei = zhusufei;
	}
	/**
	 * 获取：住宿费
	 */
	public Float getZhusufei() {
		return zhusufei;
	}
	/**
	 * 设置：书本费
	 */
	public void setShubenfei(Float shubenfei) {
		this.shubenfei = shubenfei;
	}
	/**
	 * 获取：书本费
	 */
	public Float getShubenfei() {
		return shubenfei;
	}
	/**
	 * 设置：体检费
	 */
	public void setTijianfei(Float tijianfei) {
		this.tijianfei = tijianfei;
	}
	/**
	 * 获取：体检费
	 */
	public Float getTijianfei() {
		return tijianfei;
	}
	/**
	 * 设置：总金额
	 */
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：院系
	 */
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
