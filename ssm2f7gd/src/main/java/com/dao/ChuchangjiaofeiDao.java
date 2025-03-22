package com.dao;

import com.entity.ChuchangjiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuchangjiaofeiVO;
import com.entity.view.ChuchangjiaofeiView;


/**
 * 出场缴费
 * 
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface ChuchangjiaofeiDao extends BaseMapper<ChuchangjiaofeiEntity> {
	
	List<ChuchangjiaofeiVO> selectListVO(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
	
	ChuchangjiaofeiVO selectVO(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
	
	List<ChuchangjiaofeiView> selectListView(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);

	List<ChuchangjiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
	
	ChuchangjiaofeiView selectView(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
	
}
