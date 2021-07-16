package cortex.api.job.tabular

final case class ParametricModelPredictorSummary(
   coefficient: Double = 0.0,
   stdErr: Double = 0.0,
   tValue: Double = 0.0,
   pValue: Double = 0.0
   )
