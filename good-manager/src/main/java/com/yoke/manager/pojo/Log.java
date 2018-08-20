package com.yoke.manager.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_log")
public class Log {
    @Id
    @Column(name = "log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    private String name;

    private String url;

    /**
     * 请求类型
     */
    @Column(name = "request_type")
    private String requestType;

    /**
     * 请求参数类型
     */
    @Column(name = "request_param")
    private String requestParam;

    /**
     * 用户
     */
    private String user;

    /**
     * IP
     */
    private String ip;

    /**
     * IP信息
     */
    @Column(name = "ip_info")
    private String ipInfo;

    /**
     * 次数
     */
    private Integer time;

    @Column(name = "create_date")
    private Date createDate;

    public Log(Integer logId, String name, String url, String requestType, String requestParam, String user, String ip, String ipInfo, Integer time, Date createDate) {
        this.logId = logId;
        this.name = name;
        this.url = url;
        this.requestType = requestType;
        this.requestParam = requestParam;
        this.user = user;
        this.ip = ip;
        this.ipInfo = ipInfo;
        this.time = time;
        this.createDate = createDate;
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
     * 获取请求类型
     *
     * @return request_type - 请求类型
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * 设置请求类型
     *
     * @param requestType 请求类型
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    /**
     * 获取请求参数类型
     *
     * @return request_param - 请求参数类型
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * 设置请求参数类型
     *
     * @param requestParam 请求参数类型
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    /**
     * 获取用户
     *
     * @return user - 用户
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置用户
     *
     * @param user 用户
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * 获取IP
     *
     * @return ip - IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取IP信息
     *
     * @return ip_info - IP信息
     */
    public String getIpInfo() {
        return ipInfo;
    }

    /**
     * 设置IP信息
     *
     * @param ipInfo IP信息
     */
    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo == null ? null : ipInfo.trim();
    }

    /**
     * 获取次数
     *
     * @return time - 次数
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置次数
     *
     * @param time 次数
     */
    public void setTime(Integer time) {
        this.time = time;
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
}