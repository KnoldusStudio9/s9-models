package cortex.api.job.computervision

sealed trait Type{
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isTlModel: Boolean = false
  def isCustomModel: Boolean = false
  def tlModel: scala.Option[cortex.api.job.computervision.TLModel] = None
  def customModel: scala.Option[cortex.api.job.computervision.CustomModel] = None
}
object Type extends {
  @SerialVersionUID(0L)
  case object Empty extends cortex.api.job.computervision.Type {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }

  @SerialVersionUID(0L)
  case class TlModel(value: cortex.api.job.computervision.TLModel) extends cortex.api.job.computervision.Type {
    override def isTlModel: Boolean = true
    override def tlModel: scala.Option[cortex.api.job.computervision.TLModel] = Some(value)
  }
  @SerialVersionUID(0L)
  case class CustomModel(value: cortex.api.job.computervision.CustomModel) extends cortex.api.job.computervision.Type {
    override def isCustomModel: Boolean = true
    override def customModel: scala.Option[cortex.api.job.computervision.CustomModel] = Some(value)
  }
}