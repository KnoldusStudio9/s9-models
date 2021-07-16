package cortex.api.job.pipeline

sealed trait Value  {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isStringValue: Boolean = false
  def isIntValue: Boolean = false
  def isFloatValue: Boolean = false
  def isBooleanValue: Boolean = false
  def stringValue: scala.Option[String] = None
  def intValue: scala.Option[Int] = None
  def floatValue: scala.Option[Float] = None
  def booleanValue: scala.Option[Boolean] = None
}
object Value extends {
  @SerialVersionUID(0L)
  case object Empty extends Value {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}
