package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Product;
import com.example.service.ProductService;

import java.util.List;

/**
 * ApiControllerクラスは、商品購入アプリのAPIエンドポイントを提供します。
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ProductService productService; // 修正

    /**
     * "Hello, World!"を返すエンドポイント。
     * 
     * @return "Hello, World!"というメッセージ
     */
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("sayHelloメソッドに到達しました");
        return "Hello, World!";
    }
    
    /**
     * 商品リストを取得するエンドポイント。
     * 
     * @return 商品名のリスト
     */
    @GetMapping("/products")
    public List<Product> getProducts() {
        // 商品リストを取得するロジックを追加
        return productService.getProductList();
    }

    /**
     * 指定されたIDの商品詳細を取得するエンドポイント。
     * 
     * @param id 商品ID
     * @return 商品の詳細情報
     */
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable int id) {
        // 商品詳細を取得するロジックを追加
        return productService.getProductDetails(id);
    }

    /**
     * 商品を購入するエンドポイント。
     * 
     * @param productId 購入する商品のID
     * @param quantity 購入する数量
     * @return 購入結果のメッセージ
     */
    @PostMapping("/purchase")
    public String purchaseProduct(@RequestParam int productId, @RequestParam int quantity) {
        // 商品購入のロジックを追加
        return productService.purchaseProduct(productId, quantity);
    }
}