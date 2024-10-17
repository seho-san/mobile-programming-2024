package com.example.demo12.dto;

public class BoardDTO {
    private String itemname;
    private String itemprice;

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public BoardDTO(long num, String btitle, String bname) {
        this.num = num;
        this.btitle = btitle;
        this.bname = bname;
    }

    public String getItemprice() {
        return itemprice;
    }

    public String getItemname() {
        return itemname;
    }

    private long num;
    private String btitle;
    private String bname;

    public void ItemDTO(long num, String btitle, String bname) {
        this.num = num;
        this.btitle = btitle;
        this.bname = bname;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
