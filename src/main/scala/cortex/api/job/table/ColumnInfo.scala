package cortex.api.job.table

final case class ColumnInfo(
   name: String = "",
   displayName: scala.Option[String] = None,
   datatype: cortex.api.job.table.DataType = cortex.api.job.table.DataType.STRING,
   variableType: scala.Option[cortex.api.job.table.VariableTypeInfo] = None
   )