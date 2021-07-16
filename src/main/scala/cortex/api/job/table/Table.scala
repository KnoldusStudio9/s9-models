package cortex.api.job.table

@SerialVersionUID(0L)
final case class Table(
                        meta: scala.Option[cortex.api.job.table.TableMeta] = None,
                        columns: _root_.scala.collection.Seq[cortex.api.job.table.TableColumn] = _root_.scala.collection.Seq.empty
                      )