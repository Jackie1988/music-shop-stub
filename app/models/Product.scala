package models

import play.api.libs.json.{Format, Json}

case class Product(id: String, name: String, description: String, price: String, stockCount: Int)

object Product {
  implicit val productFormat: Format[Product] = Json.format[Product]
}
