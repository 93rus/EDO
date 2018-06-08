package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ProductService;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired(required = true)
    @Qualifier(value = "productService")
        public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping(value = "products", method = RequestMethod.GET)
    public String listProduct(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProduct());

        return "products";
    }


    @RequestMapping(value = "/products/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product product){
        if (product.getId() == 0){
            this.productService.addProduct(product);
        }else{
            this.productService.updateProduct(product);
        }
        return "redirect:/products";
    }

    @RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id") int id){
        this.productService.removeProduct(id);

        return "redirect:/products";
    }

    @RequestMapping("edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.productService.getByProductId(id));
        model.addAttribute("listUsers", this.productService.listProduct());

        return "products" ;
    }


    @RequestMapping("productInfo/{id}")
    public String productInfo(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getByProductId(id));

        return "productInfo";
    }
}
