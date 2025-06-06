// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetDedicatedHosts
    {
        /// <summary>
        /// This data source provides the ECS Dedicated Hosts of the current Alibaba Cloud user.
        ///  
        /// &gt; **NOTE:** Available since v1.91.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = new AliCloud.Ecs.DedicatedHost("default", new()
        ///     {
        ///         DedicatedHostType = "ddh.c5",
        ///         Description = "From_Terraform",
        ///         DedicatedHostName = name,
        ///         ActionOnMaintenance = "Migrate",
        ///         Tags = 
        ///         {
        ///             { "Create", "TF" },
        ///             { "For", "ddh-test" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetDedicatedHosts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDedicatedHostId0"] = ids.Apply(getDedicatedHostsResult =&gt; getDedicatedHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDedicatedHostsResult> InvokeAsync(GetDedicatedHostsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDedicatedHostsResult>("alicloud:ecs/getDedicatedHosts:getDedicatedHosts", args ?? new GetDedicatedHostsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the ECS Dedicated Hosts of the current Alibaba Cloud user.
        ///  
        /// &gt; **NOTE:** Available since v1.91.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = new AliCloud.Ecs.DedicatedHost("default", new()
        ///     {
        ///         DedicatedHostType = "ddh.c5",
        ///         Description = "From_Terraform",
        ///         DedicatedHostName = name,
        ///         ActionOnMaintenance = "Migrate",
        ///         Tags = 
        ///         {
        ///             { "Create", "TF" },
        ///             { "For", "ddh-test" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetDedicatedHosts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDedicatedHostId0"] = ids.Apply(getDedicatedHostsResult =&gt; getDedicatedHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDedicatedHostsResult> Invoke(GetDedicatedHostsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDedicatedHostsResult>("alicloud:ecs/getDedicatedHosts:getDedicatedHosts", args ?? new GetDedicatedHostsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the ECS Dedicated Hosts of the current Alibaba Cloud user.
        ///  
        /// &gt; **NOTE:** Available since v1.91.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = new AliCloud.Ecs.DedicatedHost("default", new()
        ///     {
        ///         DedicatedHostType = "ddh.c5",
        ///         Description = "From_Terraform",
        ///         DedicatedHostName = name,
        ///         ActionOnMaintenance = "Migrate",
        ///         Tags = 
        ///         {
        ///             { "Create", "TF" },
        ///             { "For", "ddh-test" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetDedicatedHosts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsDedicatedHostId0"] = ids.Apply(getDedicatedHostsResult =&gt; getDedicatedHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDedicatedHostsResult> Invoke(GetDedicatedHostsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDedicatedHostsResult>("alicloud:ecs/getDedicatedHosts:getDedicatedHosts", args ?? new GetDedicatedHostsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDedicatedHostsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of ECS Dedicated Host.
        /// </summary>
        [Input("dedicatedHostId")]
        public string? DedicatedHostId { get; set; }

        /// <summary>
        /// The name of ECS Dedicated Host.
        /// </summary>
        [Input("dedicatedHostName")]
        public string? DedicatedHostName { get; set; }

        /// <summary>
        /// The type of the dedicated host.
        /// </summary>
        [Input("dedicatedHostType")]
        public string? DedicatedHostType { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ECS Dedicated Host ids.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the ECS Dedicated Host name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("operationLocks")]
        private List<Inputs.GetDedicatedHostsOperationLockArgs>? _operationLocks;

        /// <summary>
        /// The reason why the dedicated host resource is locked. See `operation_locks` below.
        /// </summary>
        public List<Inputs.GetDedicatedHostsOperationLockArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new List<Inputs.GetDedicatedHostsOperationLockArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the ECS Dedicated Host belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the ECS Dedicated Host. Valid Value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
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
        /// The zone ID of the ECS Dedicated Host.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetDedicatedHostsArgs()
        {
        }
        public static new GetDedicatedHostsArgs Empty => new GetDedicatedHostsArgs();
    }

    public sealed class GetDedicatedHostsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of ECS Dedicated Host.
        /// </summary>
        [Input("dedicatedHostId")]
        public Input<string>? DedicatedHostId { get; set; }

        /// <summary>
        /// The name of ECS Dedicated Host.
        /// </summary>
        [Input("dedicatedHostName")]
        public Input<string>? DedicatedHostName { get; set; }

        /// <summary>
        /// The type of the dedicated host.
        /// </summary>
        [Input("dedicatedHostType")]
        public Input<string>? DedicatedHostType { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of ECS Dedicated Host ids.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the ECS Dedicated Host name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("operationLocks")]
        private InputList<Inputs.GetDedicatedHostsOperationLockInputArgs>? _operationLocks;

        /// <summary>
        /// The reason why the dedicated host resource is locked. See `operation_locks` below.
        /// </summary>
        public InputList<Inputs.GetDedicatedHostsOperationLockInputArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new InputList<Inputs.GetDedicatedHostsOperationLockInputArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the ECS Dedicated Host belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the ECS Dedicated Host. Valid Value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
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
        /// The zone ID of the ECS Dedicated Host.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetDedicatedHostsInvokeArgs()
        {
        }
        public static new GetDedicatedHostsInvokeArgs Empty => new GetDedicatedHostsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDedicatedHostsResult
    {
        /// <summary>
        /// ID of the ECS Dedicated Host.
        /// </summary>
        public readonly string? DedicatedHostId;
        /// <summary>
        /// The name of the dedicated host.
        /// </summary>
        public readonly string? DedicatedHostName;
        /// <summary>
        /// The type of the dedicated host.
        /// </summary>
        public readonly string? DedicatedHostType;
        /// <summary>
        /// A list of ECS Dedicated Hosts. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDedicatedHostsHostResult> Hosts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of ECS Dedicated Host names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// (Available since v1.123.1) The operation_locks. contains the following attribute:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDedicatedHostsOperationLockResult> OperationLocks;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the resource group to which the dedicated host belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// The service status of the dedicated host.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The tags of the dedicated host.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// The zone id of the dedicated host.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetDedicatedHostsResult(
            string? dedicatedHostId,

            string? dedicatedHostName,

            string? dedicatedHostType,

            ImmutableArray<Outputs.GetDedicatedHostsHostResult> hosts,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetDedicatedHostsOperationLockResult> operationLocks,

            string? outputFile,

            string? resourceGroupId,

            string? status,

            ImmutableDictionary<string, string>? tags,

            string? zoneId)
        {
            DedicatedHostId = dedicatedHostId;
            DedicatedHostName = dedicatedHostName;
            DedicatedHostType = dedicatedHostType;
            Hosts = hosts;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OperationLocks = operationLocks;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            ZoneId = zoneId;
        }
    }
}
