package com.eliteams.quick4j.web.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * 可重复的（key,value）表，key表示序号，value表示值。
 */
public class MapRepeatable implements Iterable{

    public MapRepeatable(String className){
        this.initList(className);
    }

    public MapRepeatable(List<KeyValue> list){
        this.setList(list);
    }

    public MapRepeatable(String className,Integer key,String value){
        this.initList(className);
        this.add(key,value);
    }

    public MapRepeatable(List list,Integer key,String value){
        this.setList(list);
        this.add(key,value);
    }

    public List<KeyValue> getList() {
        return list;
    }

    public void setList(List<KeyValue> list) {
        this.list = list;
    }

    private List<KeyValue> list;

    /**
     * 初始化序列
     * @param className LinkedList或者ArrayList
     */
    private void initList(String className){
        if ("LinkedList".equals(className)) {
            this.setList(new LinkedList<KeyValue>());
        } else if ("ArrayList".equals(className)) {
            this.setList(new ArrayList<KeyValue>());
        }
    }

    public void add(Integer key,String value){
        this.list.add(new KeyValue(key,value));
    }


    public Iterator<KeyValue> iterator() {
        return this.list.iterator();
    }

}

class KeyValue{
    private Integer key;
    private String value;

    KeyValue() {

    }

    KeyValue(Integer key,String value){
        this.setKey(key);
        this.setValue(value);
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}