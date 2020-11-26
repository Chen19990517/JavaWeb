package com.msgsys.entity;

/**
 * 作者：czw
 * 日期: 2020/11/26 20:05
 * 描述:
 */
public class Message {
    private Integer id;
    private Integer fromUid;
    private Integer toUid;
    private String mtitle;
    private String mcontent;
    private Integer readFlag;
    private String createtime;

    public Message() {
    }

    public Message(Integer id, Integer fromUid, Integer toUid, String mtitle, String mcontent, Integer readFlag, String createtime) {

        this.id = id;
        this.fromUid = fromUid;
        this.toUid = toUid;
        this.mtitle = mtitle;
        this.mcontent = mcontent;
        this.readFlag = readFlag;
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "MessageService{" +
                "id=" + id +
                ", fromUid=" + fromUid +
                ", toUid=" + toUid +
                ", mtitle='" + mtitle + '\'' +
                ", mcontent='" + mcontent + '\'' +
                ", readFlag=" + readFlag +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Integer getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(Integer readFlag) {
        this.readFlag = readFlag;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
