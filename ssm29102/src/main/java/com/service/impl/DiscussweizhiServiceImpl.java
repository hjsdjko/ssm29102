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


import com.dao.DiscussweizhiDao;
import com.entity.DiscussweizhiEntity;
import com.service.DiscussweizhiService;
import com.entity.vo.DiscussweizhiVO;
import com.entity.view.DiscussweizhiView;

@Service("discussweizhiService")
public class DiscussweizhiServiceImpl extends ServiceImpl<DiscussweizhiDao, DiscussweizhiEntity> implements DiscussweizhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussweizhiEntity> page = this.selectPage(
                new Query<DiscussweizhiEntity>(params).getPage(),
                new EntityWrapper<DiscussweizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussweizhiEntity> wrapper) {
		  Page<DiscussweizhiView> page =new Query<DiscussweizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussweizhiVO> selectListVO(Wrapper<DiscussweizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussweizhiVO selectVO(Wrapper<DiscussweizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussweizhiView> selectListView(Wrapper<DiscussweizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussweizhiView selectView(Wrapper<DiscussweizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
