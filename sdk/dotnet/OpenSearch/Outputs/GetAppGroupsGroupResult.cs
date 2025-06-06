// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.OpenSearch.Outputs
{

    [OutputType]
    public sealed class GetAppGroupsGroupResult
    {
        /// <summary>
        /// The ID of the App Group.
        /// </summary>
        public readonly string AppGroupId;
        /// <summary>
        /// Application Group Name.
        /// </summary>
        public readonly string AppGroupName;
        /// <summary>
        /// Billing model. Valid values:`compute_resource` and `qps`.
        /// </summary>
        public readonly int ChargeWay;
        /// <summary>
        /// The commodity code.
        /// </summary>
        public readonly string CommodityCode;
        /// <summary>
        /// The time of creation.
        /// </summary>
        public readonly int CreateTime;
        /// <summary>
        /// The version of Application Group Name.
        /// </summary>
        public readonly string CurrentVersion;
        /// <summary>
        /// The description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Domain name.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// Expiration Time.
        /// </summary>
        public readonly string ExpireOn;
        /// <summary>
        /// Coarse deployment ID.
        /// </summary>
        public readonly int FirstRankAlgoDeploymentId;
        /// <summary>
        /// Whether the quota status is under approval. Valid status:
        /// </summary>
        public readonly int HasPendingQuotaReviewTask;
        public readonly string Id;
        /// <summary>
        /// The Instance ID.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Locked state. Valid status: `Unlock`,`LockByExpiration`,`ManualLock`.
        /// </summary>
        public readonly string LockMode;
        /// <summary>
        /// Instance is automatically locked after expiration.
        /// </summary>
        public readonly int LockedByExpiration;
        /// <summary>
        /// The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// Refine deployment ID in deployment.
        /// </summary>
        public readonly int PendingSecondRankAlgoDeploymentId;
        /// <summary>
        /// Unfinished order number.
        /// </summary>
        public readonly string ProcessingOrderId;
        /// <summary>
        /// Whether the production is completed. Valid values:
        /// </summary>
        public readonly int Produced;
        /// <summary>
        /// The Project ID.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Quota information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppGroupsGroupQuotaResult> Quotas;
        /// <summary>
        /// The Resource Group ID.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// Refine deployment ID.
        /// </summary>
        public readonly int SecondRankAlgoDeploymentId;
        /// <summary>
        /// The status of the resource. Valid values: `producing`,`review_pending`,`config_pending`,`normal`,`frozen`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The Switched time.
        /// </summary>
        public readonly int SwitchedTime;
        /// <summary>
        /// Application type. Valid Values: `standard`, `enhanced`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAppGroupsGroupResult(
            string appGroupId,

            string appGroupName,

            int chargeWay,

            string commodityCode,

            int createTime,

            string currentVersion,

            string description,

            string domain,

            string expireOn,

            int firstRankAlgoDeploymentId,

            int hasPendingQuotaReviewTask,

            string id,

            string instanceId,

            string lockMode,

            int lockedByExpiration,

            string paymentType,

            int pendingSecondRankAlgoDeploymentId,

            string processingOrderId,

            int produced,

            string projectId,

            ImmutableArray<Outputs.GetAppGroupsGroupQuotaResult> quotas,

            string resourceGroupId,

            int secondRankAlgoDeploymentId,

            string status,

            int switchedTime,

            string type)
        {
            AppGroupId = appGroupId;
            AppGroupName = appGroupName;
            ChargeWay = chargeWay;
            CommodityCode = commodityCode;
            CreateTime = createTime;
            CurrentVersion = currentVersion;
            Description = description;
            Domain = domain;
            ExpireOn = expireOn;
            FirstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            HasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            Id = id;
            InstanceId = instanceId;
            LockMode = lockMode;
            LockedByExpiration = lockedByExpiration;
            PaymentType = paymentType;
            PendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            ProcessingOrderId = processingOrderId;
            Produced = produced;
            ProjectId = projectId;
            Quotas = quotas;
            ResourceGroupId = resourceGroupId;
            SecondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            Status = status;
            SwitchedTime = switchedTime;
            Type = type;
        }
    }
}
