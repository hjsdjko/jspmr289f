package com.entity.vo;

import com.entity.TongzhigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 通知公告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
public class TongzhigonggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公告标题
	 */
	
	private String gonggaobiaoti;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 发布内容
	 */
	
	private String fabuneirong;
				
	
	/**
	 * 设置：公告标题
	 */
	 
	public void setGonggaobiaoti(String gonggaobiaoti) {
		this.gonggaobiaoti = gonggaobiaoti;
	}
	
	/**
	 * 获取：公告标题
	 */
	public String getGonggaobiaoti() {
		return gonggaobiaoti;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：发布内容
	 */
	 
	public void setFabuneirong(String fabuneirong) {
		this.fabuneirong = fabuneirong;
	}
	
	/**
	 * 获取：发布内容
	 */
	public String getFabuneirong() {
		return fabuneirong;
	}
			
}
