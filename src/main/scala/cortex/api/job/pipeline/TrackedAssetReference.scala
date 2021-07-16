package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class TrackedAssetReference(
                                        assetId: String = "",
                                        assetType: cortex.api.job.pipeline.AssetType = cortex.api.job.pipeline.AssetType.TabularModel
                                      )