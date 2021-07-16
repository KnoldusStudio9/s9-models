package cortex.api.job.tabular

final case class RegressionSummary(
   rmse: Double = 0.0,
   r2: Double = 0.0,
   mape: Double = 0.0
   )