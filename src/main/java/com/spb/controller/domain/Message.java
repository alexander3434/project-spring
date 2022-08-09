package com.spb.controller.domain;

import javax.persistence.*;


@Entity // сущностьЮ, чтоб сохранять в базе данных
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)//были индификаторы (различать 2 записис в одной табличке)
    private Integer id;

    private String text;
    private String tag;

    public Message() {   //должен быть конструктор без параметра (если есть entity)
    }

    public Message(String text, String tag) {
        this.text = text;
        this.text = tag;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setId(String name) {
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String email) {
        this.tag = tag;
    }
}
