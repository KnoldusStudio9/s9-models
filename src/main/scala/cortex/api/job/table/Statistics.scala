package cortex.api.job.table

sealed trait Statistics {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isNumericalStatistics: Boolean = false
  def isCategoricalStatistics: Boolean = false
  def numericalStatistics: scala.Option[cortex.api.job.table.NumericalStatistics] = None
  def categoricalStatistics: scala.Option[cortex.api.job.table.CategoricalStatistics] = None
}

object Statistics extends {
  @SerialVersionUID(0L)
  case object Empty extends Statistics {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}