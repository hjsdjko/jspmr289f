package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinshengxuefeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinshengxuefeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinshengxuefeiView;


/**
 * 新生学费
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
public interface XinshengxuefeiService extends IService<XinshengxuefeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinshengxuefeiVO> selectListVO(Wrapper<XinshengxuefeiEntity> wrapper);
   	
   	XinshengxuefeiVO selectVO(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
   	
   	List<XinshengxuefeiView> selectListView(Wrapper<XinshengxuefeiEntity> wrapper);
   	
   	XinshengxuefeiView selectView(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinshengxuefeiEntity> wrapper);
   	

}

