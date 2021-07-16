package cortex.api.job.tabular

final case class BinaryClassificationEvalSummary(
    generalClassificationSummary: scala.Option[cortex.api.job.tabular.ClassificationSummary] = None,
    ks: Double = 0.0
    )