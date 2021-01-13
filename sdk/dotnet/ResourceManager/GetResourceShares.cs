// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetResourceShares
    {
        /// <summary>
        /// This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.ResourceManager.GetResourceShares.InvokeAsync(new AliCloud.ResourceManager.GetResourceSharesArgs
        ///         {
        ///             ResourceShareOwner = "Self",
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///             NameRegex = "the_resource_name",
        ///         }));
        ///         this.FirstResourceManagerResourceShareId = example.Apply(example =&gt; example.Shares[0].Id);
        ///     }
        /// 
        ///     [Output("firstResourceManagerResourceShareId")]
        ///     public Output&lt;string&gt; FirstResourceManagerResourceShareId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResourceSharesResult> InvokeAsync(GetResourceSharesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetResourceSharesResult>("alicloud:resourcemanager/getResourceShares:getResourceShares", args ?? new GetResourceSharesArgs(), options.WithVersion());
    }


    public sealed class GetResourceSharesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Resource Share IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Resource Share name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of resource share.
        /// </summary>
        [Input("resourceShareName")]
        public string? ResourceShareName { get; set; }

        /// <summary>
        /// The owner of resource share.
        /// </summary>
        [Input("resourceShareOwner", required: true)]
        public string ResourceShareOwner { get; set; } = null!;

        /// <summary>
        /// The status of resource share.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetResourceSharesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetResourceSharesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceShareName;
        public readonly string ResourceShareOwner;
        public readonly ImmutableArray<Outputs.GetResourceSharesShareResult> Shares;
        public readonly string? Status;

        [OutputConstructor]
        private GetResourceSharesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceShareName,

            string resourceShareOwner,

            ImmutableArray<Outputs.GetResourceSharesShareResult> shares,

            string? status)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceShareName = resourceShareName;
            ResourceShareOwner = resourceShareOwner;
            Shares = shares;
            Status = status;
        }
    }
}