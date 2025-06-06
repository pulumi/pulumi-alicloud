// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetResourceGroups
    {
        /// <summary>
        /// This data source provides resource groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.84.0.
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
        ///     var example = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
        ///     {
        ///         NameRegex = "tf",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceGroupId"] = example.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetResourceGroupsResult> InvokeAsync(GetResourceGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResourceGroupsResult>("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args ?? new GetResourceGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides resource groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.84.0.
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
        ///     var example = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
        ///     {
        ///         NameRegex = "tf",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceGroupId"] = example.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetResourceGroupsResult> Invoke(GetResourceGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceGroupsResult>("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args ?? new GetResourceGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides resource groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.84.0.
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
        ///     var example = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
        ///     {
        ///         NameRegex = "tf",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceGroupId"] = example.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetResourceGroupsResult> Invoke(GetResourceGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceGroupsResult>("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args ?? new GetResourceGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResourceGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set it to true can output more details. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of resource group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by resource group identifier.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetResourceGroupsArgs()
        {
        }
        public static new GetResourceGroupsArgs Empty => new GetResourceGroupsArgs();
    }

    public sealed class GetResourceGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set it to true can output more details. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of resource group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by resource group identifier.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetResourceGroupsInvokeArgs()
        {
        }
        public static new GetResourceGroupsInvokeArgs Empty => new GetResourceGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetResourceGroupsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// A list of resource groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResourceGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of resource group IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of resource group identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the regional resource group.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetResourceGroupsResult(
            bool? enableDetails,

            ImmutableArray<Outputs.GetResourceGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            EnableDetails = enableDetails;
            Groups = groups;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
