package cortex.api.job.tabular

sealed trait Summary {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isClassificationSummary: Boolean = false
  def isBinaryClassificationEvalSummary: Boolean = false
  def isRegressionSummary: Boolean = false
  def classificationSummary: scala.Option[cortex.api.job.tabular.ClassificationSummary] = None
  def binaryClassificationEvalSummary: scala.Option[cortex.api.job.tabular.BinaryClassificationEvalSummary] = None
  def regressionSummary: scala.Option[cortex.api.job.tabular.RegressionSummary] = None
}

object Summary extends {
  @SerialVersionUID(0L)
  case object Empty extends Summary {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}