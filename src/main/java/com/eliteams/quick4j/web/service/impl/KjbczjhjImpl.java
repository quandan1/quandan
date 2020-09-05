package com.eliteams.quick4j.web.service.impl;


import com.eliteams.quick4j.web.dao.CsbcGyzjMapper;
import com.eliteams.quick4j.web.dao.JkzjDataMapper;
import com.eliteams.quick4j.web.dao.JkzjGyzjMapper;
import com.eliteams.quick4j.web.model.CsbcGyzj;
import com.eliteams.quick4j.web.model.JkzjGyzj;
import com.eliteams.quick4j.web.service.KjbczjhjService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 扣缴补偿资金合计
 *
 * @author ZC
 * @since 2018年07月20日21:58:44
 **/

class FormatResult{
	List<Map<String, String>> result;
	List chengshiCount;
	List duanmianCount;
	List zongjiCount;
	List chengshiList;
	List duanmianList;
	List zongji2List;
}

@Service
public class KjbczjhjImpl implements KjbczjhjService {


	/**
	 * 城市补偿各月数据（省市分开的）
	 */
	@Resource
	private CsbcGyzjMapper csbcGyzjMapper;

	/**
	 * 扣缴资金数据
	 */
	@Resource
	private JkzjDataMapper jkzjDataMapper;

	/**
	 * 扣缴各月计算数据
	 */
	@Resource
	private JkzjGyzjMapper jkzjGyzjMapper;
	private List<String> citys;

	public List<String> getCity(){
		if(citys==null)
			citys = jkzjGyzjMapper.selectCity();
		return citys;
	}

	/**
	 * 扣缴资金
	 * @return
	 */
	@Override
	public Map<String,Object> getKjzj() {
		List<JkzjGyzj> gylist = jkzjGyzjMapper.selectByExample(null);
		List<Map<String,Object>> sumlist = jkzjGyzjMapper.selectJkzjZj();
		int sum = jkzjGyzjMapper.selectJkzjAllZj();
		List<Map<String,Object>> monthlist = jkzjGyzjMapper.selectJkzjGyZj();
		Map<String,Object> rmap = new HashMap<>();


		Map map = new HashMap();
		for (Map e:sumlist
				) {
			Object key = e.get("cs_name");
			Object value = e.get("zjzj");
			map.put(key,value);
		}
		rmap.put("市里扣缴总计",map);


		map = new HashMap();
		for (JkzjGyzj e:gylist
				) {
			Object key = e.getCsName()+","+e.getMonth();
			Object value = e.getZjzj();
			map.put(key,value);
		}
		rmap.put("市里各月扣缴总计",map);


		map = new HashMap();
		for (Map e:monthlist
				) {
			Object key = e.get("month");
			Object value = e.get("zjzj");
			map.put(key,value);
		}
		rmap.put("各月扣缴总计",map);
		rmap.put("各月补偿总计",map);
		rmap.put("扣缴总计",sum);
		return rmap;
	}



	/**
	 * 补偿资金
	 * @return
	 */
	@Override
	public Map<String,Object> getBczj() {
		List<CsbcGyzj> gylist = csbcGyzjMapper.selectByExample(null);
		List<Map<String,Object>> sumlist = csbcGyzjMapper.selectBczjZj();
		List<Map<String,Object>> slgylist = csbcGyzjMapper.selectSlBczjGy();
		Map<String,Object> rmap = new HashMap<>();


		int slsum = csbcGyzjMapper.selectSlBczjZj();
		int sum = csbcGyzjMapper.selectBczjAllZj();


		Map map = new HashMap();
		// 省里各月补偿总计
		for (Map e:slgylist
			 ) {
			Object key = e.get("month");
			Object value = e.get("zjzj");
			map.put(key,value);
		}
		rmap.put("省里各月补偿总计",map);

		map = new HashMap();
		for (CsbcGyzj e:gylist
				) {
			Object key = e.getCsName()+","+e.getMonth();
			Object value = e.getZjzj();
			map.put(key,value);
		}
		rmap.put("市里各月补偿总计",map);

		map = new HashMap();
		for (Map e:sumlist
				) {
			Object key = e.get("cs_name");
			Object value = e.get("zjzj");
			map.put(key,value);
		}
		rmap.put("市里补偿总计",map);
		rmap.put("省里补偿总计",slsum);
		rmap.put("补偿总计",sum);
		return rmap;
	}

