// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetBandwidthLimits
    {
        /// <summary>
        /// This data source provides CEN Bandwidth Limits available to the user.
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
        ///     var bwl = AliCloud.Cen.GetBandwidthLimits.Invoke(new()
        ///     {
        ///         InstanceIds = new[]
        ///         {
        ///             "cen-id1",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstCenBandwidthLimitsLocalRegionId"] = bwl.Apply(getBandwidthLimitsResult =&gt; getBandwidthLimitsResult.Limits[0]?.LocalRegionId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetBandwidthLimitsResult> InvokeAsync(GetBandwidthLimitsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBandwidthLimitsResult>("alicloud:cen/getBandwidthLimits:getBandwidthLimits", args ?? new GetBandwidthLimitsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Bandwidth Limits available to the user.
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
        ///     var bwl = AliCloud.Cen.GetBandwidthLimits.Invoke(new()
        ///     {
        ///         InstanceIds = new[]
        ///         {
        ///             "cen-id1",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstCenBandwidthLimitsLocalRegionId"] = bwl.Apply(getBandwidthLimitsResult =&gt; getBandwidthLimitsResult.Limits[0]?.LocalRegionId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBandwidthLimitsResult> Invoke(GetBandwidthLimitsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBandwidthLimitsResult>("alicloud:cen/getBandwidthLimits:getBandwidthLimits", args ?? new GetBandwidthLimitsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Bandwidth Limits available to the user.
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
        ///     var bwl = AliCloud.Cen.GetBandwidthLimits.Invoke(new()
        ///     {
        ///         InstanceIds = new[]
        ///         {
        ///             "cen-id1",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstCenBandwidthLimitsLocalRegionId"] = bwl.Apply(getBandwidthLimitsResult =&gt; getBandwidthLimitsResult.Limits[0]?.LocalRegionId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBandwidthLimitsResult> Invoke(GetBandwidthLimitsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBandwidthLimitsResult>("alicloud:cen/getBandwidthLimits:getBandwidthLimits", args ?? new GetBandwidthLimitsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBandwidthLimitsArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceIds")]
        private List<string>? _instanceIds;

        /// <summary>
        /// A list of CEN instances IDs.
        /// </summary>
        public List<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new List<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBandwidthLimitsArgs()
        {
        }
        public static new GetBandwidthLimitsArgs Empty => new GetBandwidthLimitsArgs();
    }

    public sealed class GetBandwidthLimitsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// A list of CEN instances IDs.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetBandwidthLimitsInvokeArgs()
        {
        }
        public static new GetBandwidthLimitsInvokeArgs Empty => new GetBandwidthLimitsInvokeArgs();
    }


    [OutputType]
    public sealed class GetBandwidthLimitsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> InstanceIds;
        /// <summary>
        /// A list of CEN Bandwidth Limits. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBandwidthLimitsLimitResult> Limits;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetBandwidthLimitsResult(
            string id,

            ImmutableArray<string> instanceIds,

            ImmutableArray<Outputs.GetBandwidthLimitsLimitResult> limits,

            string? outputFile)
        {
            Id = id;
            InstanceIds = instanceIds;
            Limits = limits;
            OutputFile = outputFile;
        }
    }
}
