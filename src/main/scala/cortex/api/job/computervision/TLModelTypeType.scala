package cortex.api.job.computervision

sealed trait TLModelTypeType{
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isLocalizerType: Boolean = false
  def isClassifierType: Boolean = false
  def isAutoencoderType: Boolean = false
  def localizerType: scala.Option[cortex.api.job.common.ClassReference] = None
  def classifierType: scala.Option[cortex.api.job.common.ClassReference] = None
  def autoencoderType: scala.Option[cortex.api.job.common.ClassReference] = None
}
object TLModelTypeType extends {
  @SerialVersionUID(0L)
  case object Empty extends cortex.api.job.computervision.TLModelTypeType {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }

  @SerialVersionUID(0L)
  case class LocalizerType(value: cortex.api.job.common.ClassReference) extends cortex.api.job.computervision.TLModelTypeType {
    override def isLocalizerType: Boolean = true
    override def localizerType: scala.Option[cortex.api.job.common.ClassReference] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ClassifierType(value: cortex.api.job.common.ClassReference) extends cortex.api.job.computervision.TLModelTypeType {
    override def isClassifierType: Boolean = true
    override def classifierType: scala.Option[cortex.api.job.common.ClassReference] = Some(value)
  }
  @SerialVersionUID(0L)
  case class AutoencoderType(value: cortex.api.job.common.ClassReference) extends cortex.api.job.computervision.TLModelTypeType {
    override def isAutoencoderType: Boolean = true
    override def autoencoderType: scala.Option[cortex.api.job.common.ClassReference] = Some(value)
  }
}
