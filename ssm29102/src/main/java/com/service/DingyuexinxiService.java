package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingyuexinxiView;


/**
 * 订阅信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
public interface DingyuexinxiService extends IService<DingyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingyuexinxiVO> selectListVO(Wrapper<DingyuexinxiEntity> wrapper);
   	
   	DingyuexinxiVO selectVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
   	
   	List<DingyuexinxiView> selectListView(Wrapper<DingyuexinxiEntity> wrapper);
   	
   	DingyuexinxiView selectView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingyuexinxiEntity> wrapper);
   	
}

