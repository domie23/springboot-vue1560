package com.dao;

import com.entity.RuchangtingcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuchangtingcheVO;
import com.entity.view.RuchangtingcheView;


/**
 * 入场停车
 * 
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface RuchangtingcheDao extends BaseMapper<RuchangtingcheEntity> {
	
	List<RuchangtingcheVO> selectListVO(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	
	RuchangtingcheVO selectVO(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	
	List<RuchangtingcheView> selectListView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);

	List<RuchangtingcheView> selectListView(Pagination page,@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	
	RuchangtingcheView selectView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	
}
