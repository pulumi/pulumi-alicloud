// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTrafficMarkingPolicies
    {
        /// <summary>
        /// This data source provides the Cen Traffic Marking Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.173.0+.
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
        ///     var ids = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         NameRegex = "^my-TrafficMarkingPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTrafficMarkingPolicyId1"] = ids.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///         ["cenTrafficMarkingPolicyId2"] = nameRegex.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTrafficMarkingPoliciesResult> InvokeAsync(GetTrafficMarkingPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficMarkingPoliciesResult>("alicloud:cen/getTrafficMarkingPolicies:getTrafficMarkingPolicies", args ?? new GetTrafficMarkingPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cen Traffic Marking Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.173.0+.
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
        ///     var ids = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         NameRegex = "^my-TrafficMarkingPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTrafficMarkingPolicyId1"] = ids.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///         ["cenTrafficMarkingPolicyId2"] = nameRegex.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficMarkingPoliciesResult> Invoke(GetTrafficMarkingPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficMarkingPoliciesResult>("alicloud:cen/getTrafficMarkingPolicies:getTrafficMarkingPolicies", args ?? new GetTrafficMarkingPoliciesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cen Traffic Marking Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.173.0+.
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
        ///     var ids = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cen.GetTrafficMarkingPolicies.Invoke(new()
        ///     {
        ///         TransitRouterId = "example_value",
        ///         NameRegex = "^my-TrafficMarkingPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTrafficMarkingPolicyId1"] = ids.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///         ["cenTrafficMarkingPolicyId2"] = nameRegex.Apply(getTrafficMarkingPoliciesResult =&gt; getTrafficMarkingPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficMarkingPoliciesResult> Invoke(GetTrafficMarkingPoliciesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficMarkingPoliciesResult>("alicloud:cen/getTrafficMarkingPolicies:getTrafficMarkingPolicies", args ?? new GetTrafficMarkingPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficMarkingPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("description")]
        public string? Description { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Traffic Marking Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Marking Policy name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.  Valid values: `Active`, `Creating`, `Deleting`, `Updating`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId", required: true)]
        public string TransitRouterId { get; set; } = null!;

        public GetTrafficMarkingPoliciesArgs()
        {
        }
        public static new GetTrafficMarkingPoliciesArgs Empty => new GetTrafficMarkingPoliciesArgs();
    }

    public sealed class GetTrafficMarkingPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Traffic Marking Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Marking Policy name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.  Valid values: `Active`, `Creating`, `Deleting`, `Updating`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId", required: true)]
        public Input<string> TransitRouterId { get; set; } = null!;

        public GetTrafficMarkingPoliciesInvokeArgs()
        {
        }
        public static new GetTrafficMarkingPoliciesInvokeArgs Empty => new GetTrafficMarkingPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficMarkingPoliciesResult
    {
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetTrafficMarkingPoliciesPolicyResult> Policies;
        public readonly string? Status;
        public readonly string TransitRouterId;

        [OutputConstructor]
        private GetTrafficMarkingPoliciesResult(
            string? description,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetTrafficMarkingPoliciesPolicyResult> policies,

            string? status,

            string transitRouterId)
        {
            Description = description;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Policies = policies;
            Status = status;
            TransitRouterId = transitRouterId;
        }
    }
}
