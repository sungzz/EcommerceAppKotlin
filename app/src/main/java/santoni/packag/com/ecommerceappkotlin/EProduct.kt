package santoni.packag.com.ecommerceappkotlin

class EProduct {

    var id: Int
    var name: String
    var price: Int
    var productPicture: Int


    constructor(id: Int, name: String, price: Int, productPicture: Int){

        this.id = id
        this.name = name
        this.price = price
        this.productPicture = productPicture

    }

}