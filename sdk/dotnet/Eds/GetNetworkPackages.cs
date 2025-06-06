// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds
{
    public static class GetNetworkPackages
    {
        /// <summary>
        /// This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var defaultSimpleOfficeSite = new AliCloud.Eds.SimpleOfficeSite("default", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/12",
        ///         DesktopAccessType = "Internet",
        ///         OfficeSiteName = "example_value",
        ///     });
        /// 
        ///     var defaultNetworkPackage = new AliCloud.Eds.NetworkPackage("default", new()
        ///     {
        ///         Bandwidth = 10,
        ///         OfficeSiteId = defaultSimpleOfficeSite.Id,
        ///     });
        /// 
        ///     var @default = AliCloud.Eds.GetNetworkPackages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultNetworkPackage.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecdNetworkPackageId1"] = @default.Apply(@default =&gt; @default.Apply(getNetworkPackagesResult =&gt; getNetworkPackagesResult.Packages[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkPackagesResult> InvokeAsync(GetNetworkPackagesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkPackagesResult>("alicloud:eds/getNetworkPackages:getNetworkPackages", args ?? new GetNetworkPackagesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var defaultSimpleOfficeSite = new AliCloud.Eds.SimpleOfficeSite("default", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/12",
        ///         DesktopAccessType = "Internet",
        ///         OfficeSiteName = "example_value",
        ///     });
        /// 
        ///     var defaultNetworkPackage = new AliCloud.Eds.NetworkPackage("default", new()
        ///     {
        ///         Bandwidth = 10,
        ///         OfficeSiteId = defaultSimpleOfficeSite.Id,
        ///     });
        /// 
        ///     var @default = AliCloud.Eds.GetNetworkPackages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultNetworkPackage.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecdNetworkPackageId1"] = @default.Apply(@default =&gt; @default.Apply(getNetworkPackagesResult =&gt; getNetworkPackagesResult.Packages[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkPackagesResult> Invoke(GetNetworkPackagesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkPackagesResult>("alicloud:eds/getNetworkPackages:getNetworkPackages", args ?? new GetNetworkPackagesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var defaultSimpleOfficeSite = new AliCloud.Eds.SimpleOfficeSite("default", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/12",
        ///         DesktopAccessType = "Internet",
        ///         OfficeSiteName = "example_value",
        ///     });
        /// 
        ///     var defaultNetworkPackage = new AliCloud.Eds.NetworkPackage("default", new()
        ///     {
        ///         Bandwidth = 10,
        ///         OfficeSiteId = defaultSimpleOfficeSite.Id,
        ///     });
        /// 
        ///     var @default = AliCloud.Eds.GetNetworkPackages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultNetworkPackage.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecdNetworkPackageId1"] = @default.Apply(@default =&gt; @default.Apply(getNetworkPackagesResult =&gt; getNetworkPackagesResult.Packages[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkPackagesResult> Invoke(GetNetworkPackagesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkPackagesResult>("alicloud:eds/getNetworkPackages:getNetworkPackages", args ?? new GetNetworkPackagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkPackagesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Network Package IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetNetworkPackagesArgs()
        {
        }
        public static new GetNetworkPackagesArgs Empty => new GetNetworkPackagesArgs();
    }

    public sealed class GetNetworkPackagesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Network Package IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetNetworkPackagesInvokeArgs()
        {
        }
        public static new GetNetworkPackagesInvokeArgs Empty => new GetNetworkPackagesInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkPackagesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetNetworkPackagesPackageResult> Packages;
        public readonly string? Status;

        [OutputConstructor]
        private GetNetworkPackagesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetNetworkPackagesPackageResult> packages,

            string? status)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Packages = packages;
            Status = status;
        }
    }
}
