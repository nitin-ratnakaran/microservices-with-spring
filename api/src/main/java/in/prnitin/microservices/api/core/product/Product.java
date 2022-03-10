package in.prnitin.microservices.api.core.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Product
 */
@Getter
@AllArgsConstructor
public class Product {
    private final int productId;
    private final String name;
    private final int weight;
    private final String serviceAddress;
}
