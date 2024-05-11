package com.dao;

import com.entity.WeizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeizhiVO;
import com.entity.view.WeizhiView;


/**
 * 未知
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface WeizhiDao extends BaseMapper<WeizhiEntity> {
	
	List<WeizhiVO> selectListVO(@Param("ew") Wrapper<WeizhiEntity> wrapper);
	
	WeizhiVO selectVO(@Param("ew") Wrapper<WeizhiEntity> wrapper);
	
	List<WeizhiView> selectListView(@Param("ew") Wrapper<WeizhiEntity> wrapper);

	List<WeizhiView> selectListView(Pagination page,@Param("ew") Wrapper<WeizhiEntity> wrapper);
	
	WeizhiView selectView(@Param("ew") Wrapper<WeizhiEntity> wrapper);
	
}
