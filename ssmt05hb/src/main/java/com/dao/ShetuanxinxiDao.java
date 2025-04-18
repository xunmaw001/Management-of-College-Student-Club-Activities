package com.dao;

import com.entity.ShetuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanxinxiVO;
import com.entity.view.ShetuanxinxiView;


/**
 * 社团信息
 * 
 * @author 
 * @email 
 * @date 2022-04-21 18:09:45
 */
public interface ShetuanxinxiDao extends BaseMapper<ShetuanxinxiEntity> {
	
	List<ShetuanxinxiVO> selectListVO(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
	
	ShetuanxinxiVO selectVO(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
	
	List<ShetuanxinxiView> selectListView(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);

	List<ShetuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
	
	ShetuanxinxiView selectView(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
	

}
