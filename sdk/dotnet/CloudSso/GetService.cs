// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    public static class GetService
    {
        /// <summary>
        /// Using this data source can open Cloud Sso Service automatically.
        /// 
        /// For information about Cloud SSO and how to use it, see [What is Cloud SSO](https://www.alibabacloud.com/help/en/doc-detail/262819.html).
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region.
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
        ///     var open = AliCloud.CloudSso.GetService.Invoke(new()
        ///     {
        ///         Enable = "On",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("alicloud:cloudsso/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Using this data source can open Cloud Sso Service automatically.
        /// 
        /// For information about Cloud SSO and how to use it, see [What is Cloud SSO](https://www.alibabacloud.com/help/en/doc-detail/262819.html).
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region.
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
        ///     var open = AliCloud.CloudSso.GetService.Invoke(new()
        ///     {
        ///         Enable = "On",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("alicloud:cloudsso/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Using this data source can open Cloud Sso Service automatically.
        /// 
        /// For information about Cloud SSO and how to use it, see [What is Cloud SSO](https://www.alibabacloud.com/help/en/doc-detail/262819.html).
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region.
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
        ///     var open = AliCloud.CloudSso.GetService.Invoke(new()
        ///     {
        ///         Enable = "On",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("alicloud:cloudsso/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. Valid values: `On` or `Off`. 
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the Cloud Sso service that means you have read and agreed the [Cloud Sso Terms of Service](https://help.aliyun.com/document_detail/299998.html). When there is no directory in Cloud SSO, you can set `enable = "Off"` to turn off Cloud SSO as needed. After it is closed, you can also open it at any time.
        /// </summary>
        [Input("enable", required: true)]
        public string Enable { get; set; } = null!;

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. Valid values: `On` or `Off`. 
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the Cloud Sso service that means you have read and agreed the [Cloud Sso Terms of Service](https://help.aliyun.com/document_detail/299998.html). When there is no directory in Cloud SSO, you can set `enable = "Off"` to turn off Cloud SSO as needed. After it is closed, you can also open it at any time.
        /// </summary>
        [Input("enable", required: true)]
        public Input<string> Enable { get; set; } = null!;

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        public readonly string Enable;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The current service enable status.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetServiceResult(
            string enable,

            string id,

            string status)
        {
            Enable = enable;
            Id = id;
            Status = status;
        }
    }
}
