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


import com.dao.RuchangtingcheDao;
import com.entity.RuchangtingcheEntity;
import com.service.RuchangtingcheService;
import com.entity.vo.RuchangtingcheVO;
import com.entity.view.RuchangtingcheView;

@Service("ruchangtingcheService")
public class RuchangtingcheServiceImpl extends ServiceImpl<RuchangtingcheDao, RuchangtingcheEntity> implements RuchangtingcheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuchangtingcheEntity> page = this.selectPage(
                new Query<RuchangtingcheEntity>(params).getPage(),
                new EntityWrapper<RuchangtingcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuchangtingcheEntity> wrapper) {
		  Page<RuchangtingcheView> page =new Query<RuchangtingcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuchangtingcheVO> selectListVO(Wrapper<RuchangtingcheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuchangtingcheVO selectVO(Wrapper<RuchangtingcheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuchangtingcheView> selectListView(Wrapper<RuchangtingcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuchangtingcheView selectView(Wrapper<RuchangtingcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
