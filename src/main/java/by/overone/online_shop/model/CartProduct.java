package by.overone.online_shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartProduct {

    private long users_id;
    private long products_id;
    private long carts_products_count;
    private double carts_products_sum;
}
