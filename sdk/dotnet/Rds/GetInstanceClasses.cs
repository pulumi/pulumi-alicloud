// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides the RDS instance classes resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/db_instance_classes.html.markdown.
        /// </summary>
        public static Task<GetInstanceClassesResult> GetInstanceClasses(GetInstanceClassesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstanceClassesResult>("alicloud:rds/getInstanceClasses:getInstanceClasses", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetInstanceClassesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// The DB instance class type by the user.
        /// </summary>
        [Input("dbInstanceClass")]
        public string? DbInstanceClass { get; set; }

        /// <summary>
        /// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
        /// </summary>
        [Input("engine")]
        public string? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public string? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public string? InstanceChargeType { get; set; }

        /// <summary>
        /// Whether to show multi available zone. Default false to not show multi availability zone.
        /// </summary>
        [Input("multiZone")]
        public bool? MultiZone { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("sortedBy")]
        public string? SortedBy { get; set; }

        /// <summary>
        /// The DB instance storage space required by the user. Valid values: `cloud_ssd` and `local_ssd`.
        /// </summary>
        [Input("storageType")]
        public string? StorageType { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetInstanceClassesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetInstanceClassesResult
    {
        public readonly string? Category;
        public readonly string? DbInstanceClass;
        public readonly string? Engine;
        public readonly string? EngineVersion;
        /// <summary>
        /// (Available in 1.60.0+) A list of Rds instance class codes.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceChargeType;
        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceClassesInstanceClassesResult> InstanceClasses;
        public readonly bool? MultiZone;
        public readonly string? OutputFile;
        public readonly string? SortedBy;
        public readonly string? StorageType;
        public readonly string? ZoneId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetInstanceClassesResult(
            string? category,
            string? dbInstanceClass,
            string? engine,
            string? engineVersion,
            ImmutableArray<string> ids,
            string? instanceChargeType,
            ImmutableArray<Outputs.GetInstanceClassesInstanceClassesResult> instanceClasses,
            bool? multiZone,
            string? outputFile,
            string? sortedBy,
            string? storageType,
            string? zoneId,
            string id)
        {
            Category = category;
            DbInstanceClass = dbInstanceClass;
            Engine = engine;
            EngineVersion = engineVersion;
            Ids = ids;
            InstanceChargeType = instanceChargeType;
            InstanceClasses = instanceClasses;
            MultiZone = multiZone;
            OutputFile = outputFile;
            SortedBy = sortedBy;
            StorageType = storageType;
            ZoneId = zoneId;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetInstanceClassesInstanceClassesResult
    {
        /// <summary>
        /// DB Instance available class.
        /// </summary>
        public readonly string InstanceClass;
        public readonly string Price;
        /// <summary>
        /// DB Instance available storage range.
        /// </summary>
        public readonly GetInstanceClassesInstanceClassesStorageRangeResult StorageRange;
        /// <summary>
        /// A list of Zone to launch the DB instance.
        /// </summary>
        public readonly ImmutableArray<GetInstanceClassesInstanceClassesZoneIdsResult> ZoneIds;

        [OutputConstructor]
        private GetInstanceClassesInstanceClassesResult(
            string instanceClass,
            string price,
            GetInstanceClassesInstanceClassesStorageRangeResult storageRange,
            ImmutableArray<GetInstanceClassesInstanceClassesZoneIdsResult> zoneIds)
        {
            InstanceClass = instanceClass;
            Price = price;
            StorageRange = storageRange;
            ZoneIds = zoneIds;
        }
    }

    [OutputType]
    public sealed class GetInstanceClassesInstanceClassesStorageRangeResult
    {
        /// <summary>
        /// DB Instance available storage max value.
        /// </summary>
        public readonly string Max;
        /// <summary>
        /// DB Instance available storage min value.
        /// </summary>
        public readonly string Min;
        /// <summary>
        /// DB Instance available storage increase step.
        /// </summary>
        public readonly string Step;

        [OutputConstructor]
        private GetInstanceClassesInstanceClassesStorageRangeResult(
            string max,
            string min,
            string step)
        {
            Max = max;
            Min = min;
            Step = step;
        }
    }

    [OutputType]
    public sealed class GetInstanceClassesInstanceClassesZoneIdsResult
    {
        /// <summary>
        /// The Zone to launch the DB instance
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of sub zone ids which in the id - e.g If `id` is `cn-beijing-MAZ5(a,b)`, `sub_zone_ids` will be `["cn-beijing-a", "cn-beijing-b"]`.
        /// </summary>
        public readonly ImmutableArray<string> SubZoneIds;

        [OutputConstructor]
        private GetInstanceClassesInstanceClassesZoneIdsResult(
            string id,
            ImmutableArray<string> subZoneIds)
        {
            Id = id;
            SubZoneIds = subZoneIds;
        }
    }
    }
}