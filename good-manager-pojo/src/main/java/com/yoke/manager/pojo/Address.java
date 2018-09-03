package com.yoke.manager.pojo;

import javax.persistence.*;

@Table(name = "db_address")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name = "is_default")
    private Byte isDefault;

    @Column(name = "street_name")
    private String streetName;

    private String tel;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    public Address(Long addressId, Byte isDefault, String streetName, String tel, Long userId, String userName) {
        this.addressId = addressId;
        this.isDefault = isDefault;
        this.streetName = streetName;
        this.tel = tel;
        this.userId = userId;
        this.userName = userName;
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
     * @return is_default
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return street_name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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
}