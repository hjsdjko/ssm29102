package com.entity.view;

import com.entity.WeizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 未知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 11:17:13
 */
@TableName("weizhi")
public class WeizhiView  extends WeizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeizhiView(){
	}
 
 	public WeizhiView(WeizhiEntity weizhiEntity){
 	try {
			BeanUtils.copyProperties(this, weizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
