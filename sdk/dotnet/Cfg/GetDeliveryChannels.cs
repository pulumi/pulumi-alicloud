// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    public static class GetDeliveryChannels
    {
        /// <summary>
        /// &gt; **DEPRECATED:**  This resource is based on Config's old version OpenAPI, and it has been deprecated from version `1.173.0`.
        /// Please use new datasource alicloud.cfg.getDeliveries instead.
        /// 
        /// This data source provides the Config Delivery Channels of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.99.0+.
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
        ///     var example = AliCloud.Cfg.GetDeliveryChannels.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "cdc-49a2ad756057********",
        ///         },
        ///         NameRegex = "tftest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstConfigDeliveryChannelId"] = example.Apply(getDeliveryChannelsResult =&gt; getDeliveryChannelsResult.Channels[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDeliveryChannelsResult> InvokeAsync(GetDeliveryChannelsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeliveryChannelsResult>("alicloud:cfg/getDeliveryChannels:getDeliveryChannels", args ?? new GetDeliveryChannelsArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **DEPRECATED:**  This resource is based on Config's old version OpenAPI, and it has been deprecated from version `1.173.0`.
        /// Please use new datasource alicloud.cfg.getDeliveries instead.
        /// 
        /// This data source provides the Config Delivery Channels of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.99.0+.
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
        ///     var example = AliCloud.Cfg.GetDeliveryChannels.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "cdc-49a2ad756057********",
        ///         },
        ///         NameRegex = "tftest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstConfigDeliveryChannelId"] = example.Apply(getDeliveryChannelsResult =&gt; getDeliveryChannelsResult.Channels[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeliveryChannelsResult> Invoke(GetDeliveryChannelsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeliveryChannelsResult>("alicloud:cfg/getDeliveryChannels:getDeliveryChannels", args ?? new GetDeliveryChannelsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **DEPRECATED:**  This resource is based on Config's old version OpenAPI, and it has been deprecated from version `1.173.0`.
        /// Please use new datasource alicloud.cfg.getDeliveries instead.
        /// 
        /// This data source provides the Config Delivery Channels of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.99.0+.
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
        ///     var example = AliCloud.Cfg.GetDeliveryChannels.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "cdc-49a2ad756057********",
        ///         },
        ///         NameRegex = "tftest",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstConfigDeliveryChannelId"] = example.Apply(getDeliveryChannelsResult =&gt; getDeliveryChannelsResult.Channels[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeliveryChannelsResult> Invoke(GetDeliveryChannelsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeliveryChannelsResult>("alicloud:cfg/getDeliveryChannels:getDeliveryChannels", args ?? new GetDeliveryChannelsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeliveryChannelsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Config Delivery Channel IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by delivery channel name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
        /// </summary>
        [Input("status")]
        public int? Status { get; set; }

        public GetDeliveryChannelsArgs()
        {
        }
        public static new GetDeliveryChannelsArgs Empty => new GetDeliveryChannelsArgs();
    }

    public sealed class GetDeliveryChannelsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Config Delivery Channel IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by delivery channel name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public GetDeliveryChannelsInvokeArgs()
        {
        }
        public static new GetDeliveryChannelsInvokeArgs Empty => new GetDeliveryChannelsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeliveryChannelsResult
    {
        /// <summary>
        /// A list of Config Delivery Channels. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeliveryChannelsChannelResult> Channels;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Config Delivery Channel IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Config Delivery Channel names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the delivery channel.
        /// </summary>
        public readonly int? Status;

        [OutputConstructor]
        private GetDeliveryChannelsResult(
            ImmutableArray<Outputs.GetDeliveryChannelsChannelResult> channels,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? status)
        {
            Channels = channels;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