	/**
	 * 获取表格内容
	 * @return
	 */
	@Override
	public Map<String,Object> getTable() {
		Map map = getKjzj();
		if(map==null)map = new HashMap();
		Map<String,Object> bczj = getBczj();
		map.putAll(bczj);
		return map;
	}

	/**
	 * 填充execl表格
	 * @return
	 * @param wb
	 */
	@Override
	public Workbook fillTable(Workbook wb,String year) {
		/**
		 * 城市各月扣缴总计
		 * 城市扣缴总计
		 * 各月扣缴总计
		 * 各月补偿总计
		 * 扣缴总计
		 * 市里各月补偿总计
		 * 省里各月补偿总计
		 * 市里补偿总计
		 * 省里补偿总计
		 * 补偿总计
		 */
		Map<String,Object> map = getTable();
		wb = testFill(wb,map,year);
		return wb;
	}


	public FormatResult formatResult_kj(Map result) {
		return null;
	}


	/**
	 * 城市各月扣缴总计
	 * 城市扣缴总计
	 * 各月扣缴总计
	 * 各月补偿总计
	 * 扣缴总计
	 * 市里各月补偿总计
	 * 省里各月补偿总计
	 * 市里补偿总计
	 * 省里补偿总计
	 * 补偿总计
	 */
	public Workbook testFill(Workbook wb,Map<String,Object> map,String year){
		// 设置样式

		int firstData=0,lastData=0;

		String excelTitle = year + "年各市各月扣缴及补偿资金合计表";
		XSSFCellStyle subtitleStyle = (XSSFCellStyle) wb.createCellStyle();
		XSSFCellStyle titleStyle = (XSSFCellStyle) wb.createCellStyle();
		XSSFCellStyle contentStyle = (XSSFCellStyle) wb.createCellStyle();
		XSSFCellStyle hejiStyle = (XSSFCellStyle) wb.createCellStyle();

		Font titleFont = wb.createFont();
		Font subtitleFont = wb.createFont();
		Font contentFont = wb.createFont();
		Font hejiFont = wb.createFont();


		// 没用到
		XSSFCellStyle lastStyle = (XSSFCellStyle) wb.createCellStyle();
		XSSFCellStyle xiaojiStyle = (XSSFCellStyle) wb.createCellStyle();
		Font xiaojiFont = wb.createFont();




		xiaojiFont.setFontName("宋体");
		xiaojiFont.setBold(false);
		xiaojiFont.setFontHeightInPoints((short) 14);
		xiaojiStyle.setFont(xiaojiFont);
		xiaojiStyle.setBorderBottom(CellStyle.BORDER_THIN);
		xiaojiStyle.setBorderTop(CellStyle.BORDER_THIN);
		xiaojiStyle.setBorderLeft(CellStyle.BORDER_THIN);
		xiaojiStyle.setBorderRight(CellStyle.BORDER_THIN);
		xiaojiStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		xiaojiStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

		titleFont.setFontName("宋体");
		titleFont.setBold(true);
		titleFont.setFontHeightInPoints((short) 17);
		titleStyle.setFont(titleFont);

		titleStyle.setBorderBottom(CellStyle.BORDER_NONE);
		titleStyle.setBorderTop(CellStyle.BORDER_NONE);
		titleStyle.setBorderLeft(CellStyle.BORDER_NONE);
		titleStyle.setBorderRight(CellStyle.BORDER_NONE);
		titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

		contentFont.setFontName("宋体");
		contentFont.setFontHeightInPoints((short) 10);
		contentStyle.setFont(contentFont);
		contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
		contentStyle.setBorderTop(CellStyle.BORDER_THIN);
		contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
		contentStyle.setBorderRight(CellStyle.BORDER_THIN);
		contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		contentStyle.setWrapText(true);

		hejiFont.setFontName("宋体");
		hejiFont.setBold(true);
		hejiFont.setFontHeightInPoints((short) 10);
		hejiStyle.setFont(hejiFont);
		hejiStyle.setBorderBottom(CellStyle.BORDER_THIN);
		hejiStyle.setBorderTop(CellStyle.BORDER_THIN);
		hejiStyle.setBorderLeft(CellStyle.BORDER_THIN);
		hejiStyle.setBorderRight(CellStyle.BORDER_THIN);
		hejiStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		hejiStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

		subtitleFont.setFontName("宋体");
		subtitleFont.setBold(true);
		subtitleFont.setFontHeightInPoints((short) 11);
		subtitleStyle.setFont(subtitleFont);
		subtitleStyle.setBorderBottom(CellStyle.BORDER_THIN);
		subtitleStyle.setBorderTop(CellStyle.BORDER_THIN);
		subtitleStyle.setBorderLeft(CellStyle.BORDER_THIN);
		subtitleStyle.setBorderRight(CellStyle.BORDER_THIN);
		subtitleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		subtitleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		subtitleStyle.setWrapText(true);
		lastStyle.setBorderTop(CellStyle.BORDER_THIN);
		lastStyle.setBorderBottom(CellStyle.BORDER_THIN);
		lastStyle.setBorderRight(CellStyle.BORDER_THIN);
		lastStyle.setBorderLeft(CellStyle.BORDER_THIN);

		//创建excel工作表
		CreationHelper createHelper = wb.getCreationHelper();
		int months = 10;
		int startMonth=3;
		int firstRow =0 ,firstCol=0,stepRow=0,stepCol=0,lastRow=20,lastCol=months*2+2;//最后一个列表格的列标号22
		Sheet sheet = wb.createSheet(excelTitle);
		stepRow = 2;
		stepCol = lastCol+1;
		CellRangeAddress cra = new CellRangeAddress(firstRow,firstRow+stepRow-1, firstCol, firstCol+stepCol-1);
		sheet.addMergedRegion(cra);
		RegionUtil.setBorderBottom(CellStyle.BORDER_NONE, cra, sheet); // 下边框
		RegionUtil.setBorderLeft(CellStyle.BORDER_NONE, cra, sheet); // 左边框
		RegionUtil.setBorderRight(CellStyle.BORDER_NONE, cra, sheet); // 有边框
		RegionUtil.setBorderTop(CellStyle.BORDER_NONE, cra, sheet); // 上边框
		// 第一行大标题
		Row row0 = sheet.getRow(firstRow);
		Cell cell0 = row0.createCell(firstCol);
		cell0.setCellValue(excelTitle);
		cell0.setCellStyle(titleStyle);

		stepRow++;

		/**
		 * --------------上面是标题-----------------------------------
		 */
		firstCol = 0;
		firstRow = firstRow + stepRow;	//0+1

		stepRow = 2;
		stepCol = 1;
		cra = new CellRangeAddress(firstRow,firstRow+stepRow-1, firstCol, firstCol+stepCol-1);
		sheet.addMergedRegion(cra);
		RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
		RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
		RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
		RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
		// 城市两个字
		row0 = sheet.getRow(firstRow);
		cell0 = row0.createCell(firstCol);
		cell0.setCellValue("城市");
		Cell cl = row0.getCell(firstCol);
		cl.setCellStyle(subtitleStyle);


			/**
			 * -------------扣缴资金和补偿资金小标题---------------
			 *
			 */
		String[] subtitle={"扣缴资金（万元）","补偿资金（万元）"};

		int backStepCol = stepCol;// 备份stepCol
		firstCol = stepCol;
		firstRow = firstRow;
		stepRow = 1;
		stepCol = lastCol / 2;

		for (int i=0;i<2;i++) {
			int index = firstCol + i*stepCol;
			cra = new CellRangeAddress(firstRow, firstRow + stepRow - 1, index, index + stepCol - 1);
			sheet.addMergedRegion(cra);
			RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
			RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
			RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
			RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
			// 城市两个字
			row0 = sheet.getRow(firstRow);
			cell0 = row0.createCell(index);
			cell0.setCellValue(subtitle[i]);
			cell0.setCellStyle(subtitleStyle);
		}
		stepCol = backStepCol; // 恢复stepCol
			/**
			 * -------------月份小标题---------------
			 *
			 */

		backStepCol = stepCol;// 备份stepCol
		firstCol = stepCol;  //1
		firstRow = firstRow + stepRow; //2
		stepRow = 1;
		stepCol = lastCol / 2;

		Row row1 = sheet.createRow(firstRow);
		for (int i = 0; i < 2; i++) {
			int index = firstCol + i*stepCol;
			// stepRow = 1;
			//System.out.println(row1);
			Cell cell1 = row1.createCell(index);
			cell1.setCellValue("合计");
			cell1.setCellStyle(subtitleStyle);
			index++;
			// 月份

			for (int j = 0; j < months; j++) {
				int month = j + startMonth;
//				Row newRow = sheet.createRow(3);
				cell1 = row1.createCell(index);
				cell1.setCellValue(month+"月");
				cell1.setCellStyle(subtitleStyle);
				index++;
			}
		}
		stepCol = backStepCol;
		/**
		 * --------------上面是表头 城市两行-----------------------------------
		 */
		firstCol = 0;  // 1
		stepCol = 1;
		firstRow = firstRow + stepRow; // 3
		stepRow = 1;


		// 省
		row0 = sheet.createRow(firstRow);
		cell0 = row0.createCell(firstCol);
		cell0.setCellValue("省");
		cell0.setCellStyle(contentStyle);

		firstCol = firstCol + stepCol;
		stepCol = lastCol / 2;


		cra = new CellRangeAddress(firstRow, firstRow + stepRow - 1, firstCol, firstCol + stepCol - 1);
		sheet.addMergedRegion(cra);
		RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
		RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
		RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
		RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框


		// 省扣缴资金统计
		row0 = sheet.getRow(firstRow);
		cell0 = row0.createCell(firstCol);
		cell0.setCellValue("/");
		cell0.setCellStyle(contentStyle);

		// 省补偿资金统计
		firstCol = firstCol + stepCol;
		row1 = sheet.getRow(firstRow);
		Cell cell1 = row1.createCell(firstCol);
		Integer slbczj = (Integer) map.get("省里补偿总计");
		if(slbczj!=null){
			cell1.setCellValue(slbczj);
			lastData = slbczj;
		}
		else {
			cell1.setCellValue("");
		}
		cell1.setCellStyle(hejiStyle);
		firstCol++;

		Map<Integer,Double> slgybczj = (Map<Integer, Double>) map.get("省里各月补偿总计");
		// 月份
		for (int j = 0; j < months; j++) {
			int month = j + startMonth;
			cell1 = row1.createCell(firstCol);
			Double value = slgybczj.get(month);
			if(value==null)
				cell1.setCellValue("");
			else
				cell1.setCellValue(value);
			cell1.setCellStyle(hejiStyle);
			firstCol ++;
		}
		/**
		 * --------------上面是第三行 省统计-----------------------------------
		 */
		List<String> cities = getCity();

		firstRow = firstRow + stepRow; // 4
		stepRow = cities.size();
		stepCol = lastCol / 2;
		firstCol = 0;  // 1

		for (int i = 0; i < stepRow; i++) {

			int line = firstRow + i;
			int index = firstCol;
			// 城市名
			String city = cities.get(i);
			row0 = sheet.createRow(line);
			cell0 = row0.createCell(index);
			cell0.setCellValue(city);
			cell0.setCellStyle(contentStyle);
			index ++;

			int innerFirstCol = index;
			for (int k = 0; k < 2; k++) {
				index = innerFirstCol + k*stepCol;

				// 城市资金合计
				Map<String,Double> cszjhe = null;
				if(k==0)
					cszjhe = (Map<String, Double>) map.get("市里扣缴总计");
				else
					cszjhe = (Map<String, Double>) map.get("市里补偿总计");
				// 合计
				Double dheji = cszjhe.get(city);

				cell0 = row0.createCell(index);
				if(dheji!=null){
					cell0.setCellValue(dheji.intValue());
				}
				else {
					cell0.setCellValue("");
				}
				cell0.setCellStyle(hejiStyle);
				index ++;

				Map<Integer,Double> gyzjzj = null;
				if(k==0) {
					gyzjzj = (Map<Integer, Double>) map.get("市里各月扣缴总计");
				}
				else{
					gyzjzj = (Map<Integer, Double>) map.get("市里各月补偿总计");
				}
				// 月份
				for (int j = 0; j < months; j++) {
					int month = j + startMonth;
					cell1 = row0.createCell(index);
					Double value = gyzjzj.get(city+","+month);
					if(value!=null)
						cell1.setCellValue(value);
					else
						cell1.setCellValue("");
					cell1.setCellStyle(contentStyle);
					index ++;
				}
			}
		}

		/**
		 * --------------上面是各个统计-----------------------------------
		 */

		firstRow = firstRow + stepRow; // 最后一行
		stepRow = 1;
		stepCol = lastCol / 2;
		firstCol = 0;  // 1


		row1 = sheet.createRow(firstRow);
		int index = 0;
		cell1 = row1.createCell(index);
		cell1.setCellValue("合计");
		cell1.setCellStyle(contentStyle);

		firstCol = 1;
		for (int i = 0; i < 2; i++) {
			index = firstCol + i*stepCol;
			cell1 = row1.createCell(index);
			Integer zj = null;
			Map<Integer,Double> gyzj=null;
			if(i==0) {
				zj = (Integer) map.get("扣缴总计");
				gyzj = (Map<Integer, Double>) map.get("各月扣缴总计");
			}
			else {
				zj = (Integer) map.get("补偿总计");
				gyzj = (Map<Integer, Double>) map.get("各月补偿总计");
			}
			if (zj!=null) {
				cell1.setCellValue(zj);
				firstData = zj;
			}
			cell1.setCellStyle(hejiStyle);
			index++;


			// 月份
			for (int j = 0; j < months; j++) {
				int month = j + startMonth;
//				Row newRow = sheet.createRow(3);
				cell1 = row1.createCell(index);
				if(gyzj!=null){
					Double value = gyzj.get(month);
					if(value!=null){
						cell1.setCellValue(value.intValue());
					}
				}
				cell1.setCellStyle(hejiStyle);
				index++;
			}
		}
		stepCol = backStepCol;


		/**
		 * 上面是最后一行合计
		 */
		String footer = "备注："+year+"年累计扣缴资金"+firstData+"万元,其中省统筹资金"+lastData+"万元，直接补偿资金"+(firstData-lastData)+"万元。";
		stepRow++;
		firstRow = firstRow + stepRow; // 最后一行
		stepRow = 3;
		stepCol = lastCol;
		firstCol = 0;  // 1

		cra = new CellRangeAddress(firstRow,firstRow+stepRow-1, firstCol, firstCol+stepCol);
		sheet.addMergedRegion(cra);
		RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, cra, sheet); // 下边框
		RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, cra, sheet); // 左边框
		RegionUtil.setBorderRight(CellStyle.BORDER_THIN, cra, sheet); // 有边框
		RegionUtil.setBorderTop(CellStyle.BORDER_THIN, cra, sheet); // 上边框
		// 第一行大标题
		row0 = sheet.getRow(firstRow);
		cell0 = row0.createCell(firstCol);
		cell0.setCellValue(footer);
		cell0.setCellStyle(contentStyle);

		return wb;
	}

}
