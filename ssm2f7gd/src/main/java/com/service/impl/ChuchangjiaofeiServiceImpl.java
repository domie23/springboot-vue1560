package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuchangjiaofeiDao;
import com.entity.ChuchangjiaofeiEntity;
import com.service.ChuchangjiaofeiService;
import com.entity.vo.ChuchangjiaofeiVO;
import com.entity.view.ChuchangjiaofeiView;

@Service("chuchangjiaofeiService")
public class ChuchangjiaofeiServiceImpl extends ServiceImpl<ChuchangjiaofeiDao, ChuchangjiaofeiEntity> implements ChuchangjiaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuchangjiaofeiEntity> page = this.selectPage(
                new Query<ChuchangjiaofeiEntity>(params).getPage(),
                new EntityWrapper<ChuchangjiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuchangjiaofeiEntity> wrapper) {
		  Page<ChuchangjiaofeiView> page =new Query<ChuchangjiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuchangjiaofeiVO> selectListVO(Wrapper<ChuchangjiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuchangjiaofeiVO selectVO(Wrapper<ChuchangjiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuchangjiaofeiView> selectListView(Wrapper<ChuchangjiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuchangjiaofeiView selectView(Wrapper<ChuchangjiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
