// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    public static class GetServerlessInstances
    {
        /// <summary>
        /// This data source provides the Mongodb Serverless Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var example = AliCloud.MongoDB.GetServerlessInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DbInstanceClass = "example_value",
        ///         DbInstanceDescription = "example_value",
        ///         NetworkType = "VPC",
        ///         ResourceGroupId = "example_value",
        ///         Status = "Running",
        ///         VpcId = "example_value",
        ///         VswitchId = "example_value",
        ///         ZoneId = "example_value",
        ///         Tags = 
        ///         {
        ///             { "Created", "MongodbServerlessInstance" },
        ///             { "For", "TF" },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbServerlessInstanceId1"] = example.Apply(getServerlessInstancesResult =&gt; getServerlessInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetServerlessInstancesResult> InvokeAsync(GetServerlessInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerlessInstancesResult>("alicloud:mongodb/getServerlessInstances:getServerlessInstances", args ?? new GetServerlessInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mongodb Serverless Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var example = AliCloud.MongoDB.GetServerlessInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DbInstanceClass = "example_value",
        ///         DbInstanceDescription = "example_value",
        ///         NetworkType = "VPC",
        ///         ResourceGroupId = "example_value",
        ///         Status = "Running",
        ///         VpcId = "example_value",
        ///         VswitchId = "example_value",
        ///         ZoneId = "example_value",
        ///         Tags = 
        ///         {
        ///             { "Created", "MongodbServerlessInstance" },
        ///             { "For", "TF" },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbServerlessInstanceId1"] = example.Apply(getServerlessInstancesResult =&gt; getServerlessInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetServerlessInstancesResult> Invoke(GetServerlessInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerlessInstancesResult>("alicloud:mongodb/getServerlessInstances:getServerlessInstances", args ?? new GetServerlessInstancesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mongodb Serverless Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var example = AliCloud.MongoDB.GetServerlessInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DbInstanceClass = "example_value",
        ///         DbInstanceDescription = "example_value",
        ///         NetworkType = "VPC",
        ///         ResourceGroupId = "example_value",
        ///         Status = "Running",
        ///         VpcId = "example_value",
        ///         VswitchId = "example_value",
        ///         ZoneId = "example_value",
        ///         Tags = 
        ///         {
        ///             { "Created", "MongodbServerlessInstance" },
        ///             { "For", "TF" },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbServerlessInstanceId1"] = example.Apply(getServerlessInstancesResult =&gt; getServerlessInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetServerlessInstancesResult> Invoke(GetServerlessInstancesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerlessInstancesResult>("alicloud:mongodb/getServerlessInstances:getServerlessInstances", args ?? new GetServerlessInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerlessInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance class.
        /// </summary>
        [Input("dbInstanceClass")]
        public string? DbInstanceClass { get; set; }

        /// <summary>
        /// The db instance description.
        /// </summary>
        [Input("dbInstanceDescription")]
        public string? DbInstanceDescription { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Serverless Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The network type of the instance. Valid values: `Classic` or `VPC`.
        /// </summary>
        [Input("networkType")]
        public string? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The instance status. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardSwitching`, `HASwitching`, `Importing`, `ImportingFromOthers`, `LinkSwitching`, `MinorVersionUpgrading`, `NodeCreating`, `NodeDeleting`, `Rebooting`, `Restoring`, `Running`, `SSLModifying`, `TDEModifying`, `TempDBInstanceCreating`, `Transing`, `TransingToOthers`, `released`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPC network.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// The id of the vswitch.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        /// <summary>
        /// The ID of the zone.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetServerlessInstancesArgs()
        {
        }
        public static new GetServerlessInstancesArgs Empty => new GetServerlessInstancesArgs();
    }

    public sealed class GetServerlessInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance class.
        /// </summary>
        [Input("dbInstanceClass")]
        public Input<string>? DbInstanceClass { get; set; }

        /// <summary>
        /// The db instance description.
        /// </summary>
        [Input("dbInstanceDescription")]
        public Input<string>? DbInstanceDescription { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Serverless Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The network type of the instance. Valid values: `Classic` or `VPC`.
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The instance status. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardSwitching`, `HASwitching`, `Importing`, `ImportingFromOthers`, `LinkSwitching`, `MinorVersionUpgrading`, `NodeCreating`, `NodeDeleting`, `Rebooting`, `Restoring`, `Running`, `SSLModifying`, `TDEModifying`, `TempDBInstanceCreating`, `Transing`, `TransingToOthers`, `released`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPC network.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The id of the vswitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The ID of the zone.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetServerlessInstancesInvokeArgs()
        {
        }
        public static new GetServerlessInstancesInvokeArgs Empty => new GetServerlessInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerlessInstancesResult
    {
        public readonly string? DbInstanceClass;
        public readonly string? DbInstanceDescription;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetServerlessInstancesInstanceResult> Instances;
        public readonly string? NetworkType;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, string>? Tags;
        public readonly string? VpcId;
        public readonly string? VswitchId;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetServerlessInstancesResult(
            string? dbInstanceClass,

            string? dbInstanceDescription,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetServerlessInstancesInstanceResult> instances,

            string? networkType,

            string? outputFile,

            string? resourceGroupId,

            string? status,

            ImmutableDictionary<string, string>? tags,

            string? vpcId,

            string? vswitchId,

            string? zoneId)
        {
            DbInstanceClass = dbInstanceClass;
            DbInstanceDescription = dbInstanceDescription;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Instances = instances;
            NetworkType = networkType;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
