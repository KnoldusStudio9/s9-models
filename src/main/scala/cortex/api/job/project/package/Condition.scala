package cortex.api.job.project.`package`

sealed trait Condition {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isStringCondition: Boolean = false
  def isIntCondition: Boolean = false
  def isFloatCondition: Boolean = false
  def isBooleanCondition: Boolean = false
  def stringCondition: scala.Option[cortex.api.job.project.`package`.StringParameterCondition] = None
  def intCondition: scala.Option[cortex.api.job.project.`package`.IntParameterCondition] = None
  def floatCondition: scala.Option[cortex.api.job.project.`package`.FloatParameterCondition] = None
  def booleanCondition: scala.Option[cortex.api.job.project.`package`.BooleanParameterCondition] = None
}
object Condition extends {
  @SerialVersionUID(0L)
  case object Empty extends Condition {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}
