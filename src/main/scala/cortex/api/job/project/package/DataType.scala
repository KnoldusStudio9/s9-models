package cortex.api.job.project.`package`

sealed trait DataType {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isPrimitiveDataType: Boolean = false
  def isComplexDataType: Boolean = false
  def primitiveDataType: scala.Option[cortex.api.job.project.`package`.PrimitiveDataType] = None
  def complexDataType: scala.Option[cortex.api.job.project.`package`.ComplexDataType] = None
}
object DataType extends {
  @SerialVersionUID(0L)
  case object Empty extends DataType {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }
}