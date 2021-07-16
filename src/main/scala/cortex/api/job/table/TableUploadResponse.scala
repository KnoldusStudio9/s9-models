package cortex.api.job.table

@SerialVersionUID(0L)
final case class TableUploadResponse(
                                      columns: _root_.scala.collection.Seq[cortex.api.job.table.Column] = _root_.scala.collection.Seq.empty
                                    )