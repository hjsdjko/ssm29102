package com.dao;

import com.entity.XiaoxitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxitixingVO;
import com.entity.view.XiaoxitixingView;


/**
 * 消息提醒
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface XiaoxitixingDao extends BaseMapper<XiaoxitixingEntity> {
	
	List<XiaoxitixingVO> selectListVO(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	XiaoxitixingVO selectVO(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	List<XiaoxitixingView> selectListView(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);

	List<XiaoxitixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
	XiaoxitixingView selectView(@Param("ew") Wrapper<XiaoxitixingEntity> wrapper);
	
}
