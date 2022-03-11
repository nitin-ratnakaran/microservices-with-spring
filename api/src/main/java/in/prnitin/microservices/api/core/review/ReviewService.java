package in.prnitin.microservices.api.core.review;

import in.prnitin.microservices.api.core.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ReviewService {

    /**
     * Sample usage: "curl $HOST:$PORT/review?productId=1".
     *
     * @param productId Id of the {@link Product}
     * @return the {@link Review} of the {@link Product}
     */
    @GetMapping(value = "/review", produces = "application/json")
    List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);
}
