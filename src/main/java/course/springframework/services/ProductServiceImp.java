package course.springframework.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import course.springframework.model.Author;
import course.springframework.model.Product;
import course.springframework.model.ProductCategory;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

    public ProductServiceImp() {
        loadProducts();
    }

    List<Product> products = new ArrayList<Product>();

    @Override
    public Product getProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;

        }
        return null;
    }

    @Override
    public List<Product> listProducts() {

        return products;
    }

    private void loadProducts() {

        Author jt = new Author();
        jt.setFirstName("Cesar");
        jt.setLastName("Alcivar");
        jt.setId(1);
        jt.setImage("instructor_jt.jpg");

        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Core");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("G.E.A.P");

        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("StartLearning!");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        springIntro.setPrice(new BigDecimal("8"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        products.add(springIntro);

        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        products.add(springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("ThymeleafThumb.png");
        thymeleaf.getProductCategories().add(thymeleafCat);
        products.add(thymeleaf);

        Product springCore = new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle("Spring Core - matering Spring!");
        springCore.setAuthor(jt);
        springCore.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("SpringCoreThumb.png");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        products.add(springCore);

        Product springCoreAdv = new Product();
        springCoreAdv.setId(5);
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("SpringCoreAdvancedThumb.png");
        springCoreAdv.getProductCategories().add(springCoreCat);
        springCoreAdv.getProductCategories().add(springBootCat);
        products.add(springCoreAdv);

        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring Core Dep-Ops");
        springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the cloud!");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription(
                "Spring Framework is a lightweight container as opposed to a J2EE application server. In the case of a web application, a servlet container such as Tomcat or Jetty is enough. But Spring can not only be used to create web applications, it could be used for any Java application, although its usual use is in web environments, nothing prevents you from using it for any type of application.");
        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("SpringCoreDevOpsThumb.png");
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        products.add(springCoreDevOps);

    }

}
