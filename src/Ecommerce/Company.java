package Ecommerce;

import java.util.*;
import java.util.stream.Collectors;

public class Company implements ICompany {
    private int id;
    private String name;
    private List<Category> categories;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
        this.categories = new ArrayList<>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }


    @Override
    public void addCategory(Category category) {
        categories.add(category);
    }

    @Override
    public String getTopCategoryNameByProductCount() {
        return categories.stream()
                .max(Comparator.comparingInt(c -> c.getProducts().size()))
                .map(Category::getName)
                .orElse("No Categories");
    }

    @Override
    public List<Product> getProductBelongingToMultipleCategories() {
        LinkedHashMap<Product, Integer> productCountMap = new LinkedHashMap<>();
        for (Category c : categories) {
            for (Product p : c.getProducts()) {
                productCountMap.put(p, productCountMap.getOrDefault(p, 0) + 1);
            }
        }
        return productCountMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public Map.Entry<String, Double> getTopCategoryBySumOfProductPrices() {
        HashMap<String, Double> categorySum = new HashMap<>();
        for (Category c : categories) {
            double sum = c.getProducts().stream().mapToDouble(Product::getPrice).sum();
            categorySum.put(c.getName(), sum);
        }
        return categorySum.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
    }

    public void printCategorySums() {
        for (Category c : categories) {
            double sum = c.getProducts().stream().mapToDouble(Product::getPrice).sum();
            System.out.println(c.getName() + ": " + sum);
        }
    }
    public void priceGreaterThan100(){
        List<Product> priceGrThan100 = categories.stream().
                flatMap(c -> c.getProducts().stream())
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
        priceGrThan100.forEach(x->{
            System.out.println("Price Greaterthan 100" + x);
        });
    }


    public void productsBelongToSameCategoryPriceGrthan100() {
        Map<String, List<Product>> result = categories.stream()
                .collect(Collectors.toMap(
                        Category::getName
                        , c -> c.getProducts().stream()
                                .filter(p -> p.getPrice() > 100).collect(Collectors.toList())));

        result.forEach((cat, prod)->{
            System.out.println("Category" + cat);
            prod.forEach(p-> System.out.println(" " + p.getName() + " -$" + p.getPrice()));
        });
    }


}