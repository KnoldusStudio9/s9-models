package cortex.api.job.pipeline

sealed trait Response {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isPipelineStepGeneralResponse: Boolean = false
  def isPipelineStepFailureResponse: Boolean = false
  def pipelineStepGeneralResponse: scala.Option[cortex.api.job.pipeline.PipelineStepGeneralResponse] = None
  def pipelineStepFailureResponse: scala.Option[cortex.api.job.pipeline.PipelineStepFailureResponse] = None
}
object Response extends {
  @SerialVersionUID(0L)
  case object Empty extends Response {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}
