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


import com.dao.DiscussbianjiDao;
import com.entity.DiscussbianjiEntity;
import com.service.DiscussbianjiService;
import com.entity.vo.DiscussbianjiVO;
import com.entity.view.DiscussbianjiView;

@Service("discussbianjiService")
public class DiscussbianjiServiceImpl extends ServiceImpl<DiscussbianjiDao, DiscussbianjiEntity> implements DiscussbianjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbianjiEntity> page = this.selectPage(
                new Query<DiscussbianjiEntity>(params).getPage(),
                new EntityWrapper<DiscussbianjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbianjiEntity> wrapper) {
		  Page<DiscussbianjiView> page =new Query<DiscussbianjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbianjiVO> selectListVO(Wrapper<DiscussbianjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbianjiVO selectVO(Wrapper<DiscussbianjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbianjiView> selectListView(Wrapper<DiscussbianjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbianjiView selectView(Wrapper<DiscussbianjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
