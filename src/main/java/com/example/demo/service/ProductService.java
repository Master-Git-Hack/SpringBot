package com.example.demo.service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Product;
import com.example.demo.rest.ProductApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductApiClient apiClient;


    public List<Product> getProducts() throws IOException {
        return apiClient.fetchProducts();
    }

    public Product creteProduct(ProductDTO productDTO) {
        Product product = Product.builder()
                .category(productDTO.getCategory())
                .description(productDTO.getDescription())
                .image(productDTO.getImage())
                .title(productDTO.getTitle())
                .price(productDTO.getPrice())
                .build();

        //TODO save product into DB
        return null;
    }

    public boolean deleteProduct(long productId) {
        //TODO delete products from DB
        return true;
    }

    public List<Product> searchProducts(int page, int size, String category) throws IOException {
        return apiClient.fetchProducts();

    }

    public Product findProductById(String productId) throws IOException {
        return apiClient.fetchProducts().get(0);
    }
}