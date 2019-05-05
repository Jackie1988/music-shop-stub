package controllers

import play.api.libs.json.Json
import play.api.mvc._
import models.Product

class StoreController
  extends ControllerHelpers {

  val products: List[Product] = List(
    Product("1", "Dean USA Dimebag Guitar", "Mahogany Body and Set-In Neck", "609.00 GBP", 12),
    Product("2", "Fender Mustang 90 PF Guitar", "Torino Red", "479.00 GBP", 5),
    Product("3", "PRS SE 245 Standard Guitar", "Tobacco Sunburst", "475.00 GBP", 1),
    Product("4", "Roland TD-1DMK V-Drums Electonic Drum Kit", "Roland", "520.00 GBP", 4),
    Product("5", "Yamaha P45 Digital Piano", "Black", "365.50 GBP", 3)
  )

  def getProducts: Action[AnyContent]= Action { implicit request ⇒
    Ok(Json.toJson(products))
  }

  def getProduct(id: String): Action[AnyContent]= Action { implicit request ⇒
    val product = products.filter(_.id == id)
    Ok(Json.toJson(product))
  }

}