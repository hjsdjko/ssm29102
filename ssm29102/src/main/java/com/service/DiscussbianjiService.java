package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbianjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbianjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbianjiView;


/**
 * 编辑评论表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DiscussbianjiService extends IService<DiscussbianjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbianjiVO> selectListVO(Wrapper<DiscussbianjiEntity> wrapper);
   	
   	DiscussbianjiVO selectVO(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
   	
   	List<DiscussbianjiView> selectListView(Wrapper<DiscussbianjiEntity> wrapper);
   	
   	DiscussbianjiView selectView(@Param("ew") Wrapper<DiscussbianjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbianjiEntity> wrapper);
   	
}

