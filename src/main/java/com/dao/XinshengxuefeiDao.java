package com.dao;

import com.entity.XinshengxuefeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinshengxuefeiVO;
import com.entity.view.XinshengxuefeiView;


/**
 * 新生学费
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
public interface XinshengxuefeiDao extends BaseMapper<XinshengxuefeiEntity> {
	
	List<XinshengxuefeiVO> selectListVO(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
	
	XinshengxuefeiVO selectVO(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
	
	List<XinshengxuefeiView> selectListView(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);

	List<XinshengxuefeiView> selectListView(Pagination page,@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
	
	XinshengxuefeiView selectView(@Param("ew") Wrapper<XinshengxuefeiEntity> wrapper);
	

}
