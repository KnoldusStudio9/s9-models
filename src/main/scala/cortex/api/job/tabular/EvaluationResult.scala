package cortex.api.job.tabular

final case class EvaluationResult(
    output: scala.Option[cortex.api.job.table.DataSource] = None,
    summary: Summary = Summary.Empty
    )