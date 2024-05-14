package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinshengxuefeiDao;
import com.entity.XinshengxuefeiEntity;
import com.service.XinshengxuefeiService;
import com.entity.vo.XinshengxuefeiVO;
import com.entity.view.XinshengxuefeiView;

@Service("xinshengxuefeiService")
public class XinshengxuefeiServiceImpl extends ServiceImpl<XinshengxuefeiDao, XinshengxuefeiEntity> implements XinshengxuefeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinshengxuefeiEntity> page = this.selectPage(
                new Query<XinshengxuefeiEntity>(params).getPage(),
                new EntityWrapper<XinshengxuefeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinshengxuefeiEntity> wrapper) {
		  Page<XinshengxuefeiView> page =new Query<XinshengxuefeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinshengxuefeiVO> selectListVO(Wrapper<XinshengxuefeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinshengxuefeiVO selectVO(Wrapper<XinshengxuefeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinshengxuefeiView> selectListView(Wrapper<XinshengxuefeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinshengxuefeiView selectView(Wrapper<XinshengxuefeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
