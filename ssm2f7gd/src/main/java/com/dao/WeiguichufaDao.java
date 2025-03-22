package com.dao;

import com.entity.WeiguichufaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeiguichufaVO;
import com.entity.view.WeiguichufaView;


/**
 * 违规处罚
 * 
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface WeiguichufaDao extends BaseMapper<WeiguichufaEntity> {
	
	List<WeiguichufaVO> selectListVO(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
	
	WeiguichufaVO selectVO(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
	
	List<WeiguichufaView> selectListView(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);

	List<WeiguichufaView> selectListView(Pagination page,@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
	
	WeiguichufaView selectView(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
	
}
