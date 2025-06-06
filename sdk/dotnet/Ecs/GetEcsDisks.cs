// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEcsDisks
    {
        /// <summary>
        /// This data source provides the Ecs Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.122.0.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultEcsDisk = new AliCloud.Ecs.EcsDisk("default", new()
        ///     {
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         DiskName = "terraform-example",
        ///         Description = "terraform-example",
        ///         Category = "cloud_efficiency",
        ///         Size = 30,
        ///         Tags = 
        ///         {
        ///             { "Name", "terraform-example" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsDisks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsDisk.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDiskId0"] = ids.Apply(getEcsDisksResult =&gt; getEcsDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEcsDisksResult> InvokeAsync(GetEcsDisksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEcsDisksResult>("alicloud:ecs/getEcsDisks:getEcsDisks", args ?? new GetEcsDisksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.122.0.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultEcsDisk = new AliCloud.Ecs.EcsDisk("default", new()
        ///     {
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         DiskName = "terraform-example",
        ///         Description = "terraform-example",
        ///         Category = "cloud_efficiency",
        ///         Size = 30,
        ///         Tags = 
        ///         {
        ///             { "Name", "terraform-example" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsDisks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsDisk.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDiskId0"] = ids.Apply(getEcsDisksResult =&gt; getEcsDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEcsDisksResult> Invoke(GetEcsDisksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsDisksResult>("alicloud:ecs/getEcsDisks:getEcsDisks", args ?? new GetEcsDisksInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.122.0.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultEcsDisk = new AliCloud.Ecs.EcsDisk("default", new()
        ///     {
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         DiskName = "terraform-example",
        ///         Description = "terraform-example",
        ///         Category = "cloud_efficiency",
        ///         Size = 30,
        ///         Tags = 
        ///         {
        ///             { "Name", "terraform-example" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsDisks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsDisk.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDiskId0"] = ids.Apply(getEcsDisksResult =&gt; getEcsDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEcsDisksResult> Invoke(GetEcsDisksInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsDisksResult>("alicloud:ecs/getEcsDisks:getEcsDisks", args ?? new GetEcsDisksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEcsDisksArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private List<string>? _additionalAttributes;

        /// <summary>
        /// Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
        /// </summary>
        public List<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new List<string>());
            set => _additionalAttributes = value;
        }

        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public string? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Field `availability_zone` has been deprecated from provider version 1.122.0. New field `zone_id` instead.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category. Valid values: `cloud`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`, `ephemeral_ssd`, `cloud_auto`, `cloud_essd_entry`.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("deleteAutoSnapshot")]
        public bool? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public bool? DeleteWithInstance { get; set; }

        /// <summary>
        /// The disk name.
        /// </summary>
        [Input("diskName")]
        public string? DiskName { get; set; }

        /// <summary>
        /// The disk type. Valid values: `system`, `data`, `all`.
        /// </summary>
        [Input("diskType")]
        public string? DiskType { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
        /// </summary>
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("enableAutoSnapshot")]
        public bool? EnableAutoSnapshot { get; set; }

        /// <summary>
        /// Whether the cloud disk has an automatic snapshot policy
        /// </summary>
        [Input("enableAutomatedSnapshotPolicy")]
        public bool? EnableAutomatedSnapshotPolicy { get; set; }

        /// <summary>
        /// Whether it is shared block storage.
        /// </summary>
        [Input("enableShared")]
        public bool? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not. Valid values: `on` and `off`.
        /// </summary>
        [Input("encrypted")]
        public string? Encrypted { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Disk IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Filter the results by the specified ECS instance ID.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public string? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Disk name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("operationLocks")]
        private List<Inputs.GetEcsDisksOperationLockArgs>? _operationLocks;

        /// <summary>
        /// The reasons why the disk was locked. See `operation_locks` below for details.
        /// </summary>
        public List<Inputs.GetEcsDisksOperationLockArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new List<Inputs.GetEcsDisksOperationLockArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// Payment method for disk. Valid Values: `PayAsYouGo`, `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public string? PaymentType { get; set; }

        /// <summary>
        /// Whether the cloud disk or local disk supports uninstallation.
        /// </summary>
        [Input("portable")]
        public bool? Portable { get; set; }

        /// <summary>
        /// The Id of resource group which the disk belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The source snapshot id.
        /// </summary>
        [Input("snapshotId")]
        public string? SnapshotId { get; set; }

        /// <summary>
        /// The status of disk. Valid Values: `Attaching`, `Available`, `Creating`, `Detaching`, `In_use`, `Migrating`, `ReIniting`, `Transferring`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags assigned to the disks.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// Field `type` has been deprecated from provider version 1.122.0. New field `disk_type` instead.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// ID of the free zone to which the disk belongs.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetEcsDisksArgs()
        {
        }
        public static new GetEcsDisksArgs Empty => new GetEcsDisksArgs();
    }

    public sealed class GetEcsDisksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private InputList<string>? _additionalAttributes;

        /// <summary>
        /// Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
        /// </summary>
        public InputList<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new InputList<string>());
            set => _additionalAttributes = value;
        }

        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Field `availability_zone` has been deprecated from provider version 1.122.0. New field `zone_id` instead.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category. Valid values: `cloud`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`, `ephemeral_ssd`, `cloud_auto`, `cloud_essd_entry`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("deleteAutoSnapshot")]
        public Input<bool>? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// The disk name.
        /// </summary>
        [Input("diskName")]
        public Input<string>? DiskName { get; set; }

        /// <summary>
        /// The disk type. Valid values: `system`, `data`, `all`.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("enableAutoSnapshot")]
        public Input<bool>? EnableAutoSnapshot { get; set; }

        /// <summary>
        /// Whether the cloud disk has an automatic snapshot policy
        /// </summary>
        [Input("enableAutomatedSnapshotPolicy")]
        public Input<bool>? EnableAutomatedSnapshotPolicy { get; set; }

        /// <summary>
        /// Whether it is shared block storage.
        /// </summary>
        [Input("enableShared")]
        public Input<bool>? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not. Valid values: `on` and `off`.
        /// </summary>
        [Input("encrypted")]
        public Input<string>? Encrypted { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Disk IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Filter the results by the specified ECS instance ID.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Disk name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("operationLocks")]
        private InputList<Inputs.GetEcsDisksOperationLockInputArgs>? _operationLocks;

        /// <summary>
        /// The reasons why the disk was locked. See `operation_locks` below for details.
        /// </summary>
        public InputList<Inputs.GetEcsDisksOperationLockInputArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new InputList<Inputs.GetEcsDisksOperationLockInputArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// Payment method for disk. Valid Values: `PayAsYouGo`, `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Whether the cloud disk or local disk supports uninstallation.
        /// </summary>
        [Input("portable")]
        public Input<bool>? Portable { get; set; }

        /// <summary>
        /// The Id of resource group which the disk belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The source snapshot id.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The status of disk. Valid Values: `Attaching`, `Available`, `Creating`, `Detaching`, `In_use`, `Migrating`, `ReIniting`, `Transferring`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the disks.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Field `type` has been deprecated from provider version 1.122.0. New field `disk_type` instead.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// ID of the free zone to which the disk belongs.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetEcsDisksInvokeArgs()
        {
        }
        public static new GetEcsDisksInvokeArgs Empty => new GetEcsDisksInvokeArgs();
    }


    [OutputType]
    public sealed class GetEcsDisksResult
    {
        public readonly ImmutableArray<string> AdditionalAttributes;
        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        public readonly string? AutoSnapshotPolicyId;
        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        public readonly string? AvailabilityZone;
        /// <summary>
        /// Disk category.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        public readonly bool? DeleteAutoSnapshot;
        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        public readonly bool? DeleteWithInstance;
        /// <summary>
        /// The disk name.
        /// </summary>
        public readonly string? DiskName;
        /// <summary>
        /// The type of the disk.
        /// </summary>
        public readonly string? DiskType;
        /// <summary>
        /// A list of Ecs Disks. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEcsDisksDiskResult> Disks;
        public readonly bool? DryRun;
        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        public readonly bool? EnableAutoSnapshot;
        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        public readonly bool? EnableAutomatedSnapshotPolicy;
        public readonly bool? EnableShared;
        /// <summary>
        /// Indicate whether the disk is encrypted or not.
        /// </summary>
        public readonly string? Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The instance ID of the disk mount.
        /// </summary>
        public readonly string? InstanceId;
        /// <summary>
        /// The ID of the KMS key that is used for the cloud disk.
        /// </summary>
        public readonly string? KmsKeyId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Disk names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// The reasons why the disk was locked.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEcsDisksOperationLockResult> OperationLocks;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// Payment method for disk.
        /// </summary>
        public readonly string? PaymentType;
        /// <summary>
        /// Whether the disk is unmountable.
        /// </summary>
        public readonly bool? Portable;
        /// <summary>
        /// The Id of resource group.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        public readonly string? SnapshotId;
        /// <summary>
        /// Current status.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A map of tags assigned to the disk.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        public readonly int TotalCount;
        /// <summary>
        /// The type of the disk.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The zone id.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetEcsDisksResult(
            ImmutableArray<string> additionalAttributes,

            string? autoSnapshotPolicyId,

            string? availabilityZone,

            string? category,

            bool? deleteAutoSnapshot,

            bool? deleteWithInstance,

            string? diskName,

            string? diskType,

            ImmutableArray<Outputs.GetEcsDisksDiskResult> disks,

            bool? dryRun,

            bool? enableAutoSnapshot,

            bool? enableAutomatedSnapshotPolicy,

            bool? enableShared,

            string? encrypted,

            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            string? kmsKeyId,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetEcsDisksOperationLockResult> operationLocks,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? paymentType,

            bool? portable,

            string? resourceGroupId,

            string? snapshotId,

            string? status,

            ImmutableDictionary<string, string>? tags,

            int totalCount,

            string? type,

            string? zoneId)
        {
            AdditionalAttributes = additionalAttributes;
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            AvailabilityZone = availabilityZone;
            Category = category;
            DeleteAutoSnapshot = deleteAutoSnapshot;
            DeleteWithInstance = deleteWithInstance;
            DiskName = diskName;
            DiskType = diskType;
            Disks = disks;
            DryRun = dryRun;
            EnableAutoSnapshot = enableAutoSnapshot;
            EnableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            EnableShared = enableShared;
            Encrypted = encrypted;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            KmsKeyId = kmsKeyId;
            NameRegex = nameRegex;
            Names = names;
            OperationLocks = operationLocks;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            PaymentType = paymentType;
            Portable = portable;
            ResourceGroupId = resourceGroupId;
            SnapshotId = snapshotId;
            Status = status;
            Tags = tags;
            TotalCount = totalCount;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
