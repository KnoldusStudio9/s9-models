package cortex.api.job.table

@SerialVersionUID(0L)
final case class TableColumn(
                              name: String = "",
                              dataType: cortex.api.job.table.DataType = cortex.api.job.table.DataType.STRING,
                              variableType: cortex.api.job.table.VariableType = cortex.api.job.table.VariableType.CONTINUOUS
                            )