package cortex.api.job.tabular

final case class PredictorSummary(
   name: String = "",
   summary:Summary = Summary.Empty
   )