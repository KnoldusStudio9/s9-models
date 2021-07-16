package cortex.api.job.table

@SerialVersionUID(0L)
final case class TableUploadRequest(
                                     dataSource: scala.Option[cortex.api.job.table.DataSource] = None,
                                     sourceFilePath: String = "",
                                     delimeter: String = "",
                                     nullValue: String = "",
                                     fileType: cortex.api.job.table.FileType = cortex.api.job.table.FileType.CSV,
                                     columns: _root_.scala.collection.Seq[cortex.api.job.table.ColumnInfo] = _root_.scala.collection.Seq.empty
                                   )