package com.dao;

import com.entity.DingyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingyuexinxiVO;
import com.entity.view.DingyuexinxiView;


/**
 * 订阅信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DingyuexinxiDao extends BaseMapper<DingyuexinxiEntity> {
	
	List<DingyuexinxiVO> selectListVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	DingyuexinxiVO selectVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	List<DingyuexinxiView> selectListView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);

	List<DingyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	DingyuexinxiView selectView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
}
