/*Copyright (c) 2019-2020 deltadatamandiri.com All Rights Reserved.
 This software is the confidential and proprietary information of deltadatamandiri.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with deltadatamandiri.com*/
package com.enterkomputer_com.enterdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Promo generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`promo`")
public class Promo implements Serializable {

    private Integer id;
    private String images;
    private String promoUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`IMAGES`", nullable = true, length = 255)
    public String getImages() {
        return this.images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Column(name = "`PROMO_URL`", nullable = true, length = 255)
    public String getPromoUrl() {
        return this.promoUrl;
    }

    public void setPromoUrl(String promoUrl) {
        this.promoUrl = promoUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Promo)) return false;
        final Promo promo = (Promo) o;
        return Objects.equals(getId(), promo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}