package cortex.api.job.project.`package`

sealed trait TypeInfo {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isStringInfo: Boolean = false
  def isIntInfo: Boolean = false
  def isFloatInfo: Boolean = false
  def isBooleanInfo: Boolean = false
  def isAssetInfo: Boolean = false
  def stringInfo: scala.Option[cortex.api.job.project.`package`.StringParameter] = None
  def intInfo: scala.Option[cortex.api.job.project.`package`.IntParameter] = None
  def floatInfo: scala.Option[cortex.api.job.project.`package`.FloatParameter] = None
  def booleanInfo: scala.Option[cortex.api.job.project.`package`.BooleanParameter] = None
  def assetInfo: scala.Option[cortex.api.job.project.`package`.AssetParameter] = None
}

object TypeInfo extends {
  @SerialVersionUID(0L)
  case object Empty extends TypeInfo {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}