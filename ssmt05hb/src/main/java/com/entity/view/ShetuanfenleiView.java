package com.entity.view;

import com.entity.ShetuanfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 18:09:45
 */
@TableName("shetuanfenlei")
public class ShetuanfenleiView  extends ShetuanfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanfenleiView(){
	}
 
 	public ShetuanfenleiView(ShetuanfenleiEntity shetuanfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
