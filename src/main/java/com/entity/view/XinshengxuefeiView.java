package com.entity.view;

import com.entity.XinshengxuefeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新生学费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
@TableName("xinshengxuefei")
public class XinshengxuefeiView  extends XinshengxuefeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinshengxuefeiView(){
	}
 
 	public XinshengxuefeiView(XinshengxuefeiEntity xinshengxuefeiEntity){
 	try {
			BeanUtils.copyProperties(this, xinshengxuefeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
