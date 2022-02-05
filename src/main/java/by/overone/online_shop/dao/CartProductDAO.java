package by.overone.online_shop.dao;

import by.overone.online_shop.dto.CartProductAllInfoDTO;
import by.overone.online_shop.model.CartProduct;

import java.util.List;

public interface CartProductDAO {

    void addCartProduct(CartProduct cartProduct);
    List<CartProductAllInfoDTO> getCartProduct(Long users_id, Long products_id);
    List<CartProduct> getCartProductByUserId(long users_id);
    CartProduct getCartProductByUserIdAndProductId(long user_id, long products_id);
    void deleteCartProductByUserId(long users_id);
    void deleteCartProduct(long users_id, long products_id);
    void updateProductCount(CartProduct cartProduct);
}
