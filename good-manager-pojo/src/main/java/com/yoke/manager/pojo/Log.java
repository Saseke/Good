package com.yoke.manager.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "db_log")
public class Log {
    @Id
    @Column(name = "log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    @Column(name = "create_date")
    private Date createDate;

    private String ip;

    @Column(name = "ip_info")
    private String ipInfo;

    private String name;

    @Column(name = "request_param")
    private String requestParam;

    @Column(name = "request_type")
    private String requestType;

    private Integer time;

    private String url;

    private String user;

    public Log(Integer logId, Date createDate, String ip, String ipInfo, String name, String requestParam, String requestType, Integer time, String url, String user) {
        this.logId = logId;
        this.createDate = createDate;
        this.ip = ip;
        this.ipInfo = ipInfo;
        this.name = name;
        this.requestParam = requestParam;
        this.requestType = requestType;
        this.time = time;
        this.url = url;
        this.user = user;
    }

    public Log() {
        super();
    }

    /**
     * @return log_id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * @return ip_info
     */
    public String getIpInfo() {
        return ipInfo;
    }

    /**
     * @param ipInfo
     */
    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo == null ? null : ipInfo.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return request_param
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * @param requestParam
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    /**
     * @return request_type
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * @param requestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    /**
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}