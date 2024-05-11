package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussweizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussweizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussweizhiView;


/**
 * 未知评论表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DiscussweizhiService extends IService<DiscussweizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussweizhiVO> selectListVO(Wrapper<DiscussweizhiEntity> wrapper);
   	
   	DiscussweizhiVO selectVO(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
   	
   	List<DiscussweizhiView> selectListView(Wrapper<DiscussweizhiEntity> wrapper);
   	
   	DiscussweizhiView selectView(@Param("ew") Wrapper<DiscussweizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussweizhiEntity> wrapper);
   	
}

