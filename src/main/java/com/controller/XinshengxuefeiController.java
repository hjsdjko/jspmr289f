package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinshengxuefeiEntity;
import com.entity.view.XinshengxuefeiView;

import com.service.XinshengxuefeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 新生学费
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
@RestController
@RequestMapping("/xinshengxuefei")
public class XinshengxuefeiController {
    @Autowired
    private XinshengxuefeiService xinshengxuefeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinshengxuefeiEntity xinshengxuefei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xinshengxuefei.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinshengxuefeiEntity> ew = new EntityWrapper<XinshengxuefeiEntity>();
    	PageUtils page = xinshengxuefeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinshengxuefei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinshengxuefeiEntity xinshengxuefei, 
		HttpServletRequest request){
        EntityWrapper<XinshengxuefeiEntity> ew = new EntityWrapper<XinshengxuefeiEntity>();
    	PageUtils page = xinshengxuefeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinshengxuefei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinshengxuefeiEntity xinshengxuefei){
       	EntityWrapper<XinshengxuefeiEntity> ew = new EntityWrapper<XinshengxuefeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinshengxuefei, "xinshengxuefei")); 
        return R.ok().put("data", xinshengxuefeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinshengxuefeiEntity xinshengxuefei){
        EntityWrapper< XinshengxuefeiEntity> ew = new EntityWrapper< XinshengxuefeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinshengxuefei, "xinshengxuefei")); 
		XinshengxuefeiView xinshengxuefeiView =  xinshengxuefeiService.selectView(ew);
		return R.ok("查询新生学费成功").put("data", xinshengxuefeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinshengxuefeiEntity xinshengxuefei = xinshengxuefeiService.selectById(id);
        return R.ok().put("data", xinshengxuefei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinshengxuefeiEntity xinshengxuefei = xinshengxuefeiService.selectById(id);
        return R.ok().put("data", xinshengxuefei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinshengxuefeiEntity xinshengxuefei, HttpServletRequest request){
    	xinshengxuefei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinshengxuefei);

        xinshengxuefeiService.insert(xinshengxuefei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinshengxuefeiEntity xinshengxuefei, HttpServletRequest request){
    	xinshengxuefei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinshengxuefei);

        xinshengxuefeiService.insert(xinshengxuefei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinshengxuefeiEntity xinshengxuefei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinshengxuefei);
        xinshengxuefeiService.updateById(xinshengxuefei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinshengxuefeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinshengxuefeiEntity> wrapper = new EntityWrapper<XinshengxuefeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xinshengxuefeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
