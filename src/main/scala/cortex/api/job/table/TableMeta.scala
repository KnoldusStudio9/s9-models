package cortex.api.job.table

@SerialVersionUID(0L)
final case class TableMeta(
                            schema: String = "",
                            name: String = ""
                          )