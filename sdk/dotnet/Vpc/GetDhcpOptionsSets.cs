// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetDhcpOptionsSets
    {
        /// <summary>
        /// This data source provides the Vpc Dhcp Options Sets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         NameRegex = "^my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var dhcpOptionsSetName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         DhcpOptionsSetName = "my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var domainName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DomainName = "example.com",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         Status = "Available",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcDhcpOptionsSetId1"] = ids.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId2"] = nameRegex.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId3"] = dhcpOptionsSetName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId4"] = domainName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId5"] = status.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDhcpOptionsSetsResult> InvokeAsync(GetDhcpOptionsSetsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDhcpOptionsSetsResult>("alicloud:vpc/getDhcpOptionsSets:getDhcpOptionsSets", args ?? new GetDhcpOptionsSetsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Dhcp Options Sets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         NameRegex = "^my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var dhcpOptionsSetName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         DhcpOptionsSetName = "my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var domainName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DomainName = "example.com",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         Status = "Available",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcDhcpOptionsSetId1"] = ids.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId2"] = nameRegex.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId3"] = dhcpOptionsSetName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId4"] = domainName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId5"] = status.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDhcpOptionsSetsResult> Invoke(GetDhcpOptionsSetsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDhcpOptionsSetsResult>("alicloud:vpc/getDhcpOptionsSets:getDhcpOptionsSets", args ?? new GetDhcpOptionsSetsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Dhcp Options Sets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         NameRegex = "^my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var dhcpOptionsSetName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         DhcpOptionsSetName = "my-DhcpOptionsSet",
        ///     });
        /// 
        ///     var domainName = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         DomainName = "example.com",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetDhcpOptionsSets.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         Status = "Available",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcDhcpOptionsSetId1"] = ids.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId2"] = nameRegex.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId3"] = dhcpOptionsSetName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId4"] = domainName.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///         ["vpcDhcpOptionsSetId5"] = status.Apply(getDhcpOptionsSetsResult =&gt; getDhcpOptionsSetsResult.Sets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDhcpOptionsSetsResult> Invoke(GetDhcpOptionsSetsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDhcpOptionsSetsResult>("alicloud:vpc/getDhcpOptionsSets:getDhcpOptionsSets", args ?? new GetDhcpOptionsSetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDhcpOptionsSetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the DHCP options set.The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        /// </summary>
        [Input("dhcpOptionsSetName")]
        public string? DhcpOptionsSetName { get; set; }

        /// <summary>
        /// The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        /// </summary>
        [Input("domainName")]
        public string? DomainName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Dhcp Options Set IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Dhcp Options Set name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetDhcpOptionsSetsArgs()
        {
        }
        public static new GetDhcpOptionsSetsArgs Empty => new GetDhcpOptionsSetsArgs();
    }

    public sealed class GetDhcpOptionsSetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the DHCP options set.The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        /// </summary>
        [Input("dhcpOptionsSetName")]
        public Input<string>? DhcpOptionsSetName { get; set; }

        /// <summary>
        /// The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Dhcp Options Set IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Dhcp Options Set name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetDhcpOptionsSetsInvokeArgs()
        {
        }
        public static new GetDhcpOptionsSetsInvokeArgs Empty => new GetDhcpOptionsSetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDhcpOptionsSetsResult
    {
        public readonly string? DhcpOptionsSetName;
        public readonly string? DomainName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetDhcpOptionsSetsSetResult> Sets;
        public readonly string? Status;

        [OutputConstructor]
        private GetDhcpOptionsSetsResult(
            string? dhcpOptionsSetName,

            string? domainName,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetDhcpOptionsSetsSetResult> sets,

            string? status)
        {
            DhcpOptionsSetName = dhcpOptionsSetName;
            DomainName = domainName;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Sets = sets;
            Status = status;
        }
    }
}
