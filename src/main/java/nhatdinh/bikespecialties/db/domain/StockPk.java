package nhatdinh.bikespecialties.db.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StockPk implements Serializable {
    @Column(name = "store_id")
    private Integer storeId;
    @Column(name = "product_id")
    private Integer productId;

    public StockPk() {}

    public StockPk(Integer storeId, Integer productId) {
        this.storeId = storeId;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "StockPk{" +
                "storeId=" + storeId +
                ", productId=" + productId +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
