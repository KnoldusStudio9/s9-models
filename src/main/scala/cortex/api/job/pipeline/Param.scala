package cortex.api.job.pipeline

sealed trait Param {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isStringParam: Boolean = false
  def isIntParam: Boolean = false
  def isFloatParam: Boolean = false
  def isBooleanParam: Boolean = false
  def isStringParams: Boolean = false
  def isIntParams: Boolean = false
  def isFloatParams: Boolean = false
  def isBooleanParams: Boolean = false
  def isEmptyParams: Boolean = false
  def stringParam: scala.Option[String] = None
  def intParam: scala.Option[Int] = None
  def floatParam: scala.Option[Float] = None
  def booleanParam: scala.Option[Boolean] = None
  def stringParams: scala.Option[cortex.api.job.pipeline.StringSequenceParams] = None
  def intParams: scala.Option[cortex.api.job.pipeline.IntSequenceParams] = None
  def floatParams: scala.Option[cortex.api.job.pipeline.FloatSequenceParams] = None
  def booleanParams: scala.Option[cortex.api.job.pipeline.BooleanSequenceParams] = None
  def emptyParams: scala.Option[cortex.api.job.pipeline.EmptySequenceParams] = None
}
object Param extends {
  @SerialVersionUID(0L)
  case object Empty extends Param {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}