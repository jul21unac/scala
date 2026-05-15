package com.Singlenton

final case class ProductCategory( val productCategoryName :String, val productCategoryNameEnglish :String )
{}


object CreateProductCategory{

    def factoryRandomData() : ProductCategory = {
        val categoryName = scala.util.Random.alphanumeric.take(10).mkString
        val categoryNameEnglish = scala.util.Random.alphanumeric.take(10).mkString

        new ProductCategory(categoryName, categoryNameEnglish)
    }
}
