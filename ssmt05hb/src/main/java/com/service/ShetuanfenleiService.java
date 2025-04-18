package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanfenleiView;


/**
 * 社团分类
 *
 * @author 
 * @email 
 * @date 2022-04-21 18:09:45
 */
public interface ShetuanfenleiService extends IService<ShetuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanfenleiVO> selectListVO(Wrapper<ShetuanfenleiEntity> wrapper);
   	
   	ShetuanfenleiVO selectVO(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
   	
   	List<ShetuanfenleiView> selectListView(Wrapper<ShetuanfenleiEntity> wrapper);
   	
   	ShetuanfenleiView selectView(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanfenleiEntity> wrapper);
   	

}

