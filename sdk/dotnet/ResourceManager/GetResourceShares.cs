// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        ///     var example = AliCloud.ResourceManager.GetResourceShares.Invoke(new()
        ///     {
        ///         ResourceShareOwner = "Self",
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerResourceShareId"] = example.Apply(getResourceSharesResult =&gt; getResourceSharesResult.Shares[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetResourceSharesResult> InvokeAsync(GetResourceSharesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResourceSharesResult>("alicloud:resourcemanager/getResourceShares:getResourceShares", args ?? new GetResourceSharesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///     var example = AliCloud.ResourceManager.GetResourceShares.Invoke(new()
        ///     {
        ///         ResourceShareOwner = "Self",
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerResourceShareId"] = example.Apply(getResourceSharesResult =&gt; getResourceSharesResult.Shares[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetResourceSharesResult> Invoke(GetResourceSharesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceSharesResult>("alicloud:resourcemanager/getResourceShares:getResourceShares", args ?? new GetResourceSharesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///     var example = AliCloud.ResourceManager.GetResourceShares.Invoke(new()
        ///     {
        ///         ResourceShareOwner = "Self",
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerResourceShareId"] = example.Apply(getResourceSharesResult =&gt; getResourceSharesResult.Shares[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetResourceSharesResult> Invoke(GetResourceSharesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetResourceSharesResult>("alicloud:resourcemanager/getResourceShares:getResourceShares", args ?? new GetResourceSharesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResourceSharesArgs : global::Pulumi.InvokeArgs
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

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of resource share.
        /// </summary>
        [Input("resourceShareName")]
        public string? ResourceShareName { get; set; }

        /// <summary>
        /// The owner of resource share, Valid values: `Self` and `OtherAccounts`.
        /// </summary>
        [Input("resourceShareOwner", required: true)]
        public string ResourceShareOwner { get; set; } = null!;

        /// <summary>
        /// The status of resource share. Valid values: `Active`,`Deleted` and `Deleting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetResourceSharesArgs()
        {
        }
        public static new GetResourceSharesArgs Empty => new GetResourceSharesArgs();
    }

    public sealed class GetResourceSharesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Resource Share IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Resource Share name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of resource share.
        /// </summary>
        [Input("resourceShareName")]
        public Input<string>? ResourceShareName { get; set; }

        /// <summary>
        /// The owner of resource share, Valid values: `Self` and `OtherAccounts`.
        /// </summary>
        [Input("resourceShareOwner", required: true)]
        public Input<string> ResourceShareOwner { get; set; } = null!;

        /// <summary>
        /// The status of resource share. Valid values: `Active`,`Deleted` and `Deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetResourceSharesInvokeArgs()
        {
        }
        public static new GetResourceSharesInvokeArgs Empty => new GetResourceSharesInvokeArgs();
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
