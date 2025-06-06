// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall
{
    public static class GetAddressBooks
    {
        /// <summary>
        /// This data source provides the Cloud Firewall Address Books of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.178.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "tf-example";
        ///     var @default = new AliCloud.CloudFirewall.AddressBook("default", new()
        ///     {
        ///         GroupName = name,
        ///         GroupType = "ip",
        ///         Description = "tf-description",
        ///         AutoAddTagEcs = 0,
        ///         AddressLists = new[]
        ///         {
        ///             "10.21.0.0/16",
        ///             "10.168.0.0/16",
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.CloudFirewall.GetAddressBooks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudFirewallAddressBookId1"] = ids.Apply(getAddressBooksResult =&gt; getAddressBooksResult.Books[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAddressBooksResult> InvokeAsync(GetAddressBooksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAddressBooksResult>("alicloud:cloudfirewall/getAddressBooks:getAddressBooks", args ?? new GetAddressBooksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Firewall Address Books of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.178.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "tf-example";
        ///     var @default = new AliCloud.CloudFirewall.AddressBook("default", new()
        ///     {
        ///         GroupName = name,
        ///         GroupType = "ip",
        ///         Description = "tf-description",
        ///         AutoAddTagEcs = 0,
        ///         AddressLists = new[]
        ///         {
        ///             "10.21.0.0/16",
        ///             "10.168.0.0/16",
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.CloudFirewall.GetAddressBooks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudFirewallAddressBookId1"] = ids.Apply(getAddressBooksResult =&gt; getAddressBooksResult.Books[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAddressBooksResult> Invoke(GetAddressBooksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAddressBooksResult>("alicloud:cloudfirewall/getAddressBooks:getAddressBooks", args ?? new GetAddressBooksInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Firewall Address Books of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.178.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "tf-example";
        ///     var @default = new AliCloud.CloudFirewall.AddressBook("default", new()
        ///     {
        ///         GroupName = name,
        ///         GroupType = "ip",
        ///         Description = "tf-description",
        ///         AutoAddTagEcs = 0,
        ///         AddressLists = new[]
        ///         {
        ///             "10.21.0.0/16",
        ///             "10.168.0.0/16",
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.CloudFirewall.GetAddressBooks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudFirewallAddressBookId1"] = ids.Apply(getAddressBooksResult =&gt; getAddressBooksResult.Books[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAddressBooksResult> Invoke(GetAddressBooksInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAddressBooksResult>("alicloud:cloudfirewall/getAddressBooks:getAddressBooks", args ?? new GetAddressBooksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAddressBooksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
        /// **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
        /// </summary>
        [Input("groupType")]
        public string? GroupType { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Address Book IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results Address Book name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAddressBooksArgs()
        {
        }
        public static new GetAddressBooksArgs Empty => new GetAddressBooksArgs();
    }

    public sealed class GetAddressBooksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
        /// **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
        /// </summary>
        [Input("groupType")]
        public Input<string>? GroupType { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Address Book IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results Address Book name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAddressBooksInvokeArgs()
        {
        }
        public static new GetAddressBooksInvokeArgs Empty => new GetAddressBooksInvokeArgs();
    }


    [OutputType]
    public sealed class GetAddressBooksResult
    {
        /// <summary>
        /// A list of Cloud Firewall Address Books. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAddressBooksBookResult> Books;
        /// <summary>
        /// The type of the Address Book.
        /// </summary>
        public readonly string? GroupType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Address Book names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetAddressBooksResult(
            ImmutableArray<Outputs.GetAddressBooksBookResult> books,

            string? groupType,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Books = books;
            GroupType = groupType;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
