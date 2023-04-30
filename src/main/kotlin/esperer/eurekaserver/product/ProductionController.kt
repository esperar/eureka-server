package esperer.eurekaserver.product

import esperer.eurekaserver.product.dto.ProductDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductionController {

    @GetMapping
    fun product(): ProductDto {
        return ProductDto("esperer", 1000)
    }
}