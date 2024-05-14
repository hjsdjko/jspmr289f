package com.entity.model;

import com.entity.XueshengqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生签到
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
public class XueshengqiandaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 签到位置
	 */
	
	private String qiandaoweizhi;
		
	/**
	 * 签到时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandaoshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 学生电话
	 */
	
	private String xueshengdianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：签到位置
	 */
	 
	public void setQiandaoweizhi(String qiandaoweizhi) {
		this.qiandaoweizhi = qiandaoweizhi;
	}
	
	/**
	 * 获取：签到位置
	 */
	public String getQiandaoweizhi() {
		return qiandaoweizhi;
	}
				
	
	/**
	 * 设置：签到时间
	 */
	 
	public void setQiandaoshijian(Date qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	
	/**
	 * 获取：签到时间
	 */
	public Date getQiandaoshijian() {
		return qiandaoshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：学生电话
	 */
	 
	public void setXueshengdianhua(String xueshengdianhua) {
		this.xueshengdianhua = xueshengdianhua;
	}
	
	/**
	 * 获取：学生电话
	 */
	public String getXueshengdianhua() {
		return xueshengdianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
