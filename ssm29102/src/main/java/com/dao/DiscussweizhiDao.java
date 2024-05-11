package com.dao;

import com.entity.DiscussweizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussweizhiVO;
import com.entity.view.DiscussweizhiView;


/**
 * 未知评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DiscussweizhiDao extends BaseMapper<DiscussweizhiEntity> {
	
	List<DiscussweizhiVO> selectListVO(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
	
	DiscussweizhiVO selectVO(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
	
	List<DiscussweizhiView> selectListView(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);

	List<DiscussweizhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
	
	DiscussweizhiView selectView(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
	
}
