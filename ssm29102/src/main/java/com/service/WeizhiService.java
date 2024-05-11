package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeizhiView;


/**
 * 未知
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface WeizhiService extends IService<WeizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeizhiVO> selectListVO(Wrapper<WeizhiEntity> wrapper);
   	
   	WeizhiVO selectVO(@Param("ew") Wrapper<WeizhiEntity> wrapper);
   	
   	List<WeizhiView> selectListView(Wrapper<WeizhiEntity> wrapper);
   	
   	WeizhiView selectView(@Param("ew") Wrapper<WeizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeizhiEntity> wrapper);
   	
}

