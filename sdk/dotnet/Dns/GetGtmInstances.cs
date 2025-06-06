// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetGtmInstances
    {
        /// <summary>
        /// This data source provides the Alidns Gtm Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetGtmInstances.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsGtmInstanceId1"] = ids.Apply(getGtmInstancesResult =&gt; getGtmInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetGtmInstancesResult> InvokeAsync(GetGtmInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGtmInstancesResult>("alicloud:dns/getGtmInstances:getGtmInstances", args ?? new GetGtmInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alidns Gtm Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetGtmInstances.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsGtmInstanceId1"] = ids.Apply(getGtmInstancesResult =&gt; getGtmInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetGtmInstancesResult> Invoke(GetGtmInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGtmInstancesResult>("alicloud:dns/getGtmInstances:getGtmInstances", args ?? new GetGtmInstancesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alidns Gtm Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetGtmInstances.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsGtmInstanceId1"] = ids.Apply(getGtmInstancesResult =&gt; getGtmInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetGtmInstancesResult> Invoke(GetGtmInstancesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGtmInstancesResult>("alicloud:dns/getGtmInstances:getGtmInstances", args ?? new GetGtmInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGtmInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Gtm Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        public GetGtmInstancesArgs()
        {
        }
        public static new GetGtmInstancesArgs Empty => new GetGtmInstancesArgs();
    }

    public sealed class GetGtmInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Gtm Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public GetGtmInstancesInvokeArgs()
        {
        }
        public static new GetGtmInstancesInvokeArgs Empty => new GetGtmInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGtmInstancesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetGtmInstancesInstanceResult> Instances;
        public readonly string? Lang;
        public readonly string OutputFile;
        public readonly string? ResourceGroupId;

        [OutputConstructor]
        private GetGtmInstancesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetGtmInstancesInstanceResult> instances,

            string? lang,

            string outputFile,

            string? resourceGroupId)
        {
            Id = id;
            Ids = ids;
            Instances = instances;
            Lang = lang;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
        }
    }
}
