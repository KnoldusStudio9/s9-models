package cortex.api.job.pipeline

sealed trait Summary {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isConfusionMatrix: Boolean = false
  def isSimpleSummary: Boolean = false
  def confusionMatrix: scala.Option[cortex.api.job.common.ConfusionMatrix] = None
  def simpleSummary: scala.Option[cortex.api.job.pipeline.SimpleSummary] = None
}
object Summary extends {
  @SerialVersionUID(0L)
  case object Empty extends Summary {
    override def isEmpty: Boolean = true

    override def isDefined: Boolean = false
  }
}