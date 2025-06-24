package Ecommerce;


import java.util.List;
import java.util.Map;

public interface ICompany {
    int getId();
    String getName();
    List<Category> getCategories();

    void addCategory(Category category);

    String getTopCategoryNameByProductCount();
    List<Product> getProductBelongingToMultipleCategories();
    Map.Entry<String, Double> getTopCategoryBySumOfProductPrices();
}
