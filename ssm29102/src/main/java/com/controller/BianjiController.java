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

import com.entity.BianjiEntity;
import com.entity.view.BianjiView;

import com.service.BianjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 编辑
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
@RestController
@RequestMapping("/bianji")
public class BianjiController {
    @Autowired
    private BianjiService bianjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BianjiEntity bianji, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			bianji.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BianjiEntity> ew = new EntityWrapper<BianjiEntity>();
		PageUtils page = bianjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BianjiEntity bianji, 
		HttpServletRequest request){
        EntityWrapper<BianjiEntity> ew = new EntityWrapper<BianjiEntity>();
		PageUtils page = bianjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BianjiEntity bianji){
       	EntityWrapper<BianjiEntity> ew = new EntityWrapper<BianjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bianji, "bianji")); 
        return R.ok().put("data", bianjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BianjiEntity bianji){
        EntityWrapper< BianjiEntity> ew = new EntityWrapper< BianjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bianji, "bianji")); 
		BianjiView bianjiView =  bianjiService.selectView(ew);
		return R.ok("查询编辑成功").put("data", bianjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BianjiEntity bianji = bianjiService.selectById(id);
		bianji.setClicknum(bianji.getClicknum()+1);
		bianji.setClicktime(new Date());
		bianjiService.updateById(bianji);
        return R.ok().put("data", bianji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BianjiEntity bianji = bianjiService.selectById(id);
		bianji.setClicknum(bianji.getClicknum()+1);
		bianji.setClicktime(new Date());
		bianjiService.updateById(bianji);
        return R.ok().put("data", bianji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BianjiEntity bianji, HttpServletRequest request){
    	bianji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianji);

        bianjiService.insert(bianji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BianjiEntity bianji, HttpServletRequest request){
    	bianji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianji);

        bianjiService.insert(bianji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BianjiEntity bianji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bianji);
        bianjiService.updateById(bianji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bianjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BianjiEntity> wrapper = new EntityWrapper<BianjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = bianjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,BianjiEntity bianji, HttpServletRequest request,String pre){
        EntityWrapper<BianjiEntity> ew = new EntityWrapper<BianjiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = bianjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianji), params), params));
        return R.ok().put("data", page);
    }


}
