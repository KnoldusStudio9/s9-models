package cortex.api.job.computervision

sealed trait Value{
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isStringValue: Boolean = false
  def isIntValue: Boolean = false
  def isFloatValue: Boolean = false
  def isBooleanValue: Boolean = false
  def isStringValues: Boolean = false
  def isIntValues: Boolean = false
  def isFloatValues: Boolean = false
  def isBooleanValues: Boolean = false
  def stringValue: scala.Option[String] = None
  def intValue: scala.Option[Int] = None
  def floatValue: scala.Option[Float] = None
  def booleanValue: scala.Option[Boolean] = None
  def stringValues: scala.Option[cortex.api.job.computervision.StringSequenceValue] = None
  def intValues: scala.Option[cortex.api.job.computervision.IntSequenceValue] = None
  def floatValues: scala.Option[cortex.api.job.computervision.FloatSequenceValue] = None
  def booleanValues: scala.Option[cortex.api.job.computervision.BooleanSequenceValue] = None
}
object Value extends {
  @SerialVersionUID(0L)
  case object Empty extends cortex.api.job.computervision.Value {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }

  @SerialVersionUID(0L)
  case class StringValue(value: String) extends cortex.api.job.computervision.Value {
    override def isStringValue: Boolean = true
    override def stringValue: scala.Option[String] = Some(value)
  }
  @SerialVersionUID(0L)
  case class IntValue(value: Int) extends cortex.api.job.computervision.Value {
    override def isIntValue: Boolean = true
    override def intValue: scala.Option[Int] = Some(value)
  }
  @SerialVersionUID(0L)
  case class FloatValue(value: Float) extends cortex.api.job.computervision.Value {
    override def isFloatValue: Boolean = true
    override def floatValue: scala.Option[Float] = Some(value)
  }
  @SerialVersionUID(0L)
  case class BooleanValue(value: Boolean) extends cortex.api.job.computervision.Value {
    override def isBooleanValue: Boolean = true
    override def booleanValue: scala.Option[Boolean] = Some(value)
  }
  @SerialVersionUID(0L)
  case class StringValues(value: cortex.api.job.computervision.StringSequenceValue) extends cortex.api.job.computervision.Value {
    override def isStringValues: Boolean = true
    override def stringValues: scala.Option[cortex.api.job.computervision.StringSequenceValue] = Some(value)
  }
  @SerialVersionUID(0L)
  case class IntValues(value: cortex.api.job.computervision.IntSequenceValue) extends cortex.api.job.computervision.Value {
    override def isIntValues: Boolean = true
    override def intValues: scala.Option[cortex.api.job.computervision.IntSequenceValue] = Some(value)
  }
  @SerialVersionUID(0L)
  case class FloatValues(value: cortex.api.job.computervision.FloatSequenceValue) extends cortex.api.job.computervision.Value {
    override def isFloatValues: Boolean = true
    override def floatValues: scala.Option[cortex.api.job.computervision.FloatSequenceValue] = Some(value)
  }
  @SerialVersionUID(0L)
  case class BooleanValues(value: cortex.api.job.computervision.BooleanSequenceValue) extends cortex.api.job.computervision.Value {
    override def isBooleanValues: Boolean = true
    override def booleanValues: scala.Option[cortex.api.job.computervision.BooleanSequenceValue] = Some(value)
  }
}