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


import com.dao.WeizhiDao;
import com.entity.WeizhiEntity;
import com.service.WeizhiService;
import com.entity.vo.WeizhiVO;
import com.entity.view.WeizhiView;

@Service("weizhiService")
public class WeizhiServiceImpl extends ServiceImpl<WeizhiDao, WeizhiEntity> implements WeizhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeizhiEntity> page = this.selectPage(
                new Query<WeizhiEntity>(params).getPage(),
                new EntityWrapper<WeizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeizhiEntity> wrapper) {
		  Page<WeizhiView> page =new Query<WeizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeizhiVO> selectListVO(Wrapper<WeizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeizhiVO selectVO(Wrapper<WeizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeizhiView> selectListView(Wrapper<WeizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeizhiView selectView(Wrapper<WeizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
