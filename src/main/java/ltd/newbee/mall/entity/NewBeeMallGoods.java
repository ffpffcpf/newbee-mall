/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class NewBeeMallGoods {
    private Long goodsId;

    private String goodsNameZh;
    private String goodsNameEn;
    private String goodsNameCa;

    private String goodsIntro;

    private Long goodsCategoryId;

    private String goodsCoverImg;

    private String goodsCarousel;

    private BigDecimal originalPrice;

    private BigDecimal sellingPrice;

    private Integer stockNum;

    private String tag;

    private Byte goodsSellStatus;

    private Integer createUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Integer updateUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private String goodsDetailContentZh;
    private String goodsDetailContentEn;
    private String goodsDetailContentCa;


    public void setGoodsNameZh(String goodsName) {
        this.goodsNameZh = goodsName == null ? null : goodsName.trim();
    }
    public void setGoodsNameEn(String goodsName) {
        this.goodsNameEn = goodsName == null ? null : goodsName.trim();
    }
    public void setGoodsNameCa(String goodsName) {
        this.goodsNameCa = goodsName == null ? null : goodsName.trim();
    }


    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
    }

    public void setGoodsCoverImg(String goodsCoverImg) {
        this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
    }

    public void setGoodsCarousel(String goodsCarousel) {
        this.goodsCarousel = goodsCarousel == null ? null : goodsCarousel.trim();
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public void setGoodsDetailContentZh(String goodsDetailContent) {
        this.goodsDetailContentZh = goodsDetailContent == null ? null : goodsDetailContent.trim();
    }
    public void setGoodsDetailContentEn(String goodsDetailContent) {
        this.goodsDetailContentEn = goodsDetailContent == null ? null : goodsDetailContent.trim();
    }
    public void setGoodsDetailContentCa(String goodsDetailContent) {
        this.goodsDetailContentCa = goodsDetailContent == null ? null : goodsDetailContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNameZh=").append(goodsNameZh);
        sb.append(", goodsNameEn=").append(goodsNameEn);
        sb.append(", goodsNameCa=").append(goodsNameCa);
        sb.append(", goodsIntro=").append(goodsIntro);
        sb.append(", goodsCoverImg=").append(goodsCoverImg);
        sb.append(", goodsCarousel=").append(goodsCarousel);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", tag=").append(tag);
        sb.append(", goodsSellStatus=").append(goodsSellStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", goodsDetailContentZh=").append(goodsDetailContentZh);
        sb.append(", goodsDetailContentEn=").append(goodsDetailContentEn);
        sb.append(", goodsDetailContentCa=").append(goodsDetailContentCa);
        sb.append("]");
        return sb.toString();
    }
}