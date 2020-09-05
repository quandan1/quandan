package com.eliteams.quick4j.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.ZcfgMapper;
import com.eliteams.quick4j.web.model.Zcfg;
import com.eliteams.quick4j.web.service.ZcfgService;
@Service
public class ZcfgServiceImpl extends GenericServiceImpl<Zcfg, Integer> implements ZcfgService{
   
	@Resource
	private ZcfgMapper zcfgMapper;
	
	@Override
	public int update(Zcfg model){
     	return zcfgMapper.updateByPrimaryKeySelective(model);
	}
	
	@Override
	public int insert(Zcfg model){
		return zcfgMapper.insertSelective(model);
	}
	
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return zcfgMapper.deleteById(id);
	}

	
	@Override
	public Zcfg selectById(Integer id) {
		// TODO Auto-generated method stub
		return zcfgMapper.selectByPrimaryKey(id);
	}

	@Override
	public Zcfg selectByName(String name) {
		// TODO Auto-generated method stub
		return zcfgMapper.selectByName(name);
	}

	@Override
	public Model selectByType(String pageNow,Model model,String type) {
		Page page = null;		  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.getCountByType(type);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectByType(page.getStartPosZcfg(), page.getZcfgPageSize(),type);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectByType(page.getStartPosZcfg(), page.getZcfgPageSize(),type);  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}

	@Override
	public Model selectByTypeWithoutGJAndS(String pageNow,Model model) {
		Page page = null;		  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.selectWithoutGJAndSCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectByTypeWithoutGJAndS(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectByTypeWithoutGJAndS(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}
	@Override
	public List<Zcfg> listAll() {
		// TODO Auto-generated method stub
		return zcfgMapper.listAll();
	}

	@Override
	public GenericDao<Zcfg, Integer> getDao() {
		// TODO Auto-generated method stub
		return zcfgMapper;
	}
	
	@Override
	public Model selectCUByPage(String pageNow,Model model){    
	    Page page = null;  
	  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.getCUCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectCUByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectCUByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}

	@Override
	public Model selectByTypeForFolder(String type, String pageNow, Model model) {
		Page page = null;		  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.selectByTypeForFolderCount(type);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectByTypeForFolder(type,page.getStartPosZcfg(), page.getZcfgPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectByTypeForFolder(type,page.getStartPosZcfg(), page.getZcfgPageSize());  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}

	@Override
	public Model selectByTypeForSH(String pageNow, Model model, String type,String final_type) {
		// TODO Auto-generated method stub
		Page page = null;		  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.getCountByTypeForSH(type, final_type);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectByTypeForSH(page.getStartPosZcfg(), page.getZcfgPageSize(),type,final_type);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectByTypeForSH(page.getStartPosZcfg(), page.getZcfgPageSize(),type,final_type);  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}

	@Override
	public Model selectSJByPage(String pageNow,Model model){    
	    Page page = null;  
	  
	    List<Zcfg> zcfg = new ArrayList<Zcfg>();  
	     
	    int totalCount = zcfgMapper.getSJCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        zcfg = zcfgMapper.selectSJByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        zcfg = zcfgMapper.selectSJByPage(page.getStartPosZcfg(), page.getZcfgPageSize());  
	    }  
	    model.addAttribute("zlist",zcfg);
	    model.addAttribute("page",page);
	    return model;
	}

     
}
