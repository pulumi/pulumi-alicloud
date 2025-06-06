// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PrivateLink
{
    public static class GetVpcEndpointServiceUsers
    {
        /// <summary>
        /// This data source provides the Privatelink Vpc Endpoint Service Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.110.0.
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
        ///     var example = AliCloud.PrivateLink.GetVpcEndpointServiceUsers.Invoke(new()
        ///     {
        ///         ServiceId = "epsrv-gw81c6vxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstPrivatelinkVpcEndpointServiceUserId"] = example.Apply(getVpcEndpointServiceUsersResult =&gt; getVpcEndpointServiceUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetVpcEndpointServiceUsersResult> InvokeAsync(GetVpcEndpointServiceUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcEndpointServiceUsersResult>("alicloud:privatelink/getVpcEndpointServiceUsers:getVpcEndpointServiceUsers", args ?? new GetVpcEndpointServiceUsersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Privatelink Vpc Endpoint Service Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.110.0.
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
        ///     var example = AliCloud.PrivateLink.GetVpcEndpointServiceUsers.Invoke(new()
        ///     {
        ///         ServiceId = "epsrv-gw81c6vxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstPrivatelinkVpcEndpointServiceUserId"] = example.Apply(getVpcEndpointServiceUsersResult =&gt; getVpcEndpointServiceUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpcEndpointServiceUsersResult> Invoke(GetVpcEndpointServiceUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcEndpointServiceUsersResult>("alicloud:privatelink/getVpcEndpointServiceUsers:getVpcEndpointServiceUsers", args ?? new GetVpcEndpointServiceUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Privatelink Vpc Endpoint Service Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.110.0.
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
        ///     var example = AliCloud.PrivateLink.GetVpcEndpointServiceUsers.Invoke(new()
        ///     {
        ///         ServiceId = "epsrv-gw81c6vxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstPrivatelinkVpcEndpointServiceUserId"] = example.Apply(getVpcEndpointServiceUsersResult =&gt; getVpcEndpointServiceUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpcEndpointServiceUsersResult> Invoke(GetVpcEndpointServiceUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcEndpointServiceUsersResult>("alicloud:privatelink/getVpcEndpointServiceUsers:getVpcEndpointServiceUsers", args ?? new GetVpcEndpointServiceUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcEndpointServiceUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId", required: true)]
        public string ServiceId { get; set; } = null!;

        /// <summary>
        /// The Id of Ram User.
        /// </summary>
        [Input("userId")]
        public string? UserId { get; set; }

        public GetVpcEndpointServiceUsersArgs()
        {
        }
        public static new GetVpcEndpointServiceUsersArgs Empty => new GetVpcEndpointServiceUsersArgs();
    }

    public sealed class GetVpcEndpointServiceUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Id of Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        /// <summary>
        /// The Id of Ram User.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public GetVpcEndpointServiceUsersInvokeArgs()
        {
        }
        public static new GetVpcEndpointServiceUsersInvokeArgs Empty => new GetVpcEndpointServiceUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcEndpointServiceUsersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Vpc Endpoint Service User IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string ServiceId;
        /// <summary>
        /// The Id of Ram User.
        /// </summary>
        public readonly string? UserId;
        /// <summary>
        /// A list of Privatelink Vpc Endpoint Service Users. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcEndpointServiceUsersUserResult> Users;

        [OutputConstructor]
        private GetVpcEndpointServiceUsersResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string serviceId,

            string? userId,

            ImmutableArray<Outputs.GetVpcEndpointServiceUsersUserResult> users)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ServiceId = serviceId;
            UserId = userId;
            Users = users;
        }
    }
}
