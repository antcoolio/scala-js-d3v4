package org.scalajs.d3v4

import scalajs.js
import scalajs.js.{ undefined, `|` }
import scala.scalajs.js.annotation._
import org.scalajs.dom

// https://github.com/d3/d3-quadtree
@JSImport("d3-quadtree", JSImport.Namespace)
@js.native
object d3quadtree extends js.Object {
  def quadtree[Datum](): Quadtree[Datum] = js.native
  def quadtree[Datum](data: js.Array[Datum]): Quadtree[Datum] = js.native
  def quadtree[Datum](data: js.Array[Datum], x: js.Function1[Datum, Double], y: js.Function1[Datum, Double]): Quadtree[Datum] = js.native
}

@js.native
trait Quadtree[Datum] extends js.Object {
  def x(x: js.Function1[Datum, Double]): Quadtree[Datum] = js.native
  def x(): js.Function1[Datum, Double] = js.native
  def y(y: js.Function1[Datum, Double]): Quadtree[Datum] = js.native
  def y(): js.Function1[Datum, Double] = js.native
  def addAll[NewDatum](data: js.Array[NewDatum]): Quadtree[NewDatum] = js.native
  def find(x: Double, y: Double): Datum = js.native
  def find(x: Double, y: Double, radius: Double): Datum = js.native
}
