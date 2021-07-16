package cortex.api.job.tabular

final case class ClassConfusion(
   className: String = "",
   truePositive: Int = 0,
   trueNegative: Int = 0,
   falsePositive: Int = 0,
   falseNegative: Int = 0
   )
