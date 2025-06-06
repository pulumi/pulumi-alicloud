// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetDisks
    {
        /// <summary>
        /// &gt; **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsDisks from version 1.122.0.
        /// 
        /// This data source provides the disks of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var disksDs = AliCloud.Ecs.GetDisks.Invoke(new()
        ///     {
        ///         NameRegex = "sample_disk",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDiskId"] = disksDs.Apply(getDisksResult =&gt; getDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDisksResult> InvokeAsync(GetDisksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDisksResult>("alicloud:ecs/getDisks:getDisks", args ?? new GetDisksArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsDisks from version 1.122.0.
        /// 
        /// This data source provides the disks of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var disksDs = AliCloud.Ecs.GetDisks.Invoke(new()
        ///     {
        ///         NameRegex = "sample_disk",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDiskId"] = disksDs.Apply(getDisksResult =&gt; getDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDisksResult> Invoke(GetDisksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDisksResult>("alicloud:ecs/getDisks:getDisks", args ?? new GetDisksInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsDisks from version 1.122.0.
        /// 
        /// This data source provides the disks of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var disksDs = AliCloud.Ecs.GetDisks.Invoke(new()
        ///     {
        ///         NameRegex = "sample_disk",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDiskId"] = disksDs.Apply(getDisksResult =&gt; getDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDisksResult> Invoke(GetDisksInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDisksResult>("alicloud:ecs/getDisks:getDisks", args ?? new GetDisksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDisksArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private List<string>? _additionalAttributes;
        public List<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new List<string>());
            set => _additionalAttributes = value;
        }

        [Input("autoSnapshotPolicyId")]
        public string? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk), `cloud_essd_entry`.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        [Input("deleteAutoSnapshot")]
        public bool? DeleteAutoSnapshot { get; set; }

        [Input("deleteWithInstance")]
        public bool? DeleteWithInstance { get; set; }

        [Input("diskName")]
        public string? DiskName { get; set; }

        [Input("diskType")]
        public string? DiskType { get; set; }

        [Input("dryRun")]
        public bool? DryRun { get; set; }

        [Input("enableAutoSnapshot")]
        public bool? EnableAutoSnapshot { get; set; }

        [Input("enableAutomatedSnapshotPolicy")]
        public bool? EnableAutomatedSnapshotPolicy { get; set; }

        [Input("enableShared")]
        public bool? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
        /// </summary>
        [Input("encrypted")]
        public string? Encrypted { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of disks IDs.
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

        [Input("kmsKeyId")]
        public string? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by disk name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("operationLocks")]
        private List<Inputs.GetDisksOperationLockArgs>? _operationLocks;
        public List<Inputs.GetDisksOperationLockArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new List<Inputs.GetDisksOperationLockArgs>());
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

        [Input("paymentType")]
        public string? PaymentType { get; set; }

        [Input("portable")]
        public bool? Portable { get; set; }

        /// <summary>
        /// The Id of resource group which the disk belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        [Input("snapshotId")]
        public string? SnapshotId { get; set; }

        /// <summary>
        /// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags assigned to the disks. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var disksDs = AliCloud.Ecs.GetDisks.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// Disk type. Possible values: `system` and `data`.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetDisksArgs()
        {
        }
        public static new GetDisksArgs Empty => new GetDisksArgs();
    }

    public sealed class GetDisksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private InputList<string>? _additionalAttributes;
        public InputList<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new InputList<string>());
            set => _additionalAttributes = value;
        }

        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk), `cloud_essd_entry`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("deleteAutoSnapshot")]
        public Input<bool>? DeleteAutoSnapshot { get; set; }

        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        [Input("diskName")]
        public Input<string>? DiskName { get; set; }

        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        [Input("enableAutoSnapshot")]
        public Input<bool>? EnableAutoSnapshot { get; set; }

        [Input("enableAutomatedSnapshotPolicy")]
        public Input<bool>? EnableAutomatedSnapshotPolicy { get; set; }

        [Input("enableShared")]
        public Input<bool>? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
        /// </summary>
        [Input("encrypted")]
        public Input<string>? Encrypted { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of disks IDs.
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

        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by disk name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("operationLocks")]
        private InputList<Inputs.GetDisksOperationLockInputArgs>? _operationLocks;
        public InputList<Inputs.GetDisksOperationLockInputArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new InputList<Inputs.GetDisksOperationLockInputArgs>());
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

        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        [Input("portable")]
        public Input<bool>? Portable { get; set; }

        /// <summary>
        /// The Id of resource group which the disk belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the disks. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var disksDs = AliCloud.Ecs.GetDisks.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Disk type. Possible values: `system` and `data`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetDisksInvokeArgs()
        {
        }
        public static new GetDisksInvokeArgs Empty => new GetDisksInvokeArgs();
    }


    [OutputType]
    public sealed class GetDisksResult
    {
        public readonly ImmutableArray<string> AdditionalAttributes;
        public readonly string? AutoSnapshotPolicyId;
        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        public readonly string? AvailabilityZone;
        /// <summary>
        /// Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
        /// </summary>
        public readonly string? Category;
        public readonly bool? DeleteAutoSnapshot;
        public readonly bool? DeleteWithInstance;
        public readonly string? DiskName;
        public readonly string? DiskType;
        /// <summary>
        /// A list of disks. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDisksDiskResult> Disks;
        public readonly bool? DryRun;
        public readonly bool? EnableAutoSnapshot;
        public readonly bool? EnableAutomatedSnapshotPolicy;
        public readonly bool? EnableShared;
        /// <summary>
        /// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
        /// </summary>
        public readonly string? Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// ID of the related instance. It is `null` unless the `status` is `In_use`.
        /// </summary>
        public readonly string? InstanceId;
        public readonly string? KmsKeyId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetDisksOperationLockResult> OperationLocks;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? PaymentType;
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
        /// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A map of tags assigned to the disk.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        public readonly int TotalCount;
        /// <summary>
        /// Disk type. Possible values: `system` and `data`.
        /// </summary>
        public readonly string? Type;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetDisksResult(
            ImmutableArray<string> additionalAttributes,

            string? autoSnapshotPolicyId,

            string? availabilityZone,

            string? category,

            bool? deleteAutoSnapshot,

            bool? deleteWithInstance,

            string? diskName,

            string? diskType,

            ImmutableArray<Outputs.GetDisksDiskResult> disks,

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

            ImmutableArray<Outputs.GetDisksOperationLockResult> operationLocks,

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
