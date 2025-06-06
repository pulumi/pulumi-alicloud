// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    public static class GetKubernetesAddons
    {
        /// <summary>
        /// This data source provides a list of available addons that the cluster can install.
        /// 
        /// &gt; **NOTE:** Available since v1.150.0.
        /// &gt; **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.
        /// </summary>
        public static Task<GetKubernetesAddonsResult> InvokeAsync(GetKubernetesAddonsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesAddonsResult>("alicloud:cs/getKubernetesAddons:getKubernetesAddons", args ?? new GetKubernetesAddonsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of available addons that the cluster can install.
        /// 
        /// &gt; **NOTE:** Available since v1.150.0.
        /// &gt; **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.
        /// </summary>
        public static Output<GetKubernetesAddonsResult> Invoke(GetKubernetesAddonsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesAddonsResult>("alicloud:cs/getKubernetesAddons:getKubernetesAddons", args ?? new GetKubernetesAddonsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of available addons that the cluster can install.
        /// 
        /// &gt; **NOTE:** Available since v1.150.0.
        /// &gt; **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.
        /// </summary>
        public static Output<GetKubernetesAddonsResult> Invoke(GetKubernetesAddonsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesAddonsResult>("alicloud:cs/getKubernetesAddons:getKubernetesAddons", args ?? new GetKubernetesAddonsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubernetesAddonsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure &lt;cluster_ud&gt;:&lt;addon_name&gt;.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by addon name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        public GetKubernetesAddonsArgs()
        {
        }
        public static new GetKubernetesAddonsArgs Empty => new GetKubernetesAddonsArgs();
    }

    public sealed class GetKubernetesAddonsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure &lt;cluster_ud&gt;:&lt;addon_name&gt;.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by addon name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        public GetKubernetesAddonsInvokeArgs()
        {
        }
        public static new GetKubernetesAddonsInvokeArgs Empty => new GetKubernetesAddonsInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubernetesAddonsResult
    {
        /// <summary>
        /// A list of addons.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesAddonsAddonResult> Addons;
        /// <summary>
        /// The id of kubernetes cluster.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of addon names.
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private GetKubernetesAddonsResult(
            ImmutableArray<Outputs.GetKubernetesAddonsAddonResult> addons,

            string clusterId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names)
        {
            Addons = addons;
            ClusterId = clusterId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
        }
    }
}
