package com.yoke.manager.pojo;

import javax.persistence.*;

@Table(name = "db_address")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    /**
     * 电话
     */
    private String tel;

    /**
     * 街区名字
     */
    @Column(name = "street_name")
    private String streetName;

    /**
     * 是否为默认地址
     */
    @Column(name = "is_default")
    private Byte isDefault;

    public Address(Long addressId, Long userId, String userName, String tel, String streetName, Byte isDefault) {
        this.addressId = addressId;
        this.userId = userId;
        this.userName = userName;
        this.tel = tel;
        this.streetName = streetName;
        this.isDefault = isDefault;
    }

    public Address() {
        super();
    }

    /**
     * @return address_id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * @param addressId
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取街区名字
     *
     * @return street_name - 街区名字
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 设置街区名字
     *
     * @param streetName 街区名字
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    /**
     * 获取是否为默认地址
     *
     * @return is_default - 是否为默认地址
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否为默认地址
     *
     * @param isDefault 是否为默认地址
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }
}