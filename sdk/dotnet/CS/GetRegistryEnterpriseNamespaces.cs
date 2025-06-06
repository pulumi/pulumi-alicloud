// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    public static class GetRegistryEnterpriseNamespaces
    {
        /// <summary>
        /// This data source provides a list Container Registry Enterprise Edition namespaces on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.86.0+
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
        ///     // Declare the data source
        ///     var myNamespaces = AliCloud.CS.GetRegistryEnterpriseNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = "cri-xxx",
        ///         NameRegex = "my-namespace",
        ///         OutputFile = "my-namespace-json",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["output"] = myNamespaces.Apply(getRegistryEnterpriseNamespacesResult =&gt; getRegistryEnterpriseNamespacesResult.Namespaces),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRegistryEnterpriseNamespacesResult> InvokeAsync(GetRegistryEnterpriseNamespacesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegistryEnterpriseNamespacesResult>("alicloud:cs/getRegistryEnterpriseNamespaces:getRegistryEnterpriseNamespaces", args ?? new GetRegistryEnterpriseNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list Container Registry Enterprise Edition namespaces on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.86.0+
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
        ///     // Declare the data source
        ///     var myNamespaces = AliCloud.CS.GetRegistryEnterpriseNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = "cri-xxx",
        ///         NameRegex = "my-namespace",
        ///         OutputFile = "my-namespace-json",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["output"] = myNamespaces.Apply(getRegistryEnterpriseNamespacesResult =&gt; getRegistryEnterpriseNamespacesResult.Namespaces),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegistryEnterpriseNamespacesResult> Invoke(GetRegistryEnterpriseNamespacesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegistryEnterpriseNamespacesResult>("alicloud:cs/getRegistryEnterpriseNamespaces:getRegistryEnterpriseNamespaces", args ?? new GetRegistryEnterpriseNamespacesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list Container Registry Enterprise Edition namespaces on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.86.0+
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
        ///     // Declare the data source
        ///     var myNamespaces = AliCloud.CS.GetRegistryEnterpriseNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = "cri-xxx",
        ///         NameRegex = "my-namespace",
        ///         OutputFile = "my-namespace-json",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["output"] = myNamespaces.Apply(getRegistryEnterpriseNamespacesResult =&gt; getRegistryEnterpriseNamespacesResult.Namespaces),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegistryEnterpriseNamespacesResult> Invoke(GetRegistryEnterpriseNamespacesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegistryEnterpriseNamespacesResult>("alicloud:cs/getRegistryEnterpriseNamespaces:getRegistryEnterpriseNamespaces", args ?? new GetRegistryEnterpriseNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegistryEnterpriseNamespacesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ids to filter results by namespace id. Each item formats as `&lt;instance_id&gt;:&lt;namespace_name&gt;`.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by namespace name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetRegistryEnterpriseNamespacesArgs()
        {
        }
        public static new GetRegistryEnterpriseNamespacesArgs Empty => new GetRegistryEnterpriseNamespacesArgs();
    }

    public sealed class GetRegistryEnterpriseNamespacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of ids to filter results by namespace id. Each item formats as `&lt;instance_id&gt;:&lt;namespace_name&gt;`.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by namespace name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetRegistryEnterpriseNamespacesInvokeArgs()
        {
        }
        public static new GetRegistryEnterpriseNamespacesInvokeArgs Empty => new GetRegistryEnterpriseNamespacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegistryEnterpriseNamespacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of matched Container Registry Enterprise Edition namespaces. Each item formats as `&lt;instance_id&gt;:&lt;namespace_name&gt;`. Before 1.161.0, its element is a namespace uuid.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        public readonly string InstanceId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of namespace names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// A list of matched Container Registry Enterprise Edition namespaces. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegistryEnterpriseNamespacesNamespaceResult> Namespaces;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetRegistryEnterpriseNamespacesResult(
            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetRegistryEnterpriseNamespacesNamespaceResult> namespaces,

            string? outputFile)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            Namespaces = namespaces;
            OutputFile = outputFile;
        }
    }
}
