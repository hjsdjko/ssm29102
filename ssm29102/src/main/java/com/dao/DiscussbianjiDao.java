package com.dao;

import com.entity.DiscussbianjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbianjiVO;
import com.entity.view.DiscussbianjiView;


/**
 * 编辑评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DiscussbianjiDao extends BaseMapper<DiscussbianjiEntity> {
	
	List<DiscussbianjiVO> selectListVO(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
	
	DiscussbianjiVO selectVO(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
	
	List<DiscussbianjiView> selectListView(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);

	List<DiscussbianjiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
	
	DiscussbianjiView selectView(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
	
}
