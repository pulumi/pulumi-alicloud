// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// &gt; **NOTE:** Available in v1.84.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.ResourceManager.GetResourceGroups.InvokeAsync(new AliCloud.ResourceManager.GetResourceGroupsArgs
        ///         {
        ///             NameRegex = "tftest",
        ///         }));
        ///         this.FirstResourceGroupId = example.Apply(example =&gt; example.Groups[0].Id);
        ///     }
        /// 
        ///     [Output("firstResourceGroupId")]
        ///     public Output&lt;string&gt; FirstResourceGroupId { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResourceGroupsResult> InvokeAsync(GetResourceGroupsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetResourceGroupsResult>("alicloud:resourcemanager/getResourceGroups:getResourceGroups", args ?? new GetResourceGroupsArgs(), options.WithVersion());
    }


    public sealed class GetResourceGroupsArgs : Pulumi.InvokeArgs
    {
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
        /// A regex string to filter results by resource group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource group. Possible values:`Creating`,`Deleted`,`OK` and `PendingDelete`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetResourceGroupsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetResourceGroupsResult
    {
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
        /// A list of resource group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the resource group. Possible values:`Creating`,`Deleted`,`OK` and `PendingDelete`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetResourceGroupsResult(
            ImmutableArray<Outputs.GetResourceGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
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