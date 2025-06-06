// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Compute
{
    public static class GetNestServiceInstances
    {
        /// <summary>
        /// This data source provides the Compute Nest Service Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.205.0+.
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
        ///     var ids = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         NameRegex = "tf-example",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["armsPrometheisId1"] = ids.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///         ["armsPrometheisId2"] = nameRegex.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNestServiceInstancesResult> InvokeAsync(GetNestServiceInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNestServiceInstancesResult>("alicloud:compute/getNestServiceInstances:getNestServiceInstances", args ?? new GetNestServiceInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Compute Nest Service Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.205.0+.
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
        ///     var ids = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         NameRegex = "tf-example",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["armsPrometheisId1"] = ids.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///         ["armsPrometheisId2"] = nameRegex.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNestServiceInstancesResult> Invoke(GetNestServiceInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNestServiceInstancesResult>("alicloud:compute/getNestServiceInstances:getNestServiceInstances", args ?? new GetNestServiceInstancesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Compute Nest Service Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.205.0+.
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
        ///     var ids = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Compute.GetNestServiceInstances.Invoke(new()
        ///     {
        ///         NameRegex = "tf-example",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["armsPrometheisId1"] = ids.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///         ["armsPrometheisId2"] = nameRegex.Apply(getNestServiceInstancesResult =&gt; getNestServiceInstancesResult.ServiceInstances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNestServiceInstancesResult> Invoke(GetNestServiceInstancesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNestServiceInstancesResult>("alicloud:compute/getNestServiceInstances:getNestServiceInstances", args ?? new GetNestServiceInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNestServiceInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNestServiceInstancesFilterArgs>? _filters;

        /// <summary>
        /// The conditions that are used to filter. See the following `Block filter`.
        /// </summary>
        public List<Inputs.GetNestServiceInstancesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNestServiceInstancesFilterArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Service Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Service Instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the Service Instance. Valid Values: `Created`, `Deploying`, `DeployedFailed`, `Deployed`, `Upgrading`, `Deleting`, `Deleted`, `DeletedFailed`.
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

        public GetNestServiceInstancesArgs()
        {
        }
        public static new GetNestServiceInstancesArgs Empty => new GetNestServiceInstancesArgs();
    }

    public sealed class GetNestServiceInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNestServiceInstancesFilterInputArgs>? _filters;

        /// <summary>
        /// The conditions that are used to filter. See the following `Block filter`.
        /// </summary>
        public InputList<Inputs.GetNestServiceInstancesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNestServiceInstancesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Service Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Service Instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the Service Instance. Valid Values: `Created`, `Deploying`, `DeployedFailed`, `Deployed`, `Upgrading`, `Deleting`, `Deleted`, `DeletedFailed`.
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

        public GetNestServiceInstancesInvokeArgs()
        {
        }
        public static new GetNestServiceInstancesInvokeArgs Empty => new GetNestServiceInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetNestServiceInstancesResult
    {
        public readonly ImmutableArray<Outputs.GetNestServiceInstancesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Service Instance names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Service Instances. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNestServiceInstancesServiceInstanceResult> ServiceInstances;
        /// <summary>
        /// The status of the Service Instance.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The tag of the Service Instance.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetNestServiceInstancesResult(
            ImmutableArray<Outputs.GetNestServiceInstancesFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetNestServiceInstancesServiceInstanceResult> serviceInstances,

            string? status,

            ImmutableDictionary<string, string>? tags)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ServiceInstances = serviceInstances;
            Status = status;
            Tags = tags;
        }
    }
}
